package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum LatentDetection {
    LATENT_DETECT_DISABLE(0),
    LATENT_DETECT_ENABLE(1);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LatentDetection[] valuesCustom() {
        LatentDetection[] latentDetectionArrValuesCustom = values();
        int length = latentDetectionArrValuesCustom.length;
        LatentDetection[] latentDetectionArr = new LatentDetection[length];
        System.arraycopy(latentDetectionArrValuesCustom, 0, latentDetectionArr, 0, length);
        return latentDetectionArr;
    }

    LatentDetection(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
