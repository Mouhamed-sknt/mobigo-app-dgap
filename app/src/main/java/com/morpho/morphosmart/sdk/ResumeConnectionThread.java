package com.morpho.morphosmart.sdk;

import java.util.Observer;

/* JADX INFO: compiled from: MorphoDevice.java */
/* JADX INFO: loaded from: classes.dex */
class ResumeConnectionThread extends Thread {
    private static final int DEFAULT_REBOOT_TIMEOUT = 30000;
    private static final int INFINITE = 65535000;
    private String pipeIP;
    private int pipePort;
    private int pipeTimeout;
    private int uartBaudrate;
    private String uartPort;
    private boolean openDeviceStat = false;
    private MorphoDevice device = null;
    private Observer observer = null;
    private String deviceName = "";
    private boolean deviceOpenedWithFD = false;
    private boolean deviceOpenedWithPipe = false;
    private IMsoPipe pipeCallBack = null;
    private boolean deviceOpenedWithUart = false;
    private boolean isTunnelingMode = false;
    private boolean isOfferedSecurityMode = false;
    private IMsoSecu _msoSecu = null;
    private byte[] _hostCertificate = null;
    private int timeOut = DEFAULT_REBOOT_TIMEOUT;

    ResumeConnectionThread() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r2 = r23.device.openUsbDevice(r23.deviceName, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018c, code lost:
    
        if (r2 != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0190, code lost:
    
        if (r23.isOfferedSecurityMode == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        r2 = r23.device.offeredSecuOpen(r23._msoSecu);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019d, code lost:
    
        if (r23.isTunnelingMode == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a9, code lost:
    
        r5 = r23.device.tunnelingOpen(r23._msoSecu, r23._hostCertificate);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ab, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ad, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b0, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b1, code lost:
    
        if (r5 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b3, code lost:
    
        r23.openDeviceStat = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b7, code lost:
    
        if (r23.observer == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b9, code lost:
    
        r23.observer.update(null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c4, code lost:
    
        java.lang.Thread.sleep(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c8, code lost:
    
        r9 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d5, code lost:
    
        if (r23.observer != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d7, code lost:
    
        r23.observer.update(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e0, code lost:
    
        if (r23.openDeviceStat == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e6, code lost:
    
        r23.observer.update(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ed, code lost:
    
        r0 = r23.device.ping();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f3, code lost:
    
        if (r0 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f7, code lost:
    
        if (r23.deviceOpenedWithPipe == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f9, code lost:
    
        r0 = r23.device.openDevicePipe(r23.pipeCallBack, r23.pipeIP, r23.pipePort, r23.deviceName, r23.pipeTimeout);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0216, code lost:
    
        r0 = r23.device.openDeviceWithUart(r23.uartPort, r23.uartBaudrate);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0220, code lost:
    
        if (r0 != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0224, code lost:
    
        if (r23.observer == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0226, code lost:
    
        r23.observer.update(null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0230, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0234, code lost:
    
        if (r23.observer == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0236, code lost:
    
        r23.observer.update(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x023b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        com.morpho.android.usb.USBManager.getInstance().initialize(com.morpho.android.usb.USBManager.context, com.morpho.android.usb.USBManager.ACTION_USB_PERMISSION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
    
        if (r23.observer == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r23.observer.update(null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        if (r23.deviceOpenedWithPipe != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0117, code lost:
    
        if (r23.deviceOpenedWithUart == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0122, code lost:
    
        if ((r9 - r7) < r23.timeOut) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0128, code lost:
    
        if (r23.deviceOpenedWithFD == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (com.morpho.android.usb.USBManager.getInstance().IsUsbDaemonStarted() != 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        r0 = new int[]{-1};
        r11 = new int[]{-1};
        r12 = new int[]{-1};
        r14 = com.morpho.android.usb.USBManager.getInstance().getDeviceInformations(r23.deviceName, r0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014e, code lost:
    
        if (r12[0] == (-1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        r14 = r23.device.openUsbDeviceFD(r0[0], r11[0], r12[0], 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015d, code lost:
    
        if (r14 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
    
        if (r23.isOfferedSecurityMode == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0163, code lost:
    
        r14 = r23.device.offeredSecuOpen(r23._msoSecu);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        if (r23.isTunnelingMode == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017a, code lost:
    
        r5 = r23.device.tunnelingOpen(r23._msoSecu, r23._hostCertificate);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017e, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d7  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.morpho.morphosmart.sdk.ResumeConnectionThread.run():void");
    }

    public void setDevice(MorphoDevice device) {
        this.device = device;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceOpenWithFD(boolean openfd) {
        this.deviceOpenedWithFD = openfd;
    }

    public void setDeviceOpenWithPipe(boolean openpipe) {
        this.deviceOpenedWithPipe = openpipe;
    }

    public void setDeviceOpenWithUart(boolean openuart) {
        this.deviceOpenedWithUart = openuart;
    }

    public void setTimeOut(int timeOut) {
        if (timeOut != 0) {
            if (timeOut * 1000 > DEFAULT_REBOOT_TIMEOUT) {
                this.timeOut = timeOut * 1000;
            } else {
                this.timeOut = DEFAULT_REBOOT_TIMEOUT;
            }
        }
    }

    public void setPipeParameters(IMsoPipe callBack, String ip, int port, int timeout) {
        this.pipeCallBack = callBack;
        this.pipeIP = ip;
        this.pipePort = port;
        this.pipeTimeout = timeout;
    }

    public void setUartParameters(String port, int baudrate) {
        this.uartPort = port;
        this.uartBaudrate = baudrate;
    }

    void setSecurityParameters(boolean isTunnelingMode, boolean isOfferedSecurityMode, IMsoSecu msosecuCallbackObject, byte[] hostCertificate) {
        this.isTunnelingMode = isTunnelingMode;
        this.isOfferedSecurityMode = isOfferedSecurityMode;
        this._msoSecu = msosecuCallbackObject;
        this._hostCertificate = hostCertificate;
    }
}
