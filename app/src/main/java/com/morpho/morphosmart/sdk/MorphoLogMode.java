package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoLogMode {
    MORPHO_LOG_ENABLE(0, "Enable"),
    MORPHO_LOG_DISABLE(1, "Disable");

    private int code;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoLogMode[] valuesCustom() {
        MorphoLogMode[] morphoLogModeArrValuesCustom = values();
        int length = morphoLogModeArrValuesCustom.length;
        MorphoLogMode[] morphoLogModeArr = new MorphoLogMode[length];
        System.arraycopy(morphoLogModeArrValuesCustom, 0, morphoLogModeArr, 0, length);
        return morphoLogModeArr;
    }

    public int getCode() {
        return this.code;
    }

    MorphoLogMode(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static MorphoLogMode fromString(String label) {
        if (label != null) {
            for (MorphoLogMode value : valuesCustom()) {
                if (label.equalsIgnoreCase(value.getLabel())) {
                    return value;
                }
            }
            return null;
        }
        return null;
    }
}
