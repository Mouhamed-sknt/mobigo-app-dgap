package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MorphoKCVID {
    ID_KENC(0),
    ID_KSECRET(1),
    ID_KS(2),
    ID_KPRIVACY(3);

    private int code;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MorphoKCVID[] valuesCustom() {
        MorphoKCVID[] morphoKCVIDArrValuesCustom = values();
        int length = morphoKCVIDArrValuesCustom.length;
        MorphoKCVID[] morphoKCVIDArr = new MorphoKCVID[length];
        System.arraycopy(morphoKCVIDArrValuesCustom, 0, morphoKCVIDArr, 0, length);
        return morphoKCVIDArr;
    }

    public int getCode() {
        return this.code;
    }

    MorphoKCVID(int code) {
        this.code = code;
    }
}
