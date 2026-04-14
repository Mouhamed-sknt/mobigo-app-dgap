package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum CallbackMask {
    MORPHO_CALLBACK_COMMAND_CMD(1),
    MORPHO_CALLBACK_IMAGE_CMD(2),
    MORPHO_CALLBACK_ENROLLMENT_CMD(4),
    MORPHO_CALLBACK_BUSY_WARNING(6),
    MORPHO_CALLBACK_LAST_IMAGE_FULL_RES_CMD(8),
    MORPHO_CALLBACK_CODEQUALITY(64),
    MORPHO_CALLBACK_DETECTQUALITY(128);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CallbackMask[] valuesCustom() {
        CallbackMask[] callbackMaskArrValuesCustom = values();
        int length = callbackMaskArrValuesCustom.length;
        CallbackMask[] callbackMaskArr = new CallbackMask[length];
        System.arraycopy(callbackMaskArrValuesCustom, 0, callbackMaskArr, 0, length);
        return callbackMaskArr;
    }

    CallbackMask(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
