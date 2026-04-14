package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoTypeDeletion {
    MORPHO_ERASE_BASE(0),
    MORPHO_DESTROY_BASE(1);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoTypeDeletion[] valuesCustom() {
        MorphoTypeDeletion[] morphoTypeDeletionArrValuesCustom = values();
        int length = morphoTypeDeletionArrValuesCustom.length;
        MorphoTypeDeletion[] morphoTypeDeletionArr = new MorphoTypeDeletion[length];
        System.arraycopy(morphoTypeDeletionArrValuesCustom, 0, morphoTypeDeletionArr, 0, length);
        return morphoTypeDeletionArr;
    }

    MorphoTypeDeletion(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
