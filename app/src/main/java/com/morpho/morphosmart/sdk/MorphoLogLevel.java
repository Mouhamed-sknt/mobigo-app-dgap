package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoLogLevel {
    MORPHO_LOG_NOLOG(0, "No Log"),
    MORPHO_LOG_ERROR(1, "Error"),
    MORPHO_LOG_WARNING(2, "Warning"),
    MORPHO_LOG_INFO(3, "Info"),
    MORPHO_LOG_DEBUG(4, "Debug");

    private int code;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoLogLevel[] valuesCustom() {
        MorphoLogLevel[] morphoLogLevelArrValuesCustom = values();
        int length = morphoLogLevelArrValuesCustom.length;
        MorphoLogLevel[] morphoLogLevelArr = new MorphoLogLevel[length];
        System.arraycopy(morphoLogLevelArrValuesCustom, 0, morphoLogLevelArr, 0, length);
        return morphoLogLevelArr;
    }

    public int getCode() {
        return this.code;
    }

    MorphoLogLevel(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static MorphoLogLevel fromString(String label) {
        if (label != null) {
            for (MorphoLogLevel value : valuesCustom()) {
                if (label.equalsIgnoreCase(value.getLabel())) {
                    return value;
                }
            }
            return null;
        }
        return null;
    }
}
