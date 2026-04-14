package com.morpho.android.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class USBDevice {
    public static UsbManager mManager = null;
    public USBDeviceAttributes mAttributes;
    public UsbDevice mDevice;
    public UsbDeviceConnection mConnection = null;
    public UsbEndpoint mEndpointIn = null;
    public UsbEndpoint mEndpointOut = null;
    public int mMaxPacketOutSize = 0;
    public int mMaxPacketInSize = 0;
    public UsbInterface mInterface = null;
    public String mFreindlyName = "";
    private byte[] mDeviceDescriptor = null;

    public synchronized boolean hasPermission() {
        if (this.mDevice != null && mManager != null) {
            return mManager.hasPermission(this.mDevice);
        }
        return false;
    }

    public synchronized int open() throws Exception {
        if (this.mDevice == null || mManager == null) {
            throw new Exception("Failuire to open device: either usb manager or connection null");
        }
        this.mInterface = this.mDevice.getInterface(getAttributes().getInterfaceNumber());
        this.mConnection = mManager.openDevice(this.mDevice);
        if (this.mConnection != null) {
            this.mConnection.claimInterface(this.mInterface, true);
            Log.d("MORPHO_USB", "device opened !");
            return 0;
        }
        Log.d("MORPHO_USB", "device not connected !");
        return -6;
    }

    public synchronized UsbInterface CreateInterface(int interfaceNumber) {
        return this.mDevice.getInterface(interfaceNumber);
    }

    public USBDevice(USBDeviceAttributes iAttributes, UsbManager iManager, UsbDevice iDevice) {
        this.mAttributes = null;
        this.mDevice = null;
        this.mDevice = iDevice;
        this.mAttributes = iAttributes;
        mManager = iManager;
    }

    public synchronized String getProductString() throws Exception {
        if (getAttributes().getProduct() == null) {
            byte[] desc = getDeviceDescriptor();
            byte[] pdt = new byte[64];
            int idx = desc[15];
            getStringDescriptor(pdt, idx);
            getAttributes().setProduct(convertDescriptorUnicodeLEToString(pdt));
        }
        return getAttributes().getProduct();
    }

    private synchronized String convertDescriptorUnicodeLEToString(byte[] buffer) {
        byte[] subStr;
        try {
            int bufferLength = buffer[0];
            subStr = new byte[bufferLength - 2];
            System.arraycopy(buffer, 2, subStr, 0, bufferLength - 2);
            return new String(subStr, "UTF-16LE");
        } catch (Exception ex) {
            Log.e("USBDevice.convertDescriptorUnicodeLEToString", ex.getMessage());
            return "not available";
        }
    }

    public synchronized int findEndPoint() {
        if (this.mInterface == null) {
            return -3;
        }
        int count = this.mInterface.getEndpointCount();
        if (count != 2) {
            return -2;
        }
        UsbEndpoint lEndPoint0 = this.mInterface.getEndpoint(0);
        UsbEndpoint lEndPoint1 = this.mInterface.getEndpoint(1);
        if ((lEndPoint0.getAttributes() & 3) == 2 && (lEndPoint1.getAttributes() & 3) == 2) {
            if ((lEndPoint0.getAddress() & 128) != 0 && (lEndPoint1.getAddress() & 128) == 0) {
                this.mEndpointOut = lEndPoint1;
                this.mEndpointIn = lEndPoint0;
                this.mMaxPacketInSize = lEndPoint0.getMaxPacketSize();
                this.mMaxPacketOutSize = lEndPoint1.getMaxPacketSize();
                return 0;
            }
            if ((lEndPoint0.getAddress() & 128) == 0 && (lEndPoint1.getAddress() & 128) != 0) {
                this.mEndpointOut = lEndPoint0;
                this.mEndpointIn = lEndPoint1;
                this.mMaxPacketInSize = lEndPoint1.getMaxPacketSize();
                this.mMaxPacketOutSize = lEndPoint0.getMaxPacketSize();
                return 0;
            }
        }
        return -1;
    }

    public synchronized USBDeviceAttributes getAttributes() {
        return this.mAttributes;
    }

    private synchronized int getStringDescriptor(byte[] buffer, int index) throws Exception {
        return getDescriptor(buffer, 768, index);
    }

    private synchronized byte[] getDeviceDescriptor() throws Exception {
        if (this.mDeviceDescriptor == null) {
            this.mDeviceDescriptor = new byte[18];
            getDescriptor(this.mDeviceDescriptor, 256, 1);
        }
        return this.mDeviceDescriptor;
    }

    private synchronized int getDescriptor(byte[] buffer, int descType, int index) throws Exception {
        int res;
        if (buffer != null) {
            if (this.mConnection != null && this.mInterface != null) {
                if (!this.mConnection.claimInterface(this.mInterface, true)) {
                    throw new Exception("Could not claim the USB device interface");
                }
                int length = buffer.length;
                byte[] desc = new byte[buffer.length];
                res = this.mConnection.controlTransfer(128, 6, descType | index, USBConstants.USB_DEVICE_DESCRIPTOR_LANGUAGE_ENGLISH, desc, length, 1000);
                if (res < 0) {
                    throw new Exception("getDescriptor operation is unsuccessful. Descriptor index=" + index + "Descriptor type=" + descType);
                }
                System.arraycopy(desc, 0, buffer, 0, desc.length);
            }
        }
        throw new Exception("Error get the feature report from the device: either connection or interface null");
        //return res;
    }

    public synchronized int close() {
        try {
            if (this.mConnection != null) {
                this.mConnection.releaseInterface(this.mInterface);
                this.mConnection.close();
                this.mInterface = null;
                this.mConnection = null;
            }
        } catch (Exception e) {
            Log.e("USBDevice close", e.getMessage());
            return -5;
        }
        return 0;
    }

    public synchronized UsbInterface claimInterface() {
        return this.mInterface;
    }

    public synchronized int write(byte[] data, int datasize, int timeout) {
        byte[] data2;
        int len;
        if (this.mConnection == null) {
            return -6;
        }
        this.mConnection.claimInterface(this.mInterface, true);
        long now = System.currentTimeMillis();
        long writeTimeout = ((long) timeout) + now;
        int offset = 0;
        while (true) {
            if (offset < datasize) {
                if (datasize - offset > 16000) {
                    len = 16000;
                } else {
                    int len2 = datasize - offset;
                    len = len2;
                }
                data2 = data;
                int timeout2 = timeout;
                int ret = this.mConnection.bulkTransfer(this.mEndpointOut, data2, offset, len, timeout2);
                if (ret <= 0) {
                    offset = ret;
                    break;
                }
                if (ret == datasize - offset) {
                    offset = ret;
                    break;
                }
                if (timeout2 != 0 && System.currentTimeMillis() > writeTimeout) {
                    offset = -391;
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                offset += ret;
                data = data2;
                timeout = timeout2;
            } else {
                data2 = data;
                break;
            }
        }
        int ret2 = offset;
        if (ret2 > 0 && datasize > 0 && datasize % this.mMaxPacketOutSize == 0) {
            Log.d("MORPHO_USB", "Send ZLP ..");
            ret2 = this.mConnection.bulkTransfer(this.mEndpointOut, data2, 0, 1000);
            if (ret2 < 0) {
                this.mConnection.releaseInterface(this.mInterface);
                return -7;
            }
        }
        this.mConnection.releaseInterface(this.mInterface);
        return ret2;
    }

    public synchronized int read(byte[] data, int datasize, int timeout) {
        if (this.mConnection == null) {
            return -6;
        }
        this.mConnection.claimInterface(this.mInterface, true);
        if (this.mEndpointIn == null) {
            Log.e("MORPHO_USB", "null read endpoint !");
        }
        int ret = this.mConnection.bulkTransfer(this.mEndpointIn, data, datasize, timeout);
        this.mConnection.releaseInterface(this.mInterface);
        return ret;
    }

    public synchronized int getStringSimple(byte[] buffer, int index) {
        try {
            return getStringDescriptor(buffer, index);
        } catch (Exception e) {
            Log.e("USBDevice getStringSimple", e.getMessage());
            return -4;
        }
    }

    public synchronized String getSerialNumberString() {
        if (this.mConnection != null) {
            return this.mConnection.getSerial();
        }
        return "Serial not available";
    }

    public synchronized int getMaxPacketInSize() {
        return this.mMaxPacketInSize;
    }

    public int getMaxPacketOutSize() {
        return this.mMaxPacketOutSize;
    }
}
