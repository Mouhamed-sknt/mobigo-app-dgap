package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum FieldAttribute {
    MORPHO_PUBLIC_FIELD(0),
    MORPHO_PRIVATE_FIELD(1);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static FieldAttribute[] valuesCustom() {
        FieldAttribute[] fieldAttributeArrValuesCustom = values();
        int length = fieldAttributeArrValuesCustom.length;
        FieldAttribute[] fieldAttributeArr = new FieldAttribute[length];
        System.arraycopy(fieldAttributeArrValuesCustom, 0, fieldAttributeArr, 0, length);
        return fieldAttributeArr;
    }

    FieldAttribute(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
