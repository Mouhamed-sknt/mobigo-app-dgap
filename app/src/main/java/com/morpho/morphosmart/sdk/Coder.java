package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum Coder {
    MORPHO_DEFAULT_CODER(0, "Default"),
    MORPHO_MSO_V9_CODER(3, "Standard"),
    MORPHO_MSO_V9_JUV_CODER(7, "Juvenile"),
    MORPHO_MSO_V9_THIN_FINGER_CODER(8, "Thin Finger");

    private int code;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Coder[] valuesCustom() {
        Coder[] coderArrValuesCustom = values();
        int length = coderArrValuesCustom.length;
        Coder[] coderArr = new Coder[length];
        System.arraycopy(coderArrValuesCustom, 0, coderArr, 0, length);
        return coderArr;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    Coder(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static Coder fromString(String label) {
        if (label != null) {
            for (Coder value : valuesCustom()) {
                if (label.equalsIgnoreCase(value.getLabel())) {
                    return value;
                }
            }
            return null;
        }
        return null;
    }
}
