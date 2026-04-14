package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum DeviceResetOptionType {
    FCT_RESET_TUNN_NO_CHANGE(0),
    FCT_RESET_DEACTIVATE(1),
    FCT_RESET_REMOVE_CA_CERT(2),
    FCT_RESET_INVALID(255);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static DeviceResetOptionType[] valuesCustom() {
        DeviceResetOptionType[] deviceResetOptionTypeArrValuesCustom = values();
        int length = deviceResetOptionTypeArrValuesCustom.length;
        DeviceResetOptionType[] deviceResetOptionTypeArr = new DeviceResetOptionType[length];
        System.arraycopy(deviceResetOptionTypeArrValuesCustom, 0, deviceResetOptionTypeArr, 0, length);
        return deviceResetOptionTypeArr;
    }

    DeviceResetOptionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
