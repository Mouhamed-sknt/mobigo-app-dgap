package com.morpho.morphosmart.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import com.morpho.android.annotation.WakeLockAspect;
import com.morpho.android.annotation.WakeLockabble;
import com.morpho.android.usb.USBManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Observer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: classes.dex */
public class MorphoDevice implements Cloneable {
    public static String ACTION_SCREEN_RECEIVER = null;
    public static final int CONFIG_KEY_USER_TAG = 4627;
    public static final int CONFIG_RS232_SLEEP_TIMEOUT = 1296;
    public static final int CONFIG_SENSOR_WIN_POSITION_TAG = 3600;
    public static final int CONFIG_UI_CONFIG_TAG = 5136;
    public static final int CONFIG_UI_RESET_TAG = 5137;
    public static final int CONFIG_USB_ENABLE_FULL_SPEED_TAG = 1810;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_16 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_17 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_18 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_19 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_20 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_21 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_22 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_23 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_24 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static  /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    public static String mMainFolderPath;
    private static MorphoDeviceNative morphoDeviceNative;
    private byte[] _hostCertificate;
    private IMsoSecu _msoSecu;
    protected boolean cppMemOwn;
    private Long morphoDevicePointerCPP;
    private String pipeIP;
    private int pipePort;
    private int pipeTimeout;
    private int uartBaudrate;
    private String uartPort;
    private ResumeConnectionThread _reboot = null;
    private String deviceSN = "";
    private int deviceBus = -1;
    private int deviceAddress = -1;
    private int deviceFD = -1;
    private boolean deviceOpenedWithFD = false;
    private boolean deviceOpenedWithPipe = false;
    private IMsoPipe pipeCallBack = null;
    private boolean deviceOpenedWithUart = false;
    private boolean isTunnelingMode = false;
    private boolean isOfferedSecurityMode = false;
    private ScreenBroadcastReceiver screenReceiver = null;
    private Context context = null;
    private boolean isPackageNameSet = false;

