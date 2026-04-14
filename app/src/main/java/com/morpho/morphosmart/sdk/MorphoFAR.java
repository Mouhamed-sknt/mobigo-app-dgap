package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoFAR {
    MORPHO_FAR_0(0),
    MORPHO_FAR_1(1),
    MORPHO_FAR_2(2),
    MORPHO_FAR_3(3),
    MORPHO_FAR_4(4),
    MORPHO_FAR_5(5),
    MORPHO_FAR_6(6),
    MORPHO_FAR_7(7),
    MORPHO_FAR_8(8),
    MORPHO_FAR_9(9),
    MORPHO_FAR_10(10);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoFAR[] valuesCustom() {
        MorphoFAR[] morphoFARArrValuesCustom = values();
        int length = morphoFARArrValuesCustom.length;
        MorphoFAR[] morphoFARArr = new MorphoFAR[length];
        System.arraycopy(morphoFARArrValuesCustom, 0, morphoFARArr, 0, length);
        return morphoFARArr;
    }

    MorphoFAR(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
