package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum DeviceReqOptionType {
    CA_INSTALL_DEV(0),
    DEACTIVATE_TUNNELING_KEEP_CA_DEV(1),
    DEACTIVATE_TUNNELING_REMOVE_CA_DEV(2),
    UPDATE_CA_DEV(3);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static DeviceReqOptionType[] valuesCustom() {
        DeviceReqOptionType[] deviceReqOptionTypeArrValuesCustom = values();
        int length = deviceReqOptionTypeArrValuesCustom.length;
        DeviceReqOptionType[] deviceReqOptionTypeArr = new DeviceReqOptionType[length];
        System.arraycopy(deviceReqOptionTypeArrValuesCustom, 0, deviceReqOptionTypeArr, 0, length);
        return deviceReqOptionTypeArr;
    }

    DeviceReqOptionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
