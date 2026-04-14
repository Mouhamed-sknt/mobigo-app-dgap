package com.morpho.morphosmart.sdk;

import com.morpho.android.usb.USBManager;
import com.morpho.morphosmart.sdk.MorphoDevice;
import java.util.ArrayList;
import java.util.Observer;

/* JADX INFO: compiled from: MorphoDevice.java */
/* JADX INFO: loaded from: classes.dex */
class MorphoDeviceNative {
    public native int DeviceFactoryReset(long j, byte[] bArr);

    public native int OfferedSecuClose(long j);

    public native int OfferedSecuOpen(long j, IMsoSecu iMsoSecu);

    public native int ReadDeviceCertificate(long j, int i, byte[] bArr, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2, ArrayList<Byte> arrayList3, ArrayList<Byte> arrayList4);

    public native int SecuConfigPkcs12WithPassword(long j, byte[] bArr, byte[] bArr2);

    public native int SecuConfigureRootCAWithResetOpts(long j, int i, int i2, MorphoSecurityParameters morphoSecurityParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native int SecuGetCSR(long j, byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    public native int SecuGetCSRBasicMode(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    public native int SecuGetChallenge(long j, byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    public native int SecuReadCertificate(long j, int i, ArrayList<Byte> arrayList);

    public native int SecuStoCertif(long j, byte[] bArr);

    public native int SecuUploadTrustChain(long j, byte[] bArr);

    public native int TunnelingClose(long j);

    public native int TunnelingOpen(long j, IMsoSecu iMsoSecu, byte[] bArr);

    public native int cancelLiveAcquisition(long j);

    public native int capture(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, TemplateList templateList, int i12, Observer observer, int i13, int i14);

    public native int closeDevice(long j);

    public native byte[] comReceive(long j, int i);

    public native int comSend(long j, int i, byte[] bArr);

    public native void deleteInstance(long j);

    public native int enableCS(long j, boolean z);

    public native int enableDataEncryptionByByteArray(long j, boolean z, byte[] bArr);

    public native int enableDataEncryptionByString(long j, boolean z, String str);

    public native int forceActivateHost(long j);

    public native long getCPPInstance();

    public native long getCPPInstance(long j);

    public native int getComType(long j);

    public native byte[] getConfigParam(long j, int i);

    public native int getDatabase(long j, int i, MorphoDatabase morphoDatabase);

    public native int getDeviceCapability(long j, MorphoDevice.MorphoDeviceDeviceCapability[] morphoDeviceDeviceCapabilityArr);

    public native String getFFDLogs(long j);

    public native int getImage(long j, int i, int i2, int i3, int i4, int i5, int i6, MorphoImage morphoImage, int i7, Observer observer);

    public native int getIntDescriptorBin(long j, int i);

    public native int getInternalError(long j);

    public native byte[] getKCV(long j, int i, byte[] bArr);

    public native String getOpenedUsbDeviceName(long j);

    public native int getPrivacyModeStatus(long j, MorphoDevice.MorphoDevicePrivacyModeStatus[] morphoDevicePrivacyModeStatusArr);

    public native byte[] getPrivacySeed(long j);

    public native String getProductDescriptor(long j);

    public native int getSecuConfig(long j, SecuConfig secuConfig);

    public native int getSecurityLevel(long j);

    public native String getSensorDescriptor(long j);

    public native String getSoftwareDescriptor(long j);

    public native int getStrategyAcquisitionMode(long j);

    public native String getStringDescriptorBin(long j, int i);

    public native byte[] getUnlockSeed(long j);

    public native String getUsbDeviceName(long j, int i);

    public native String getUsbDevicePropertie(long j, int i);

    public native byte[] getUserAreaData(long j);

    public native int initUsbDevicesNameEnum(long j, CustomInteger customInteger);

    public native boolean isCSEnabled(long j);

    public native boolean isDataEncryptionEnabled(long j);

    public native boolean isHostCapable(long j);

    public native int loadKprivacy(long j, byte[] bArr);

    public native int loadKprivacyFirstTime(long j, byte[] bArr, byte[] bArr2);

    public native int loadKprivacySecurely(long j, byte[] bArr, byte[] bArr2);

    public native int loadKprivacySecurelyAsymmetric(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native int loadKs(long j, byte[] bArr);

    public native int loadKsSecurely(long j, byte[] bArr);

    public native int loadKsSecurely(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native int loadMocKey(long j, byte[] bArr);

    public native int loadMocKey(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native int openDevicePipe(long j, IMsoPipe iMsoPipe, String str, int i, String str2, int i2);

    public native int openDeviceWithUart(long j, String str, int i);

    public native int openUsbDevice(long j, String str, int i);

    public native int openUsbDeviceFD(long j, int i, int i2, int i3, int i4);

    public native int ping(long j);

    public native int rebootSoft(long j);

    public native int removeUserAreaData(long j);

    public native int setConfigParam(long j, int i, byte[] bArr);

    public native int setLoggingLevelOfGroup(long j, int i, int i2);

    public native int setLoggingMode(long j, int i);

    public native int setMainFolderPath(String str);

    public native int setPrivacyModeStatus(long j, int i, int i2);

    public native int setSecurityLevel(long j, int i);

    public native int setStrategyAcquisitionMode(long j, int i);

    public native int setUserAreaData(long j, byte[] bArr);

    public native int unlock(long j, byte[] bArr, byte[] bArr2);

    public native int verify(long j, int i, int i2, int i3, int i4, int i5, TemplateList templateList, int i6, Observer observer, ResultMatching resultMatching);

    public native int verifyMatch(long j, int i, TemplateList templateList, TemplateList templateList2, CustomInteger customInteger);

    MorphoDeviceNative() {
    }

    static {
        System.loadLibrary("NativeMorphoSmartSDK_6.50.2");
        System.loadLibrary(USBManager.SOFTWAREID_MSO100);
    }
}
