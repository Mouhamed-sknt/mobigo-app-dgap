package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoDeviceConnectionType {
    COM_TYPE_NOT_SET(0),
    RS232_COM_TYPE(1),
    USB_COM_TYPE(2),
    USER_COM_TYPE(3);

    private int code;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoDeviceConnectionType[] valuesCustom() {
        MorphoDeviceConnectionType[] morphoDeviceConnectionTypeArrValuesCustom = values();
        int length = morphoDeviceConnectionTypeArrValuesCustom.length;
        MorphoDeviceConnectionType[] morphoDeviceConnectionTypeArr = new MorphoDeviceConnectionType[length];
        System.arraycopy(morphoDeviceConnectionTypeArrValuesCustom, 0, morphoDeviceConnectionTypeArr, 0, length);
        return morphoDeviceConnectionTypeArr;
    }

    public int getCode() {
        return this.code;
    }

    MorphoDeviceConnectionType(int code) {
        this.code = code;
    }
}
