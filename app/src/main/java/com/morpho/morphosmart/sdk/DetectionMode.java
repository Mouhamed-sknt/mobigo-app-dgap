package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum DetectionMode {
    MORPHO_DEFAULT_DETECT_MODE(0),
    MORPHO_VERIF_DETECT_MODE(1),
    MORPHO_ENROLL_DETECT_MODE(2),
    MORPHO_WAKEUP_LED_OFF(4),
    MORPHO_FORCE_FINGER_ON_TOP_DETECT_MODE(16),
    MORPHO_WAKEUP_LED_ON(64);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static DetectionMode[] valuesCustom() {
        DetectionMode[] detectionModeArrValuesCustom = values();
        int length = detectionModeArrValuesCustom.length;
        DetectionMode[] detectionModeArr = new DetectionMode[length];
        System.arraycopy(detectionModeArrValuesCustom, 0, detectionModeArr, 0, length);
        return detectionModeArr;
    }

    DetectionMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
