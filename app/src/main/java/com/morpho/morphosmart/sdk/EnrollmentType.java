package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum EnrollmentType {
    ONE_ACQUISITIONS(1),
    THREE_ACQUISITIONS(0);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnrollmentType[] valuesCustom() {
        EnrollmentType[] enrollmentTypeArrValuesCustom = values();
        int length = enrollmentTypeArrValuesCustom.length;
        EnrollmentType[] enrollmentTypeArr = new EnrollmentType[length];
        System.arraycopy(enrollmentTypeArrValuesCustom, 0, enrollmentTypeArr, 0, length);
        return enrollmentTypeArr;
    }

    EnrollmentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
