package com.morpho.morphosmart.sdk;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
public enum CompressionAlgorithm {
    NO_IMAGE(-1, "NO IMAGE", ""),
    MORPHO_NO_COMPRESS(0, "RAW", ".raw"),
    MORPHO_COMPRESS_V1(1, "SAGEM_V1", ".bin"),
    MORPHO_COMPRESS_WSQ(2, "WSQ", ".wsq");

    private int code;
    private String extension;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CompressionAlgorithm[] valuesCustom() {
        CompressionAlgorithm[] compressionAlgorithmArrValuesCustom = values();
        int length = compressionAlgorithmArrValuesCustom.length;
        CompressionAlgorithm[] compressionAlgorithmArr = new CompressionAlgorithm[length];
        System.arraycopy(compressionAlgorithmArrValuesCustom, 0, compressionAlgorithmArr, 0, length);
        return compressionAlgorithmArr;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    public String getExtension() {
        return this.extension;
    }

    CompressionAlgorithm(int code, String label, String extension) {
        this.code = code;
        this.label = label;
        this.extension = extension;
    }

    public static CompressionAlgorithm GetCompressionAlgorithm(int firmwareCompressionAlgorithm) {
        switch (firmwareCompressionAlgorithm) {
            case 44:
                return MORPHO_NO_COMPRESS;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                return MORPHO_COMPRESS_V1;
            case 156:
                return MORPHO_COMPRESS_WSQ;
            default:
                return MORPHO_NO_COMPRESS;
        }
    }

    protected static CompressionAlgorithm getValue(int id) {
        CompressionAlgorithm[] compressionAlgorithms = valuesCustom();
        for (int i = 0; i < compressionAlgorithms.length; i++) {
            if (compressionAlgorithms[i].code == id) {
                return compressionAlgorithms[i];
            }
        }
        return MORPHO_NO_COMPRESS;
    }
}
