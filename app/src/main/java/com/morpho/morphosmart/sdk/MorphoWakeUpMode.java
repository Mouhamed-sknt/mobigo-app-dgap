package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoWakeUpMode {
    MORPHO_WAKEUP_LED_ON(0, "Default"),
    MORPHO_WAKEUP_LED_OFF(4, "Check Wake Up Mode");

    private int code;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoWakeUpMode[] valuesCustom() {
        MorphoWakeUpMode[] morphoWakeUpModeArrValuesCustom = values();
        int length = morphoWakeUpModeArrValuesCustom.length;
        MorphoWakeUpMode[] morphoWakeUpModeArr = new MorphoWakeUpMode[length];
        System.arraycopy(morphoWakeUpModeArrValuesCustom, 0, morphoWakeUpModeArr, 0, length);
        return morphoWakeUpModeArr;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    MorphoWakeUpMode(int code, String label) {
        this.code = code;
        this.label = label;
    }
}
