package com.morpho.android.usb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.util.Log;
import android.widget.Toast;
import com.morpho.morphosmart.sdk.MorphoDevice;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class USBManager {
    public static String ACTION_USB_PERMISSION = null;
    public static final String SOFTWAREID_CBM = "CBM";
    public static final String SOFTWAREID_CBME3 = "CBM-E3";
    public static final String SOFTWAREID_CBME4 = "CBM-E4";
    public static final String SOFTWAREID_CBMV3 = "CBM-V3";
    public static final String SOFTWAREID_CBMV4 = "CBM-V4";
    public static final String SOFTWAREID_FVP = "MSO FVP";
    public static final String SOFTWAREID_FVP_C = "MSO FVP_C";
    public static final String SOFTWAREID_FVP_CL = "MSO FVP_CL";
    public static final String SOFTWAREID_MASIGMA = "MA SIGMA";
    public static final String SOFTWAREID_MEP = "MEPUSB";
    public static final String SOFTWAREID_MSO100 = "MSO100";
    public static final String SOFTWAREID_MSO1300E3 = "MSO1300-E3";
    public static final String SOFTWAREID_MSO1300E4 = "MSO1300-E4";
    public static final String SOFTWAREID_MSO1300V3 = "MSO1300-V3";
    public static final String SOFTWAREID_MSO1300V4 = "MSO1300-V4";
    public static final String SOFTWAREID_MSO1350 = "MSO1350";
    public static final String SOFTWAREID_MSO1350E3 = "MSO1350-E3";
    public static final String SOFTWAREID_MSO1350E3_CL = "MSO1350-E3 CL";
    public static final String SOFTWAREID_MSO1350E4 = "MSO1350-E4";
    public static final String SOFTWAREID_MSO1350E4_CL = "MSO1350-E4 CL";
    public static final String SOFTWAREID_MSO1350V3 = "MSO1350-V3";
    public static final String SOFTWAREID_MSO1350V3_CL = "MSO1350-V3 CL";
    public static final String SOFTWAREID_MSO1350V4 = "MSO1350-V4";
    public static final String SOFTWAREID_MSO300 = "MSO300";
    public static final String SOFTWAREID_MSO330 = "MSO330";
    public static final String SOFTWAREID_MSO331 = "MSO331";
    public static final String SOFTWAREID_MSO350 = "MSO350";
    public static boolean WakeLockEnabled;
    public static Context context;
    static volatile List<USBDevice> deviceList;
    private static USBManager instance;
    public static Map<Context, MorphoDevice.ScreenBroadcastReceiver> screenReceiverMap;
    private static final Map<USBDeviceAttributes, String> supportedDevices;
    public static boolean waitReboot;
    public String broadcastPermissionReceiverClass = null;
    Queue<MphDevice> devQueue = new LinkedList();
    private List<UsbDevice> devices_pop;
    private UsbDeviceConnection g_usbConnection;

    public native int IsUsbDaemonStarted();

    public native String getUsbDaemonVersion();

    public native void initialize();

    static {
        System.loadLibrary("NativeMorphoSmartSDK_6.50.2");
        System.loadLibrary(SOFTWAREID_MSO100);
        System.loadLibrary("usb1.0");
        instance = null;
        deviceList = null;
        context = null;
        ACTION_USB_PERMISSION = "com.morpho.android.usb.USB_PERMISSION";
        WakeLockEnabled = false;
        waitReboot = false;
        supportedDevices = new HashMap();
        supportedDevices.put(new USBDeviceAttributes(1947, 35), SOFTWAREID_MSO100);
        supportedDevices.put(new USBDeviceAttributes(1947, 36), SOFTWAREID_MSO300);
        supportedDevices.put(new USBDeviceAttributes(1947, 38), SOFTWAREID_MSO350);
        supportedDevices.put(new USBDeviceAttributes(1947, 71), SOFTWAREID_CBM);
        supportedDevices.put(new USBDeviceAttributes(1947, 82), SOFTWAREID_MSO1350);
        supportedDevices.put(new USBDeviceAttributes(8797, 1), SOFTWAREID_FVP);
        supportedDevices.put(new USBDeviceAttributes(8797, 2), SOFTWAREID_FVP_C);
        supportedDevices.put(new USBDeviceAttributes(8797, 3), SOFTWAREID_FVP_CL);
        supportedDevices.put(new USBDeviceAttributes(8797, 7), SOFTWAREID_MEP);
        supportedDevices.put(new USBDeviceAttributes(8797, 8), SOFTWAREID_CBME3);
        supportedDevices.put(new USBDeviceAttributes(8797, 9), SOFTWAREID_CBMV3);
        supportedDevices.put(new USBDeviceAttributes(8797, 22), SOFTWAREID_CBME4);
        supportedDevices.put(new USBDeviceAttributes(8797, 23), SOFTWAREID_CBMV4);
        supportedDevices.put(new USBDeviceAttributes(8797, 10), SOFTWAREID_MSO1300E3);
        supportedDevices.put(new USBDeviceAttributes(8797, 11), SOFTWAREID_MSO1300V3);
        supportedDevices.put(new USBDeviceAttributes(8797, 24), SOFTWAREID_MSO1300E4);
        supportedDevices.put(new USBDeviceAttributes(8797, 25), SOFTWAREID_MSO1300V4);
        supportedDevices.put(new USBDeviceAttributes(8797, 12), SOFTWAREID_MSO1350E3);
        supportedDevices.put(new USBDeviceAttributes(8797, 13), SOFTWAREID_MSO1350V3);
        supportedDevices.put(new USBDeviceAttributes(8797, 26), SOFTWAREID_MSO1350E4);
        supportedDevices.put(new USBDeviceAttributes(8797, 27), SOFTWAREID_MSO1350V4);
        supportedDevices.put(new USBDeviceAttributes(8797, 32), SOFTWAREID_MSO1350E3_CL);
        supportedDevices.put(new USBDeviceAttributes(8797, 33), SOFTWAREID_MSO1350V3_CL);
        supportedDevices.put(new USBDeviceAttributes(8797, 34), SOFTWAREID_MSO1350E4_CL);
        supportedDevices.put(new USBDeviceAttributes(8797, 61467), SOFTWAREID_MSO331);
        supportedDevices.put(new USBDeviceAttributes(8797, 61466), SOFTWAREID_MSO330);
        supportedDevices.put(new USBDeviceAttributes(8797, 14), SOFTWAREID_MASIGMA);
        screenReceiverMap = new HashMap();
    }

    class MphDevice {
        private String devName;
        private UsbDevice usbDevice;
        private int usbEvent;

        public MphDevice() {
            this.devName = null;
            this.usbDevice = null;
            this.usbEvent = 0;
        }

        public MphDevice(String devName, UsbDevice usbDevice, int usbEvent) {
            this.devName = devName;
            this.usbDevice = usbDevice;
            this.usbEvent = usbEvent;
        }

        public String getDevName() {
            return this.devName;
        }

        public UsbDevice getUsbDevice() {
            return this.usbDevice;
        }

        public int getUsbEvent() {
            return this.usbEvent;
        }
    }

    public static synchronized USBManager getInstance() {
        if (instance == null) {
            instance = new USBManager();
        }
        return instance;
    }

    private USBManager() {
    }

    public void setBroadcastPermissionReceiverClass(String packageName) {
        this.broadcastPermissionReceiverClass = packageName;
    }

    public void requestUSBPermission(Context context2, UsbManager usbManager, UsbDevice usbDevice) {
        PendingIntent pendingIntent = null;
        Intent usbPermissionIntent = new Intent(ACTION_USB_PERMISSION);
        try {
            try {
                if (this.broadcastPermissionReceiverClass != null && !this.broadcastPermissionReceiverClass.isEmpty()) {
                    Class<?> permissionActivityClass = Class.forName(this.broadcastPermissionReceiverClass);
                    usbPermissionIntent.setClass(context2, permissionActivityClass);
                    pendingIntent = PendingIntent.getBroadcast(context2, 0, usbPermissionIntent, 33554432);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("MORPHO_USB", "Unable to resolve Broadcast receiver class " + e.getMessage());
                if (0 == 0) {
                }
            }
            usbManager.requestPermission(usbDevice, pendingIntent);
        } finally {
            if (0 == 0) {
                PendingIntent.getBroadcast(context2, 0, usbPermissionIntent, 67108864);
            }
        }
    }

    public int initialize(Activity context2, String packagePath) {
        Log.i("MORPHO_USB", "context : " + context2);
        if (context2 == null) {
            return -5;
        }
        return initialize(context2.getApplicationContext(), packagePath);
    }

    public void checkWakeLockPermission(Context context2) {
        PackageManager pm = context2.getPackageManager();
        int hasPerm = pm.checkPermission("android.permission.WAKE_LOCK", context2.getPackageName());
        if (hasPerm != 0) {
            Log.i("MORPHO_USB", "WAKE_LOCK permission was not granted");
            Toast.makeText(context2.getApplicationContext(), "MorphoSmart SDK, WAKE_LOCK permission was not granted", 1).show();
        } else {
            Log.i("MORPHO_USB", "WAKE_LOCK permission was granted");
        }
    }

    public static void unRegister(Context ctx, MorphoDevice.ScreenBroadcastReceiver receiver) {
        for (Context key : screenReceiverMap.keySet()) {
            if (key == ctx) {
                try {
                    ctx.unregisterReceiver(receiver);
                } catch (IllegalArgumentException e) {
                    Log.e("USBManager unregisterReceiver", e.getMessage());
                }
                screenReceiverMap.remove(key);
            }
        }
    }

    public int initialize(Context context2, String packagePath, boolean enableWakeLock) {
        if (context2 == null) {
            return -5;
        }
        checkWakeLockPermission(context2);
        WakeLockEnabled = enableWakeLock;
        return initialize(context2, packagePath);
    }

    public int initialize(Context context2, String packagePath) {
        initialize();
        if (context2 == null) {
            return -5;
        }
        Log.i("MORPHO_USB", "context : " + context2);
        context = context2;
        ACTION_USB_PERMISSION = packagePath;
        if (IsUsbDaemonStarted() == 1) {
            Log.e("MORPHO_USB", "Service started");
            return 0;
        }
        Log.e("MORPHO_USB", "Service not started");
        if (deviceList == null) {
            deviceList = new LinkedList();
        }
        clearDeviceList();
        grantePermission();
        return 0;
    }

    public void closeUsbDeviceConnection() {
        Log.i("USBManager", "closeUsbDeviceConnection : Start");
        if (this.g_usbConnection != null) {
            Log.i("USBManager", "closeUsbDeviceConnection : Closing Connection ... ");
            this.g_usbConnection.close();
            this.g_usbConnection = null;
        }
        Log.i("USBManager", "closeUsbDeviceConnection : End");
    }

    public int getDeviceInformations(String serialNumber, int[] bus, int[] address, int[] fd) {
        USBManager uSBManager = this;
        Context context2 = context;
        if (context2 == null) {
            return -1;
        }
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        HashMap<String, UsbDevice> usbDeviceList = usbManager.getDeviceList();
        for (UsbDevice usbDevice : usbDeviceList.values()) {
            USBDeviceAttributes l_attr = new USBDeviceAttributes(usbDevice.getVendorId(), usbDevice.getProductId());
            if (!uSBManager.isSupported(l_attr)) {
                uSBManager = this;
            } else {
                boolean hasPermission = usbManager.hasPermission(usbDevice);
                Log.i("MORPHO_USB", "getDeviceInformations : serialNumber " + serialNumber + " hasPermission = " + hasPermission);
                if (!hasPermission) {
                    uSBManager = this;
                } else {
                    UsbDeviceConnection connection = usbManager.openDevice(usbDevice);
                    if (connection == null) {
                        uSBManager = this;
                    } else {
                        String sn = connection.getSerial();
                        if (sn.equalsIgnoreCase(serialNumber)) {
                            uSBManager.g_usbConnection = connection;
                            int sensorFileDescriptor = connection.getFileDescriptor();
                            String name = usbDevice.getDeviceName();
                            String[] elts = name.split("/");
                            if (elts.length < 5) {
                                uSBManager = this;
                            } else {
                                int sensorBus = Integer.parseInt(elts[4].toString());
                                int sensorAddress = Integer.parseInt(elts[5].toString());
                                bus[0] = sensorBus;
                                address[0] = sensorAddress;
                                fd[0] = sensorFileDescriptor;
                                return 0;
                            }
                        } else {
                            connection.close();
                            uSBManager = this;
                        }
                    }
                }
            }
        }
        return -3;
    }

    public int getFileDescriptor(int bus, int deviceAddress) {
        Context context2 = context;
        if (context2 == null) {
            return -1;
        }
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        HashMap<String, UsbDevice> usbdeviceList = usbManager.getDeviceList();
        for (UsbDevice device : usbdeviceList.values()) {
            Log.i("getFileDescriptor", "getDeviceId : " + device.getDeviceId());
            USBDeviceAttributes l_attr = new USBDeviceAttributes(device.getVendorId(), device.getProductId());
            if (isSupported(l_attr)) {
                String deviceName = String.format("/dev/bus/usb/%03d/%03d", Integer.valueOf(bus), Integer.valueOf(deviceAddress));
                if (!deviceName.equalsIgnoreCase(device.getDeviceName())) {
                    continue;
                } else if (usbManager.hasPermission(device)) {
                    UsbDeviceConnection usbDeviceConnection = usbManager.openDevice(device);
                    if (usbDeviceConnection != null) {
                        return usbDeviceConnection.getFileDescriptor();
                    }
                } else {
                    return -2;
                }
            }
        }
        return -3;
    }

    private void clearDeviceList() {
        try {
            if (deviceList != null) {
                for (int i = 0; i < deviceList.size(); i++) {
                    deviceList.get(i).close();
                }
            }
        } catch (Exception e) {
            Log.e("USBManager clearDeviceList", e.getMessage());
        }
        if (deviceList != null) {
            deviceList.clear();
        }
    }

    private int grantePermission() {
        Context context2 = context;
        if (context2 != null) {
            UsbManager usbManager = (UsbManager) context2.getSystemService("usb");
            HashMap<String, UsbDevice> usbDeviceList = usbManager.getDeviceList();
            for (UsbDevice usbDevice : usbDeviceList.values()) {
                USBDeviceAttributes l_attr = new USBDeviceAttributes(usbDevice.getVendorId(), usbDevice.getProductId());
                if (isSupported(l_attr)) {
                    boolean hasPermission = usbManager.hasPermission(usbDevice);
                    if (!hasPermission) {
                        Log.i("MORPHO_USB", "Request permission for using the device");
                        requestUSBPermission(context2, usbManager, usbDevice);
                    }
                }
            }
            return 0;
        }
        return 0;
    }

    public boolean isDevicesHasPermission() {
        if (IsUsbDaemonStarted() == 1) {
            return true;
        }
        boolean hasPermission = false;
        Context context2 = context;
        if (context2 != null) {
            UsbManager usbManager = (UsbManager) context2.getSystemService("usb");
            HashMap<String, UsbDevice> usbDeviceList = usbManager.getDeviceList();
            if (usbDeviceList.isEmpty()) {
                return true;
            }
            hasPermission = true;
            for (UsbDevice usbDevice : usbDeviceList.values()) {
                USBDeviceAttributes l_attr = new USBDeviceAttributes(usbDevice.getDeviceName(), usbDevice.getVendorId(), usbDevice.getProductId(), 1);
                if (isSupported(l_attr)) {
                    boolean tmp = usbManager.hasPermission(usbDevice);
                    if (!tmp) {
                        hasPermission = false;
                    }
                }
            }
        }
        return hasPermission;
    }

    public int scanDevice() {
        if (IsUsbDaemonStarted() == 1) {
            Log.e("MORPHO_USB", "Service started");
            return 1;
        }
        Context context2 = context;
        if (context2 != null) {
            UsbManager usbManager = (UsbManager) context2.getSystemService("usb");
            HashMap<String, UsbDevice> usbDeviceList = usbManager.getDeviceList();
            Log.i("MORPHO_USB", "usbDeviceList.size() = " + usbDeviceList.size());
            HashMap<String, UsbDevice> usbDeviceList2 = usbManager.getDeviceList();
            for (UsbDevice usbDevice : usbDeviceList2.values()) {
                USBDeviceAttributes l_attr = new USBDeviceAttributes(usbDevice.getDeviceName(), usbDevice.getVendorId(), usbDevice.getProductId(), 1);
                if (isSupported(l_attr)) {
                    Log.i("MORPHO_USB", "Supported device : Vendor Id = " + usbDevice.getVendorId() + ", product Id = " + usbDevice.getProductId());
                    return 1;
                }
            }
            return 0;
        }
        return 0;
    }

    public synchronized String getDeviceModel(USBDeviceAttributes attribs) {
        if (attribs == null) {
            return "";
        }
        Set<Map.Entry<USBDeviceAttributes, String>> entrySet = supportedDevices.entrySet();
        for (Map.Entry<USBDeviceAttributes, String> entry : entrySet) {
            USBDeviceAttributes supportedAttribs = entry.getKey();
            if (supportedAttribs.getVendorId() == attribs.getVendorId() && supportedAttribs.getProductId() == attribs.getProductId()) {
                return entry.getValue();
            }
        }
        return "";
    }

    public synchronized boolean isSupported(USBDeviceAttributes attribs) {
        if (attribs == null) {
            return false;
        }
        for (USBDeviceAttributes supportedAttribs : supportedDevices.keySet()) {
            if (supportedAttribs.getVendorId() == attribs.getVendorId() && supportedAttribs.getProductId() == attribs.getProductId()) {
                attribs.setDeviceType(supportedAttribs.getDeviceType());
                return true;
            }
        }
        return false;
    }

    private synchronized int addGrantedDevice(UsbDevice device, int usbInterfaceNum) {
        int ret;
        if (device == null) {
            return -6;
        }
        UsbManager manager = (UsbManager) context.getSystemService("usb");
        USBDeviceAttributes attr = new USBDeviceAttributes(device.getDeviceName(), device.getVendorId(), device.getProductId(), usbInterfaceNum);
        USBDevice usbDevice = new USBDevice(attr, manager, device);
        try {
            ret = usbDevice.open();
            if (ret == 0) {
                if (deviceList == null) {
                    deviceList = new LinkedList();
                }
                deviceList.add(usbDevice);
            }
        } catch (Exception e) {
            Log.e("MORPHO_USB", e.getMessage());
            ret = -6;
        }
        return ret;
    }

    public synchronized USBDeviceAttributes[] enumerate() {
        if (context == null) {
            return null;
        }
        UsbManager manager = (UsbManager) context.getSystemService("usb");
        HashMap<String, UsbDevice> usbdeviceList = manager.getDeviceList();
        if (usbdeviceList.isEmpty()) {
            return null;
        }
        USBDeviceAttributes[] attrList = new USBDeviceAttributes[usbdeviceList.size()];
        int i = 0;
        int usbInterfaceNum = -1;
        clearDeviceList();
        for (UsbDevice device : usbdeviceList.values()) {
            int count = device.getInterfaceCount();
            int j = 0;
            while (true) {
                if (j >= count) {
                    break;
                }
                if ((device.getInterface(j).getInterfaceClass() != 2 && device.getInterface(j).getInterfaceClass() != 10) || device.getInterface(j).getEndpointCount() != 2) {
                    j++;
                } else {
                    usbInterfaceNum = j;
                    break;
                }
            }
            if (usbInterfaceNum != -1) {
                USBDeviceAttributes attrs = new USBDeviceAttributes(device.getDeviceName(), device.getVendorId(), device.getProductId(), usbInterfaceNum);
                if (isSupported(attrs)) {
                    if (manager.hasPermission(device)) {
                        int ret = addGrantedDevice(device, usbInterfaceNum);
                        if (ret == 0) {
                            attrList[i] = attrs;
                            attrs.setFreindlyName(getDeviceModel(attrs));
                            i++;
                        }
                    } else {
                        Log.i("MORPHO_USB", "no permission for device " + device.getDeviceName());
                    }
                    usbInterfaceNum = -1;
                }
            }
        }
        return attrList;
    }

    public synchronized void listDevices() throws Exception {
        USBDeviceAttributes[] attribsList = enumerate();
        if (deviceList != null && attribsList != null) {
            for (int i = 0; i < deviceList.size(); i++) {
                deviceList.get(i).CreateInterface(attribsList[i].getInterfaceNumber());
            }
        }
    }

    public synchronized int getNbDevices() throws Exception {
        if (deviceList == null) {
            return 0;
        }
        return deviceList.size();
    }

    public USBDevice getDevice(int index) {
        if (deviceList != null && deviceList.size() > index) {
            return deviceList.get(index);
        }
        return null;
    }
}