    @WakeLockabble
    public static int SetMainFolderPath(String path) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_0, (Object) null, (Object) null, path);
        return Conversions.intValue(SetMainFolderPath_aroundBody1$advice(path, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MorphoDevice.java", MorphoDevice.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("9", "SetMainFolderPath", "com.morpho.morphosmart.sdk.MorphoDevice", "java.lang.String", "path", "", "int"), 170);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "openDevicePipe", "com.morpho.morphosmart.sdk.MorphoDevice", "com.morpho.morphosmart.sdk.IMsoPipe:java.lang.String:int:java.lang.String:int", "callBack:ip:port:serialNumber:timeout", "", "int"), 237);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCSR_BasicMode", "com.morpho.morphosmart.sdk.MorphoDevice", "[B:[B:[B:[B:java.util.ArrayList:java.util.ArrayList", "serialNumber:pkcs12Password:sign:caPKCS12:csr:productCertif", "", "int"), 960);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "secuGetCSR", "com.morpho.morphosmart.sdk.MorphoDevice", "[B:[B:java.util.ArrayList:java.util.ArrayList", "serialNumber:sign:csr:productCertif", "", "int"), 990);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "secuGetChallenge", "com.morpho.morphosmart.sdk.MorphoDevice", "[B:[B:java.util.ArrayList:java.util.ArrayList", "cryptogram1:sign:cryptogram2:devSign", "", "int"), PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "configureRootCA_WithResetOpts", "com.morpho.morphosmart.sdk.MorphoDevice", "com.morpho.morphosmart.sdk.DeviceReqOptionType:com.morpho.morphosmart.sdk.DeviceResetOptionType:com.morpho.morphosmart.sdk.MorphoSecurityParameters:[B:[B:[B:[B", "deviceReqOptionType:deviceResetOptionType:securityParameters:rootPKCS12Certif:rootPKCSPassword:cryptoData:signData", "", "int"), 1049);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "configPkcs12WithPassword", "com.morpho.morphosmart.sdk.MorphoDevice", "[B:[B", "certData:passphrase", "", "int"), 1074);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "deviceFactoryReset", "com.morpho.morphosmart.sdk.MorphoDevice", "[B", "serialNum", "", "int"), 1099);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "uploadTrustChain", "com.morpho.morphosmart.sdk.MorphoDevice", "[B", "chainPath", "", "int"), 1126);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getImage", "com.morpho.morphosmart.sdk.MorphoDevice", "int:int:com.morpho.morphosmart.sdk.CompressionAlgorithm:int:int:com.morpho.morphosmart.sdk.LatentDetection:com.morpho.morphosmart.sdk.MorphoImage:int:java.util.Observer", "timeOut:acquisitionThreshold:compressAlgo:compressRate:detectModeChoice:latentDetection:morphoImage:callbackCmd:callback", "", "int"), 1533);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "verify", "com.morpho.morphosmart.sdk.MorphoDevice", "int:int:com.morpho.morphosmart.sdk.Coder:int:int:com.morpho.morphosmart.sdk.TemplateList:int:java.util.Observer:com.morpho.morphosmart.sdk.ResultMatching", "timeOut:far:coder:detectModeChoice:matchingStrategy:templateList:callbackCmd:callback:resultMatching", "", "int"), 2051);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "verifyMatch", "com.morpho.morphosmart.sdk.MorphoDevice", "int:com.morpho.morphosmart.sdk.TemplateList:com.morpho.morphosmart.sdk.TemplateList:com.morpho.morphosmart.sdk.CustomInteger", "far:templateListSearch:templateListReference:matchingScore", "", "int"), 2099);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "capture", "com.morpho.morphosmart.sdk.MorphoDevice", "int:int:int:int:com.morpho.morphosmart.sdk.TemplateType:com.morpho.morphosmart.sdk.TemplateFVPType:int:com.morpho.morphosmart.sdk.EnrollmentType:com.morpho.morphosmart.sdk.LatentDetection:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.CompressionAlgorithm:int:com.morpho.morphosmart.sdk.TemplateList:int:java.util.Observer", "timeout:acquisitionThreshold:advancedSecurityLevelsRequired:fingerNumber:templateType:templateFVPType:maxSizeTemplate:enrollType:latentDetection:coderChoice:detectModeChoice:compressAlgo:compressRate:templateList:callbackCmd:callback", "", "int"), 535);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "comSend", "com.morpho.morphosmart.sdk.MorphoDevice", "int:[B", "timeOut:data", "", "int"), 2166);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "comReceive", "com.morpho.morphosmart.sdk.MorphoDevice", "int", "timeOut", "", "[B"), 2188);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "loadKs", "com.morpho.morphosmart.sdk.MorphoDevice", "[B", "key", "", "int"), 2207);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "loadMocKey", "com.morpho.morphosmart.sdk.MorphoDevice", "[B:[B:[B", "key_enc_Ciffered_by_Certificate:key_enc_Ciffered_by_Certificate_Signature:hostCertificate", "", "int"), 2300);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "loadMocKey", "com.morpho.morphosmart.sdk.MorphoDevice", "[B", "key_enc_Ciffered_by_KencTrans", "", "int"), 2326);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "capture", "com.morpho.morphosmart.sdk.MorphoDevice", "int:int:int:int:com.morpho.morphosmart.sdk.TemplateType:com.morpho.morphosmart.sdk.TemplateFVPType:int:com.morpho.morphosmart.sdk.EnrollmentType:com.morpho.morphosmart.sdk.LatentDetection:com.morpho.morphosmart.sdk.Coder:int:com.morpho.morphosmart.sdk.TemplateList:int:java.util.Observer", "timeout:acquisitionThreshold:advancedSecurityLevelsRequired:fingerNumber:templateType:templateFVPType:maxSizeTemplate:enrollType:latentDetection:coderChoice:detectModeChoice:templateList:callbackCmd:callback", "", "int"), 558);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "openUsbDevice", "com.morpho.morphosmart.sdk.MorphoDevice", "java.lang.String:int", "sensorName:timeOut", "", "int"), 752);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "openDeviceWithUart", "com.morpho.morphosmart.sdk.MorphoDevice", "java.lang.String:int", "port:BaudRate", "", "int"), 782);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "openUsbDeviceFD", "com.morpho.morphosmart.sdk.MorphoDevice", "int:int:int:int", "bus:address:fd:timeOut", "", "int"), 818);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConfigParam", "com.morpho.morphosmart.sdk.MorphoDevice", "int:[B", "tag:paramValue", "", "int"), 855);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "readDeviceCertificate", "com.morpho.morphosmart.sdk.MorphoDevice", "int:[B:java.util.ArrayList:java.util.ArrayList:java.util.ArrayList:java.util.ArrayList", "index_Certif:randChallenge:signedChallenge1:requestedCertif:signedChallenge2:productCertif", "", "int"), 889);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "secuStoCertif", "com.morpho.morphosmart.sdk.MorphoDevice", "[B", "certData", "", "int"), 929);
    }

    @WakeLockabble
    public int capture(int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, CompressionAlgorithm compressAlgo, int compressRate, TemplateList templateList, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_2, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(acquisitionThreshold), Conversions.intObject(advancedSecurityLevelsRequired), Conversions.intObject(fingerNumber), templateType, templateFVPType, Conversions.intObject(maxSizeTemplate), enrollType, latentDetection, coderChoice, Conversions.intObject(detectModeChoice), compressAlgo, Conversions.intObject(compressRate), templateList, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(capture_aroundBody5$advice(this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType, templateFVPType, maxSizeTemplate, enrollType, latentDetection, coderChoice, detectModeChoice, compressAlgo, compressRate, templateList, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int capture(int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_3, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeout), Conversions.intObject(acquisitionThreshold), Conversions.intObject(advancedSecurityLevelsRequired), Conversions.intObject(fingerNumber), templateType, templateFVPType, Conversions.intObject(maxSizeTemplate), enrollType, latentDetection, coderChoice, Conversions.intObject(detectModeChoice), templateList, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(capture_aroundBody7$advice(this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType, templateFVPType, maxSizeTemplate, enrollType, latentDetection, coderChoice, detectModeChoice, templateList, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public byte[] comReceive(int timeOut) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(timeOut));
        return (byte[]) comReceive_aroundBody43$advice(this, timeOut, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP);
    }

    @WakeLockabble
    public int comSend(int timeOut, byte[] data) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_20, this, this, Conversions.intObject(timeOut), data);
        return Conversions.intValue(comSend_aroundBody41$advice(this, timeOut, data, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int configPkcs12WithPassword(byte[] certData, byte[] passphrase) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_14, this, this, certData, passphrase);
        return Conversions.intValue(configPkcs12WithPassword_aroundBody29$advice(this, certData, passphrase, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int configureRootCA_WithResetOpts(DeviceReqOptionType deviceReqOptionType, DeviceResetOptionType deviceResetOptionType, MorphoSecurityParameters securityParameters, byte[] rootPKCS12Certif, byte[] rootPKCSPassword, byte[] cryptoData, byte[] signData) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_13, (Object) this, (Object) this, new Object[]{deviceReqOptionType, deviceResetOptionType, securityParameters, rootPKCS12Certif, rootPKCSPassword, cryptoData, signData});
        return Conversions.intValue(configureRootCA_WithResetOpts_aroundBody27$advice(this, deviceReqOptionType, deviceResetOptionType, securityParameters, rootPKCS12Certif, rootPKCSPassword, cryptoData, signData, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int deviceFactoryReset(byte[] serialNum) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_15, this, this, serialNum);
        return Conversions.intValue(deviceFactoryReset_aroundBody31$advice(this, serialNum, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int getCSR_BasicMode(byte[] serialNumber, byte[] pkcs12Password, byte[] sign, byte[] caPKCS12, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_10, (Object) this, (Object) this, new Object[]{serialNumber, pkcs12Password, sign, caPKCS12, arrayList, arrayList2});
        return Conversions.intValue(getCSR_BasicMode_aroundBody21$advice(this, serialNumber, pkcs12Password, sign, caPKCS12, arrayList, arrayList2, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int getImage(int timeOut, int acquisitionThreshold, CompressionAlgorithm compressAlgo, int compressRate, int detectModeChoice, LatentDetection latentDetection, MorphoImage morphoImage, int callbackCmd, Observer callback) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_17, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeOut), Conversions.intObject(acquisitionThreshold), compressAlgo, Conversions.intObject(compressRate), Conversions.intObject(detectModeChoice), latentDetection, morphoImage, Conversions.intObject(callbackCmd), callback});
        return Conversions.intValue(getImage_aroundBody35$advice(this, timeOut, acquisitionThreshold, compressAlgo, compressRate, detectModeChoice, latentDetection, morphoImage, callbackCmd, callback, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int loadKs(byte[] key) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_22, this, this, key);
        return Conversions.intValue(loadKs_aroundBody45$advice(this, key, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int loadMocKey(byte[] key_enc_Ciffered_by_KencTrans) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_24, this, this, key_enc_Ciffered_by_KencTrans);
        return Conversions.intValue(loadMocKey_aroundBody49$advice(this, key_enc_Ciffered_by_KencTrans, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int loadMocKey(byte[] key_enc_Ciffered_by_Certificate, byte[] key_enc_Ciffered_by_Certificate_Signature, byte[] hostCertificate) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_23, (Object) this, (Object) this, new Object[]{key_enc_Ciffered_by_Certificate, key_enc_Ciffered_by_Certificate_Signature, hostCertificate});
        return Conversions.intValue(loadMocKey_aroundBody47$advice(this, key_enc_Ciffered_by_Certificate, key_enc_Ciffered_by_Certificate_Signature, hostCertificate, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int openDevicePipe(IMsoPipe callBack, String ip, int port, String serialNumber, int timeout) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_1, (Object) this, (Object) this, new Object[]{callBack, ip, Conversions.intObject(port), serialNumber, Conversions.intObject(timeout)});
        return Conversions.intValue(openDevicePipe_aroundBody3$advice(this, callBack, ip, port, serialNumber, timeout, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int openDeviceWithUart(String port, int BaudRate) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_5, this, this, port, Conversions.intObject(BaudRate));
        return Conversions.intValue(openDeviceWithUart_aroundBody11$advice(this, port, BaudRate, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int openUsbDevice(String sensorName, int timeOut) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_4, this, this, sensorName, Conversions.intObject(timeOut));
        return Conversions.intValue(openUsbDevice_aroundBody9$advice(this, sensorName, timeOut, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int openUsbDeviceFD(int bus, int address, int fd, int timeOut) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_6, (Object) this, (Object) this, new Object[]{Conversions.intObject(bus), Conversions.intObject(address), Conversions.intObject(fd), Conversions.intObject(timeOut)});
        return Conversions.intValue(openUsbDeviceFD_aroundBody13$advice(this, bus, address, fd, timeOut, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int readDeviceCertificate(int index_Certif, byte[] randChallenge, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2, ArrayList<Byte> arrayList3, ArrayList<Byte> arrayList4) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_8, (Object) this, (Object) this, new Object[]{Conversions.intObject(index_Certif), randChallenge, arrayList, arrayList2, arrayList3, arrayList4});
        return Conversions.intValue(readDeviceCertificate_aroundBody17$advice(this, index_Certif, randChallenge, arrayList, arrayList2, arrayList3, arrayList4, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int secuGetCSR(byte[] serialNumber, byte[] sign, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_11, (Object) this, (Object) this, new Object[]{serialNumber, sign, arrayList, arrayList2});
        return Conversions.intValue(secuGetCSR_aroundBody23$advice(this, serialNumber, sign, arrayList, arrayList2, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int secuGetChallenge(byte[] cryptogram1, byte[] sign, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_12, (Object) this, (Object) this, new Object[]{cryptogram1, sign, arrayList, arrayList2});
        return Conversions.intValue(secuGetChallenge_aroundBody25$advice(this, cryptogram1, sign, arrayList, arrayList2, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int secuStoCertif(byte[] certData) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_9, this, this, certData);
        return Conversions.intValue(secuStoCertif_aroundBody19$advice(this, certData, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int setConfigParam(int tag, byte[] paramValue) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(tag), paramValue);
        return Conversions.intValue(setConfigParam_aroundBody15$advice(this, tag, paramValue, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int uploadTrustChain(byte[] chainPath) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_16, this, this, chainPath);
        return Conversions.intValue(uploadTrustChain_aroundBody33$advice(this, chainPath, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int verify(int timeOut, int far, Coder coder, int detectModeChoice, int matchingStrategy, TemplateList templateList, int callbackCmd, Observer callback, ResultMatching resultMatching) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_18, (Object) this, (Object) this, new Object[]{Conversions.intObject(timeOut), Conversions.intObject(far), coder, Conversions.intObject(detectModeChoice), Conversions.intObject(matchingStrategy), templateList, Conversions.intObject(callbackCmd), callback, resultMatching});
        return Conversions.intValue(verify_aroundBody37$advice(this, timeOut, far, coder, detectModeChoice, matchingStrategy, templateList, callbackCmd, callback, resultMatching, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    @WakeLockabble
    public int verifyMatch(int far, TemplateList templateListSearch, TemplateList templateListReference, CustomInteger matchingScore) {
        JoinPoint joinPointMakeJP = Factory.makeJP(ajc$tjp_19, (Object) this, (Object) this, new Object[]{Conversions.intObject(far), templateListSearch, templateListReference, matchingScore});
        return Conversions.intValue(verifyMatch_aroundBody39$advice(this, far, templateListSearch, templateListReference, matchingScore, joinPointMakeJP, WakeLockAspect.aspectOf(), (ProceedingJoinPoint) joinPointMakeJP));
    }

    static {
        ajc$preClinit();
        morphoDeviceNative = new MorphoDeviceNative();
        mMainFolderPath = "";
        ACTION_SCREEN_RECEIVER = "com.morpho.android.local.RECEIVER";
    }

    public enum MorphoDevicePrivacyModeStatus {
        PRIVACY_MODE_DISABLED(1),
        PRIVACY_MODE_ENABLED(2),
        PRIVACY_MODE_STANDALONE_ENABLED(3),
        PRIVACY_MODE_PARTIAL_ENABLED(18),
        PRIVACY_MODE_SUSPENDED(48),
        PRIVACY_MODE_UPDATE(32);

        private final int value;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MorphoDevicePrivacyModeStatus[] valuesCustom() {
            MorphoDevicePrivacyModeStatus[] morphoDevicePrivacyModeStatusArrValuesCustom = values();
            int length = morphoDevicePrivacyModeStatusArrValuesCustom.length;
            MorphoDevicePrivacyModeStatus[] morphoDevicePrivacyModeStatusArr = new MorphoDevicePrivacyModeStatus[length];
            System.arraycopy(morphoDevicePrivacyModeStatusArrValuesCustom, 0, morphoDevicePrivacyModeStatusArr, 0, length);
            return morphoDevicePrivacyModeStatusArr;
        }

        MorphoDevicePrivacyModeStatus(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MorphoDevicePrivacyModeDBProcessingChoice {
        PRIVACY_MODE_DB_PROCESSING_NOTHING(0),
        PRIVACY_MODE_DB_PROCESSING_ERASE(1),
        PRIVACY_MODE_DB_PROCESSING_CIPHER_TRANCIPHER(2);

        private final int value;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MorphoDevicePrivacyModeDBProcessingChoice[] valuesCustom() {
            MorphoDevicePrivacyModeDBProcessingChoice[] morphoDevicePrivacyModeDBProcessingChoiceArrValuesCustom = values();
            int length = morphoDevicePrivacyModeDBProcessingChoiceArrValuesCustom.length;
            MorphoDevicePrivacyModeDBProcessingChoice[] morphoDevicePrivacyModeDBProcessingChoiceArr = new MorphoDevicePrivacyModeDBProcessingChoice[length];
            System.arraycopy(morphoDevicePrivacyModeDBProcessingChoiceArrValuesCustom, 0, morphoDevicePrivacyModeDBProcessingChoiceArr, 0, length);
            return morphoDevicePrivacyModeDBProcessingChoiceArr;
        }

        MorphoDevicePrivacyModeDBProcessingChoice(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private static final /* synthetic */ Object SetMainFolderPath_aroundBody1$advice(String path, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(SetMainFolderPath_aroundBody0(path, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object capture_aroundBody5$advice(MorphoDevice ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, CompressionAlgorithm compressAlgo, int compressRate, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(capture_aroundBody4(ajc$this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType, templateFVPType, maxSizeTemplate, enrollType, latentDetection, coderChoice, detectModeChoice, compressAlgo, compressRate, templateList, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object capture_aroundBody7$advice(MorphoDevice ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(capture_aroundBody6(ajc$this, timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType, templateFVPType, maxSizeTemplate, enrollType, latentDetection, coderChoice, detectModeChoice, templateList, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object comReceive_aroundBody43$advice(MorphoDevice ajc$this, int timeOut, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = comReceive_aroundBody42(ajc$this, timeOut, joinPoint);
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object comSend_aroundBody41$advice(MorphoDevice ajc$this, int timeOut, byte[] data, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(comSend_aroundBody40(ajc$this, timeOut, data, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object configPkcs12WithPassword_aroundBody29$advice(MorphoDevice ajc$this, byte[] certData, byte[] passphrase, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(configPkcs12WithPassword_aroundBody28(ajc$this, certData, passphrase, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object configureRootCA_WithResetOpts_aroundBody27$advice(MorphoDevice ajc$this, DeviceReqOptionType deviceReqOptionType, DeviceResetOptionType deviceResetOptionType, MorphoSecurityParameters securityParameters, byte[] rootPKCS12Certif, byte[] rootPKCSPassword, byte[] cryptoData, byte[] signData, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(configureRootCA_WithResetOpts_aroundBody26(ajc$this, deviceReqOptionType, deviceResetOptionType, securityParameters, rootPKCS12Certif, rootPKCSPassword, cryptoData, signData, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object deviceFactoryReset_aroundBody31$advice(MorphoDevice ajc$this, byte[] serialNum, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(deviceFactoryReset_aroundBody30(ajc$this, serialNum, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object getCSR_BasicMode_aroundBody21$advice(MorphoDevice ajc$this, byte[] serialNumber, byte[] pkcs12Password, byte[] sign, byte[] caPKCS12, ArrayList csr, ArrayList productCertif, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(getCSR_BasicMode_aroundBody20(ajc$this, serialNumber, pkcs12Password, sign, caPKCS12, csr, productCertif, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object getImage_aroundBody35$advice(MorphoDevice ajc$this, int timeOut, int acquisitionThreshold, CompressionAlgorithm compressAlgo, int compressRate, int detectModeChoice, LatentDetection latentDetection, MorphoImage morphoImage, int callbackCmd, Observer callback, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(getImage_aroundBody34(ajc$this, timeOut, acquisitionThreshold, compressAlgo, compressRate, detectModeChoice, latentDetection, morphoImage, callbackCmd, callback, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object loadKs_aroundBody45$advice(MorphoDevice ajc$this, byte[] key, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(loadKs_aroundBody44(ajc$this, key, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object loadMocKey_aroundBody47$advice(MorphoDevice ajc$this, byte[] key_enc_Ciffered_by_Certificate, byte[] key_enc_Ciffered_by_Certificate_Signature, byte[] hostCertificate, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(loadMocKey_aroundBody46(ajc$this, key_enc_Ciffered_by_Certificate, key_enc_Ciffered_by_Certificate_Signature, hostCertificate, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object loadMocKey_aroundBody49$advice(MorphoDevice ajc$this, byte[] key_enc_Ciffered_by_KencTrans, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(loadMocKey_aroundBody48(ajc$this, key_enc_Ciffered_by_KencTrans, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object openDevicePipe_aroundBody3$advice(MorphoDevice ajc$this, IMsoPipe callBack, String ip, int port, String serialNumber, int timeout, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(openDevicePipe_aroundBody2(ajc$this, callBack, ip, port, serialNumber, timeout, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object openDeviceWithUart_aroundBody11$advice(MorphoDevice ajc$this, String port, int BaudRate, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(openDeviceWithUart_aroundBody10(ajc$this, port, BaudRate, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object openUsbDeviceFD_aroundBody13$advice(MorphoDevice ajc$this, int bus, int address, int fd, int timeOut, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(openUsbDeviceFD_aroundBody12(ajc$this, bus, address, fd, timeOut, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object openUsbDevice_aroundBody9$advice(MorphoDevice ajc$this, String sensorName, int timeOut, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(openUsbDevice_aroundBody8(ajc$this, sensorName, timeOut, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object readDeviceCertificate_aroundBody17$advice(MorphoDevice ajc$this, int index_Certif, byte[] randChallenge, ArrayList signedChallenge1, ArrayList requestedCertif, ArrayList signedChallenge2, ArrayList productCertif, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(readDeviceCertificate_aroundBody16(ajc$this, index_Certif, randChallenge, signedChallenge1, requestedCertif, signedChallenge2, productCertif, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object secuGetCSR_aroundBody23$advice(MorphoDevice ajc$this, byte[] serialNumber, byte[] sign, ArrayList csr, ArrayList productCertif, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(secuGetCSR_aroundBody22(ajc$this, serialNumber, sign, csr, productCertif, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object secuGetChallenge_aroundBody25$advice(MorphoDevice ajc$this, byte[] cryptogram1, byte[] sign, ArrayList cryptogram2, ArrayList devSign, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(secuGetChallenge_aroundBody24(ajc$this, cryptogram1, sign, cryptogram2, devSign, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object secuStoCertif_aroundBody19$advice(MorphoDevice ajc$this, byte[] certData, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(secuStoCertif_aroundBody18(ajc$this, certData, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object setConfigParam_aroundBody15$advice(MorphoDevice ajc$this, int tag, byte[] paramValue, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(setConfigParam_aroundBody14(ajc$this, tag, paramValue, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object uploadTrustChain_aroundBody33$advice(MorphoDevice ajc$this, byte[] chainPath, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(uploadTrustChain_aroundBody32(ajc$this, chainPath, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object verifyMatch_aroundBody39$advice(MorphoDevice ajc$this, int far, TemplateList templateListSearch, TemplateList templateListReference, CustomInteger matchingScore, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(verifyMatch_aroundBody38(ajc$this, far, templateListSearch, templateListReference, matchingScore, joinPoint));
            return returnObject;
        } finally {
        }
    }

    private static final /* synthetic */ Object verify_aroundBody37$advice(MorphoDevice ajc$this, int timeOut, int far, Coder coder, int detectModeChoice, int matchingStrategy, TemplateList templateList, int callbackCmd, Observer callback, ResultMatching resultMatching, JoinPoint thisJoinPoint, WakeLockAspect ajc$aspectInstance, ProceedingJoinPoint joinPoint) {
        try {
            ajc$aspectInstance.acquireWakeLock();
            String packageName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            Log.e(WakeLockAspect.TAG, "Entering method [" + packageName + "." + methodName + "]");
            Object returnObject = Conversions.intObject(verify_aroundBody36(ajc$this, timeOut, far, coder, detectModeChoice, matchingStrategy, templateList, callbackCmd, callback, resultMatching, joinPoint));
            return returnObject;
        } finally {
        }
    }

    public enum MorphoDeviceDeviceCapability {
        UNDEFINED(0),
        ENABLE(1),
        DISABLE(2);

        private final int value;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MorphoDeviceDeviceCapability[] valuesCustom() {
            MorphoDeviceDeviceCapability[] morphoDeviceDeviceCapabilityArrValuesCustom = values();
            int length = morphoDeviceDeviceCapabilityArrValuesCustom.length;
            MorphoDeviceDeviceCapability[] morphoDeviceDeviceCapabilityArr = new MorphoDeviceDeviceCapability[length];
            System.arraycopy(morphoDeviceDeviceCapabilityArrValuesCustom, 0, morphoDeviceDeviceCapabilityArr, 0, length);
            return morphoDeviceDeviceCapabilityArr;
        }

        MorphoDeviceDeviceCapability(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MorphoDevicePrivacyModeEncryptionAlgo {
        PRIVACY_ENCRYPTION_ALGO_AES128(0),
        PRIVACY_ENCRYPTION_ALGO_AES256(1),
        PRIVACY_ENCRYPTION_ALGO_AES256GCM(2);

        private final int value;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MorphoDevicePrivacyModeEncryptionAlgo[] valuesCustom() {
            MorphoDevicePrivacyModeEncryptionAlgo[] morphoDevicePrivacyModeEncryptionAlgoArrValuesCustom = values();
            int length = morphoDevicePrivacyModeEncryptionAlgoArrValuesCustom.length;
            MorphoDevicePrivacyModeEncryptionAlgo[] morphoDevicePrivacyModeEncryptionAlgoArr = new MorphoDevicePrivacyModeEncryptionAlgo[length];
            System.arraycopy(morphoDevicePrivacyModeEncryptionAlgoArrValuesCustom, 0, morphoDevicePrivacyModeEncryptionAlgoArr, 0, length);
            return morphoDevicePrivacyModeEncryptionAlgoArr;
        }

        MorphoDevicePrivacyModeEncryptionAlgo(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private static final /* synthetic */ int SetMainFolderPath_aroundBody0(String path, JoinPoint joinPoint) {
        if (path != null) {
            File dir = new File(path);
            if (!dir.exists()) {
                return ErrorCodes.MORPHOERR_PATH_NOT_EXISTS;
            }
            if (!mMainFolderPath.isEmpty()) {
                return ErrorCodes.MORPHOERR_PATH_ALREADY_INTILIZED;
            }
            if (!path.endsWith("/")) {
                path = String.valueOf(path) + "/";
            }
            mMainFolderPath = path;
            createConfigFolders(path);
            int ret = morphoDeviceNative.setMainFolderPath(path);
            return ret;
        }
        return -5;
    }

    private static void createConfigFolders(String strMainFolderPath) {
        String specialDirPath = String.valueOf(strMainFolderPath) + "Idemia/Special/MSO/";
        File specialDir = new File(specialDirPath);
        if (!specialDir.exists()) {
            specialDir.mkdirs();
        }
        String logsDirPath = String.valueOf(strMainFolderPath) + "Idemia/Logs/MSO/";
        File logsDir = new File(logsDirPath);
        if (!logsDir.exists()) {
            logsDir.mkdirs();
        }
        String confDirPath = String.valueOf(strMainFolderPath) + "Idemia/Conf/MSO/";
        File confDir = new File(confDirPath);
        if (!confDir.exists()) {
            confDir.mkdirs();
        }
        String keysDirPath = String.valueOf(strMainFolderPath) + "Idemia/Keys/MSO/";
        File keysDir = new File(keysDirPath);
        if (!keysDir.exists()) {
            keysDir.mkdirs();
        }
    }

    private static final /* synthetic */ int openDevicePipe_aroundBody2(MorphoDevice ajc$this, IMsoPipe callBack, String ip, int port, String serialNumber, int timeout, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (ip == null || serialNumber == null) {
            return -5;
        }
        ajc$this.deviceSN = serialNumber;
        ajc$this.deviceOpenedWithPipe = true;
        ajc$this.pipeCallBack = callBack;
        ajc$this.pipeIP = ip;
        ajc$this.pipePort = port;
        ajc$this.pipeTimeout = timeout;
        return morphoDeviceNative.openDevicePipe(ajc$this.morphoDevicePointerCPP.longValue(), callBack, ip, port, serialNumber, timeout);
    }

    public MorphoDevice() {
        this.morphoDevicePointerCPP = new Long(0L);
        this.cppMemOwn = false;
        long cppPtr = morphoDeviceNative.getCPPInstance();
        if (cppPtr != 0) {
            this.cppMemOwn = true;
            this.morphoDevicePointerCPP = Long.valueOf(cppPtr);
        } else {
            try {
                throw new MorphoSmartException("cppPtr is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
    }

    private void createScreenReceiver() {
        USBManager.getInstance();
        if (this.screenReceiver != null) {
            this.screenReceiver = new ScreenBroadcastReceiver();
            this.screenReceiver.setDevice(this);
            IntentFilter filter = new IntentFilter(ACTION_SCREEN_RECEIVER);
            filter.addAction("android.intent.action.SCREEN_OFF");
            filter.addAction("android.intent.action.SCREEN_ON");
            this.context = USBManager.context;
            try {
                if (this.context != null) {
                    this.context.registerReceiver(this.screenReceiver, filter);
                    USBManager.screenReceiverMap.put(this.context, this.screenReceiver);
                } else {
                    this.screenReceiver = null;
                }
            } catch (RuntimeException e) {
                this.screenReceiver = null;
                Log.i("screenReceiver", e.toString());
            }
        }
    }

    public MorphoDevice(MorphoDevice device) {
        this.morphoDevicePointerCPP = new Long(0L);
        this.cppMemOwn = false;
        if (device == null) {
            try {
                throw new MorphoSmartException("MorphoDevice object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        } else {
            if (!device.cppMemOwn) {
                long cppPtr = morphoDeviceNative.getCPPInstance(device.morphoDevicePointerCPP.longValue());
                if (cppPtr != 0) {
                    this.cppMemOwn = true;
                    this.morphoDevicePointerCPP = Long.valueOf(cppPtr);
                    return;
                } else {
                    try {
                        throw new MorphoSmartException("cppPtr is null");
                    } catch (MorphoSmartException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
            try {
                throw new MorphoSmartException("cppMemOwn is true");
            } catch (MorphoSmartException e3) {
                e3.printStackTrace();
            }
        }
    }

    protected void finalize() {
        if (this.cppMemOwn) {
            closeDevice();
            morphoDeviceNative.deleteInstance(this.morphoDevicePointerCPP.longValue());
            this.cppMemOwn = false;
        }
    }

    public int ping() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.ping(this.morphoDevicePointerCPP.longValue());
    }

    public Object clone() {
        return new MorphoDevice(this);
    }

    public void setMorphoDeviceNativePointerCPP(long morphoDevicePointerCPP) {
        this.morphoDevicePointerCPP = Long.valueOf(morphoDevicePointerCPP);
        this.cppMemOwn = true;
    }

    public int getDatabase(int databaseIndex, MorphoDatabase morphoDatabase) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoDatabase == null) {
            return -5;
        }
        return morphoDeviceNative.getDatabase(this.morphoDevicePointerCPP.longValue(), databaseIndex, morphoDatabase);
    }

    public int cancelLiveAcquisition() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.cancelLiveAcquisition(this.morphoDevicePointerCPP.longValue());
    }

    private static final /* synthetic */ int capture_aroundBody4(MorphoDevice ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, CompressionAlgorithm compressAlgo, int compressRate, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateType == null || templateFVPType == null || enrollType == null || latentDetection == null || coderChoice == null || templateList == null || compressAlgo == null) {
            return -5;
        }
        return morphoDeviceNative.capture(ajc$this.morphoDevicePointerCPP.longValue(), timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType.getCode(), templateFVPType.getCode(), maxSizeTemplate, enrollType.getValue(), latentDetection.getValue(), coderChoice.getCode(), detectModeChoice, templateList, callbackCmd, callback, compressAlgo.getCode(), compressRate);
    }

    private static final /* synthetic */ int capture_aroundBody6(MorphoDevice ajc$this, int timeout, int acquisitionThreshold, int advancedSecurityLevelsRequired, int fingerNumber, TemplateType templateType, TemplateFVPType templateFVPType, int maxSizeTemplate, EnrollmentType enrollType, LatentDetection latentDetection, Coder coderChoice, int detectModeChoice, TemplateList templateList, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateType == null || templateFVPType == null || enrollType == null || latentDetection == null || coderChoice == null || templateList == null) {
            return -5;
        }
        return morphoDeviceNative.capture(ajc$this.morphoDevicePointerCPP.longValue(), timeout, acquisitionThreshold, advancedSecurityLevelsRequired, fingerNumber, templateType.getCode(), templateFVPType.getCode(), maxSizeTemplate, enrollType.getValue(), latentDetection.getValue(), coderChoice.getCode(), detectModeChoice, templateList, callbackCmd, callback, CompressionAlgorithm.MORPHO_NO_COMPRESS.getCode(), 0);
    }

    public int closeDevice() {
        USBManager.getInstance();
        if (this.screenReceiver != null) {
            USBManager.unRegister(this.context, this.screenReceiver);
            this.screenReceiver = null;
        }
        if (!this.cppMemOwn) {
            return -98;
        }
        this.deviceSN = "";
        this.deviceBus = -1;
        this.deviceAddress = -1;
        this.deviceFD = -1;
        this.deviceOpenedWithFD = false;
        this.deviceOpenedWithPipe = false;
        this.deviceOpenedWithUart = false;
        return morphoDeviceNative.closeDevice(this.morphoDevicePointerCPP.longValue());
    }

    public int enableCS(boolean enable) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.enableCS(this.morphoDevicePointerCPP.longValue(), enable);
    }

    public int enableDataEncryption(boolean enable, String diversificationData) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (enable && diversificationData == null) {
            return -5;
        }
        return morphoDeviceNative.enableDataEncryptionByString(this.morphoDevicePointerCPP.longValue(), enable, diversificationData);
    }

    public int enableDataEncryption(boolean enable, byte[] diversificationData) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (enable && diversificationData == null) {
            return -5;
        }
        return morphoDeviceNative.enableDataEncryptionByByteArray(this.morphoDevicePointerCPP.longValue(), enable, diversificationData);
    }

    public int resumeConnection(int timeOut, Observer observer) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (this._reboot != null && this._reboot.isAlive()) {
            return -96;
        }
        this._reboot = new ResumeConnectionThread();
        this._reboot.setTimeOut(timeOut);
        this._reboot.setDevice(this);
        this._reboot.setObserver(observer);
        this._reboot.setDeviceName(this.deviceSN);
        this._reboot.setDeviceOpenWithFD(this.deviceOpenedWithFD);
        this._reboot.setDeviceOpenWithPipe(this.deviceOpenedWithPipe);
        this._reboot.setPipeParameters(this.pipeCallBack, this.pipeIP, this.pipePort, this.pipeTimeout);
        this._reboot.setDeviceOpenWithUart(this.deviceOpenedWithUart);
        this._reboot.setUartParameters(this.uartPort, this.uartBaudrate);
        this._reboot.setSecurityParameters(this.isTunnelingMode, this.isOfferedSecurityMode, this._msoSecu, this._hostCertificate);
        this._reboot.start();
        return 0;
    }

    public String getProductDescriptor() {
        return morphoDeviceNative.getProductDescriptor(this.morphoDevicePointerCPP.longValue());
    }

    public String getSensorDescriptor() {
        return morphoDeviceNative.getSensorDescriptor(this.morphoDevicePointerCPP.longValue());
    }

    public String getSoftwareDescriptor() {
        return morphoDeviceNative.getSoftwareDescriptor(this.morphoDevicePointerCPP.longValue());
    }

    private static final /* synthetic */ int openUsbDevice_aroundBody8(MorphoDevice ajc$this, String sensorName, int timeOut, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (sensorName == null) {
            return -5;
        }
        ajc$this.createScreenReceiver();
        ajc$this.deviceSN = sensorName;
        return morphoDeviceNative.openUsbDevice(ajc$this.morphoDevicePointerCPP.longValue(), sensorName, timeOut);
    }

    private static final /* synthetic */ int openDeviceWithUart_aroundBody10(MorphoDevice ajc$this, String port, int BaudRate, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (port == null) {
            return -5;
        }
        ajc$this.uartPort = port;
        ajc$this.uartBaudrate = BaudRate;
        ajc$this.deviceOpenedWithUart = true;
        return morphoDeviceNative.openDeviceWithUart(ajc$this.morphoDevicePointerCPP.longValue(), port, BaudRate);
    }

    private static final /* synthetic */ int openUsbDeviceFD_aroundBody12(MorphoDevice ajc$this, int bus, int address, int fd, int timeOut, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        ajc$this.createScreenReceiver();
        int ret = morphoDeviceNative.openUsbDeviceFD(ajc$this.morphoDevicePointerCPP.longValue(), bus, address, fd, timeOut);
        if (ret == 0) {
            ajc$this.deviceSN = morphoDeviceNative.getOpenedUsbDeviceName(ajc$this.morphoDevicePointerCPP.longValue());
            ajc$this.deviceBus = bus;
            ajc$this.deviceAddress = address;
            ajc$this.deviceFD = fd;
            ajc$this.deviceOpenedWithFD = true;
        }
        return ret;
    }

    private static final /* synthetic */ int setConfigParam_aroundBody14(MorphoDevice ajc$this, int tag, byte[] paramValue, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (paramValue == null) {
            return -5;
        }
        return morphoDeviceNative.setConfigParam(ajc$this.morphoDevicePointerCPP.longValue(), tag, paramValue);
    }

    private static final /* synthetic */ int readDeviceCertificate_aroundBody16(MorphoDevice ajc$this, int index_Certif, byte[] randChallenge, ArrayList signedChallenge1, ArrayList requestedCertif, ArrayList signedChallenge2, ArrayList productCertif, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (signedChallenge1 == null || requestedCertif == null || signedChallenge2 == null || productCertif == null || index_Certif < 0) {
            return -5;
        }
        return morphoDeviceNative.ReadDeviceCertificate(ajc$this.morphoDevicePointerCPP.longValue(), index_Certif, randChallenge, signedChallenge1, requestedCertif, signedChallenge2, productCertif);
    }

    public int SecuReadCertificate(int index, ArrayList<Byte> devCertif) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (devCertif == null || index < 0) {
            return -5;
        }
        return morphoDeviceNative.SecuReadCertificate(this.morphoDevicePointerCPP.longValue(), index, devCertif);
    }

    private static final /* synthetic */ int secuStoCertif_aroundBody18(MorphoDevice ajc$this, byte[] certData, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (certData == null) {
            return -5;
        }
        return morphoDeviceNative.SecuStoCertif(ajc$this.morphoDevicePointerCPP.longValue(), certData);
    }

    private static final /* synthetic */ int getCSR_BasicMode_aroundBody20(MorphoDevice ajc$this, byte[] serialNumber, byte[] pkcs12Password, byte[] sign, byte[] caPKCS12, ArrayList csr, ArrayList productCertif, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (serialNumber == null || pkcs12Password == null || sign == null || caPKCS12 == null || csr == null || productCertif == null) {
            return -5;
        }
        return morphoDeviceNative.SecuGetCSRBasicMode(ajc$this.morphoDevicePointerCPP.longValue(), serialNumber, pkcs12Password, sign, caPKCS12, csr, productCertif);
    }

    private static final /* synthetic */ int secuGetCSR_aroundBody22(MorphoDevice ajc$this, byte[] serialNumber, byte[] sign, ArrayList csr, ArrayList productCertif, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (serialNumber == null || sign == null || csr == null) {
            return -5;
        }
        if (productCertif == null) {
            return -5;
        }
        return morphoDeviceNative.SecuGetCSR(ajc$this.morphoDevicePointerCPP.longValue(), serialNumber, sign, csr, productCertif);
    }

    private static final /* synthetic */ int secuGetChallenge_aroundBody24(MorphoDevice ajc$this, byte[] cryptogram1, byte[] sign, ArrayList cryptogram2, ArrayList devSign, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (cryptogram1 == null || sign == null || cryptogram2 == null) {
            return -5;
        }
        if (devSign == null) {
            return -5;
        }
        return morphoDeviceNative.SecuGetChallenge(ajc$this.morphoDevicePointerCPP.longValue(), cryptogram1, sign, cryptogram2, devSign);
    }

    private static final /* synthetic */ int configureRootCA_WithResetOpts_aroundBody26(MorphoDevice ajc$this, DeviceReqOptionType deviceReqOptionType, DeviceResetOptionType deviceResetOptionType, MorphoSecurityParameters securityParameters, byte[] rootPKCS12Certif, byte[] rootPKCSPassword, byte[] cryptoData, byte[] signData, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (deviceReqOptionType == null || deviceResetOptionType == null) {
            return -5;
        }
        return morphoDeviceNative.SecuConfigureRootCAWithResetOpts(ajc$this.morphoDevicePointerCPP.longValue(), deviceReqOptionType.getValue(), deviceResetOptionType.getValue(), securityParameters, rootPKCS12Certif, rootPKCSPassword, cryptoData, signData);
    }

    private static final /* synthetic */ int configPkcs12WithPassword_aroundBody28(MorphoDevice ajc$this, byte[] certData, byte[] passphrase, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (certData == null || passphrase == null) {
            return -5;
        }
        return morphoDeviceNative.SecuConfigPkcs12WithPassword(ajc$this.morphoDevicePointerCPP.longValue(), certData, passphrase);
    }

    private static final /* synthetic */ int deviceFactoryReset_aroundBody30(MorphoDevice ajc$this, byte[] serialNum, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (serialNum == null) {
            return -5;
        }
        return morphoDeviceNative.DeviceFactoryReset(ajc$this.morphoDevicePointerCPP.longValue(), serialNum);
    }

    private static final /* synthetic */ int uploadTrustChain_aroundBody32(MorphoDevice ajc$this, byte[] chainPath, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (chainPath == null) {
            return -5;
        }
        return morphoDeviceNative.SecuUploadTrustChain(ajc$this.morphoDevicePointerCPP.longValue(), chainPath);
    }

    public int setSecurityLevel(SecurityLevel securityLevel) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (securityLevel == null) {
            return -5;
        }
        return morphoDeviceNative.setSecurityLevel(this.morphoDevicePointerCPP.longValue(), securityLevel.getValue());
    }

    public int getSecurityLevel() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.getSecurityLevel(this.morphoDevicePointerCPP.longValue());
    }

    public int setLoggingMode(MorphoLogMode morphoLogMode) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoLogMode == null) {
            return -5;
        }
        return morphoDeviceNative.setLoggingMode(this.morphoDevicePointerCPP.longValue(), morphoLogMode.getCode());
    }

    public int setLoggingLevelOfGroup(int groupID, MorphoLogLevel morphoLogLevel) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (morphoLogLevel == null) {
            return -5;
        }
        return morphoDeviceNative.setLoggingLevelOfGroup(this.morphoDevicePointerCPP.longValue(), groupID, morphoLogLevel.getCode());
    }

    public int setStrategyAcquisitionMode(StrategyAcquisitionMode strategyAcquisitionMode) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (strategyAcquisitionMode == null) {
            return -5;
        }
        return morphoDeviceNative.setStrategyAcquisitionMode(this.morphoDevicePointerCPP.longValue(), strategyAcquisitionMode.getCode());
    }

    public StrategyAcquisitionMode getStrategyAcquisitionMode() {
        if (!this.cppMemOwn) {
            return null;
        }
        int ret = morphoDeviceNative.getStrategyAcquisitionMode(this.morphoDevicePointerCPP.longValue());
        return StrategyAcquisitionMode.getValue(ret);
    }

    public int getComType() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.getComType(this.morphoDevicePointerCPP.longValue());
    }

    public byte[] getConfigParam(int parameterIdentifier) {
        if (!this.cppMemOwn) {
            return null;
        }
        return morphoDeviceNative.getConfigParam(this.morphoDevicePointerCPP.longValue(), parameterIdentifier);
    }

    public String getStringDescriptorBin(DescriptorID descriptorIdentifier) {
        if (descriptorIdentifier == null) {
            try {
                throw new MorphoSmartException("DescriptorID object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
        return morphoDeviceNative.getStringDescriptorBin(this.morphoDevicePointerCPP.longValue(), descriptorIdentifier.getValue());
    }

    public int getIntDescriptorBin(DescriptorID descriptorIdentifier) {
        if (descriptorIdentifier == null) {
            try {
                throw new MorphoSmartException("DescriptorID object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
        return morphoDeviceNative.getIntDescriptorBin(this.morphoDevicePointerCPP.longValue(), descriptorIdentifier.getValue());
    }

    public String getFFDLogs() {
        if (!this.cppMemOwn) {
            try {
                throw new MorphoSmartException("MorphoDevice object is null");
            } catch (MorphoSmartException e) {
                e.printStackTrace();
            }
        }
        return morphoDeviceNative.getFFDLogs(this.morphoDevicePointerCPP.longValue());
    }

    public int getInternalError() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.getInternalError(this.morphoDevicePointerCPP.longValue());
    }

    private static final /* synthetic */ int getImage_aroundBody34(MorphoDevice ajc$this, int timeOut, int acquisitionThreshold, CompressionAlgorithm compressAlgo, int compressRate, int detectModeChoice, LatentDetection latentDetection, MorphoImage morphoImage, int callbackCmd, Observer callback, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (compressAlgo == null || latentDetection == null || morphoImage == null) {
            return -5;
        }
        return morphoDeviceNative.getImage(ajc$this.morphoDevicePointerCPP.longValue(), timeOut, acquisitionThreshold, compressAlgo.getCode(), compressRate, detectModeChoice, latentDetection.getValue(), morphoImage, callbackCmd, callback);
    }

    public int getSecuConfig(SecuConfig secuConfig) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (secuConfig == null) {
            return -5;
        }
        return morphoDeviceNative.getSecuConfig(this.morphoDevicePointerCPP.longValue(), secuConfig);
    }

    public byte[] getUnlockSeed() {
        if (!this.cppMemOwn) {
            return null;
        }
        return morphoDeviceNative.getUnlockSeed(this.morphoDevicePointerCPP.longValue());
    }

    public String getUsbDeviceName(int index) {
        if (!this.cppMemOwn) {
            return "";
        }
        return morphoDeviceNative.getUsbDeviceName(this.morphoDevicePointerCPP.longValue(), index);
    }

    public String getOpenedUsbDeviceName() {
        if (!this.cppMemOwn) {
            return "";
        }
        return morphoDeviceNative.getOpenedUsbDeviceName(this.morphoDevicePointerCPP.longValue());
    }

    public int initUsbDevicesNameEnum(CustomInteger nbUsbDevice) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (nbUsbDevice == null) {
            return -5;
        }
        if (ErrorCodes.IntegrerInitializationValueOf(nbUsbDevice).booleanValue()) {
            return -94;
        }
        return morphoDeviceNative.initUsbDevicesNameEnum(this.morphoDevicePointerCPP.longValue(), nbUsbDevice);
    }

    public String getUsbDevicePropertie(int index) {
        if (!this.cppMemOwn) {
            return "";
        }
        return morphoDeviceNative.getUsbDevicePropertie(this.morphoDevicePointerCPP.longValue(), index);
    }

    public boolean isCSEnabled() {
        if (!this.cppMemOwn) {
            return false;
        }
        return morphoDeviceNative.isCSEnabled(this.morphoDevicePointerCPP.longValue());
    }

    public boolean isDataEncryptionEnabled() {
        if (!this.cppMemOwn) {
            return false;
        }
        return morphoDeviceNative.isDataEncryptionEnabled(this.morphoDevicePointerCPP.longValue());
    }

    public int getPrivacyModeStatus(MorphoDevicePrivacyModeStatus[] status) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (status == null) {
            return -5;
        }
        return morphoDeviceNative.getPrivacyModeStatus(this.morphoDevicePointerCPP.longValue(), status);
    }

    public int setPrivacyModeStatus(MorphoDevicePrivacyModeStatus status, MorphoDevicePrivacyModeDBProcessingChoice dbProcessing) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.setPrivacyModeStatus(this.morphoDevicePointerCPP.longValue(), status.getValue(), dbProcessing.getValue());
    }

    public int loadKprivacy(byte[] key) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (key == null) {
            return -5;
        }
        return morphoDeviceNative.loadKprivacy(this.morphoDevicePointerCPP.longValue(), key);
    }

    public int loadKprivacyFirstTime(byte[] cryptedPrivacyKey, byte[] cryptogram) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (cryptedPrivacyKey == null || cryptogram == null) {
            return -5;
        }
        return morphoDeviceNative.loadKprivacyFirstTime(this.morphoDevicePointerCPP.longValue(), cryptedPrivacyKey, cryptogram);
    }

    public int loadKprivacySecurely(byte[] key, byte[] cryptogram) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (key == null || cryptogram == null) {
            return -5;
        }
        return morphoDeviceNative.loadKprivacySecurely(this.morphoDevicePointerCPP.longValue(), key, cryptogram);
    }

    public int loadKprivacySecurely(byte[] key, byte[] signature, byte[] host_certificate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (key == null || signature == null) {
            return -5;
        }
        if (host_certificate == null) {
            return -5;
        }
        return morphoDeviceNative.loadKprivacySecurelyAsymmetric(this.morphoDevicePointerCPP.longValue(), key, signature, host_certificate);
    }

    public byte[] getPrivacySeed() {
        if (!this.cppMemOwn) {
            return null;
        }
        return morphoDeviceNative.getPrivacySeed(this.morphoDevicePointerCPP.longValue());
    }

    public int rebootSoft(int timeOut, Observer callback) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (this._reboot != null && this._reboot.isAlive()) {
            return -96;
        }
        int ret = morphoDeviceNative.rebootSoft(this.morphoDevicePointerCPP.longValue());
        if (ret == 0) {
            this._reboot = new ResumeConnectionThread();
            this._reboot.setTimeOut(timeOut);
            this._reboot.setDevice(this);
            this._reboot.setObserver(callback);
            this._reboot.setDeviceName(this.deviceSN);
            this._reboot.setDeviceOpenWithFD(this.deviceOpenedWithFD);
            this._reboot.setDeviceOpenWithPipe(this.deviceOpenedWithPipe);
            this._reboot.setPipeParameters(this.pipeCallBack, this.pipeIP, this.pipePort, this.pipeTimeout);
            this._reboot.setDeviceOpenWithUart(this.deviceOpenedWithUart);
            this._reboot.setUartParameters(this.uartPort, this.uartBaudrate);
            this._reboot.setSecurityParameters(this.isTunnelingMode, this.isOfferedSecurityMode, this._msoSecu, this._hostCertificate);
            this._reboot.start();
        }
        return ret;
    }

    public int unlock(byte[] secretID, byte[] cipheredSeed) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (secretID == null || cipheredSeed == null) {
            return -5;
        }
        return morphoDeviceNative.unlock(this.morphoDevicePointerCPP.longValue(), secretID, cipheredSeed);
    }

    public int unlock(String secretID, String cipheredSeed) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (secretID == null || cipheredSeed == null) {
            return -5;
        }
        return morphoDeviceNative.unlock(this.morphoDevicePointerCPP.longValue(), secretID.getBytes(), cipheredSeed.getBytes());
    }

    private static final /* synthetic */ int verify_aroundBody36(MorphoDevice ajc$this, int timeOut, int far, Coder coder, int detectModeChoice, int matchingStrategy, TemplateList templateList, int callbackCmd, Observer callback, ResultMatching resultMatching, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (coder == null || templateList == null) {
            return -5;
        }
        return morphoDeviceNative.verify(ajc$this.morphoDevicePointerCPP.longValue(), timeOut, far, coder.getCode(), detectModeChoice, matchingStrategy, templateList, callbackCmd, callback, resultMatching);
    }

    private static final /* synthetic */ int verifyMatch_aroundBody38(MorphoDevice ajc$this, int far, TemplateList templateListSearch, TemplateList templateListReference, CustomInteger matchingScore, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (templateListSearch != null && templateListReference != null) {
            if (ErrorCodes.IntegrerInitializationValueOf(matchingScore).booleanValue()) {
                return -94;
            }
            return morphoDeviceNative.verifyMatch(ajc$this.morphoDevicePointerCPP.longValue(), far, templateListSearch, templateListReference, matchingScore);
        }
        return -5;
    }

    public byte[] getKCV(MorphoKCVID keyID, byte[] secretID) {
        if (this.cppMemOwn && keyID != null) {
            return morphoDeviceNative.getKCV(this.morphoDevicePointerCPP.longValue(), keyID.getCode(), secretID);
        }
        return null;
    }

    public String getKCV(int keyID) {
        return null;
    }

    private static final /* synthetic */ int comSend_aroundBody40(MorphoDevice ajc$this, int timeOut, byte[] data, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (data == null) {
            return -5;
        }
        return morphoDeviceNative.comSend(ajc$this.morphoDevicePointerCPP.longValue(), timeOut, data);
    }

    private static final /* synthetic */ byte[] comReceive_aroundBody42(MorphoDevice ajc$this, int timeOut, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return null;
        }
        return morphoDeviceNative.comReceive(ajc$this.morphoDevicePointerCPP.longValue(), timeOut);
    }

    private static final /* synthetic */ int loadKs_aroundBody44(MorphoDevice ajc$this, byte[] key, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (key == null) {
            return -5;
        }
        return morphoDeviceNative.loadKs(ajc$this.morphoDevicePointerCPP.longValue(), key);
    }

    public int loadKsSecurely(byte[] key) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (key == null) {
            return -5;
        }
        return morphoDeviceNative.loadKsSecurely(this.morphoDevicePointerCPP.longValue(), key);
    }

    public int loadKsSecurely(byte[] key, byte[] signature, byte[] host_certificate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        if (key == null || signature == null) {
            return -5;
        }
        if (host_certificate == null) {
            return -5;
        }
        return morphoDeviceNative.loadKsSecurely(this.morphoDevicePointerCPP.longValue(), key, signature, host_certificate);
    }

    private static final /* synthetic */ int loadMocKey_aroundBody46(MorphoDevice ajc$this, byte[] key_enc_Ciffered_by_Certificate, byte[] key_enc_Ciffered_by_Certificate_Signature, byte[] hostCertificate, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (key_enc_Ciffered_by_Certificate == null || key_enc_Ciffered_by_Certificate_Signature == null) {
            return -5;
        }
        if (hostCertificate == null) {
            return -5;
        }
        return morphoDeviceNative.loadMocKey(ajc$this.morphoDevicePointerCPP.longValue(), key_enc_Ciffered_by_Certificate, key_enc_Ciffered_by_Certificate_Signature, hostCertificate);
    }

    private static final /* synthetic */ int loadMocKey_aroundBody48(MorphoDevice ajc$this, byte[] key_enc_Ciffered_by_KencTrans, JoinPoint joinPoint) {
        if (!ajc$this.cppMemOwn) {
            return -98;
        }
        if (key_enc_Ciffered_by_KencTrans == null) {
            return -5;
        }
        return morphoDeviceNative.loadMocKey(ajc$this.morphoDevicePointerCPP.longValue(), key_enc_Ciffered_by_KencTrans);
    }

    public int offeredSecuOpen(IMsoSecu msosecuCallbackObject) {
        if (!this.cppMemOwn) {
            return -98;
        }
        createScreenReceiver();
        int ret = morphoDeviceNative.OfferedSecuOpen(this.morphoDevicePointerCPP.longValue(), msosecuCallbackObject);
        if (ret == 0) {
            this.isTunnelingMode = false;
            this.isOfferedSecurityMode = true;
            this._msoSecu = msosecuCallbackObject;
            this._hostCertificate = null;
        }
        return ret;
    }

    public int offeredSecuClose() {
        if (!this.cppMemOwn) {
            return -98;
        }
        USBManager.getInstance();
        USBManager.unRegister(this.context, this.screenReceiver);
        int ret = morphoDeviceNative.OfferedSecuClose(this.morphoDevicePointerCPP.longValue());
        if (ret == 0) {
            this.isTunnelingMode = false;
            this.isOfferedSecurityMode = false;
            this._msoSecu = null;
            this._hostCertificate = null;
        }
        return ret;
    }

    public int tunnelingOpen(IMsoSecu msosecuCallbackObject, byte[] hostCertificate) {
        if (!this.cppMemOwn) {
            return -98;
        }
        createScreenReceiver();
        int ret = morphoDeviceNative.TunnelingOpen(this.morphoDevicePointerCPP.longValue(), msosecuCallbackObject, hostCertificate);
        if (ret == 0) {
            this.isTunnelingMode = true;
            this.isOfferedSecurityMode = false;
            this._msoSecu = msosecuCallbackObject;
            this._hostCertificate = hostCertificate;
        }
        return ret;
    }

    public int tunnelingClose() {
        if (!this.cppMemOwn) {
            return -98;
        }
        USBManager.getInstance();
        USBManager.unRegister(this.context, this.screenReceiver);
        int ret = morphoDeviceNative.TunnelingClose(this.morphoDevicePointerCPP.longValue());
        if (ret == 0) {
            this.isTunnelingMode = false;
            this.isOfferedSecurityMode = false;
            this._msoSecu = null;
            this._hostCertificate = null;
        }
        return ret;
    }

    public byte[] getUserAreaData() {
        if (!this.cppMemOwn) {
            return null;
        }
        return morphoDeviceNative.getUserAreaData(this.morphoDevicePointerCPP.longValue());
    }

    public int setUserAreaData(byte[] userAreaData) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.setUserAreaData(this.morphoDevicePointerCPP.longValue(), userAreaData);
    }

    public int removeUserAreaData() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.removeUserAreaData(this.morphoDevicePointerCPP.longValue());
    }

    public int getDeviceCapability(MorphoDeviceDeviceCapability[] status) {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.getDeviceCapability(this.morphoDevicePointerCPP.longValue(), status);
    }

    public int forceActivateHost() {
        if (!this.cppMemOwn) {
            return -98;
        }
        return morphoDeviceNative.forceActivateHost(this.morphoDevicePointerCPP.longValue());
    }

    public boolean isHostCapable() {
        if (!this.cppMemOwn) {
            return false;
        }
        return morphoDeviceNative.isHostCapable(this.morphoDevicePointerCPP.longValue());
    }

    public class ScreenBroadcastReceiver extends BroadcastReceiver {
        private MorphoDevice device = null;

        public ScreenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            intent.getAction();
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                USBManager.getInstance();
                if (USBManager.WakeLockEnabled) {
                    Thread thread = new Thread() { // from class: com.morpho.morphosmart.sdk.MorphoDevice.ScreenBroadcastReceiver.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            if (ScreenBroadcastReceiver.this.device != null) {
                                ScreenBroadcastReceiver.this.device.cancelLiveAcquisition();
                            }
                        }
                    };
                    thread.start();
                }
            }
        }

        public void setDevice(MorphoDevice device) {
            this.device = device;
        }
    }
}
