package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum StrategyAcquisitionMode {
    MORPHO_ACQ_EXPERT_MODE(0, "Expert(Default)"),
    MORPHO_ACQ_UNIVERSAL_FAST_MODE(1, "Fast(Standard)"),
    MORPHO_ACQ_UNIVERSAL_ACCURATE_MODE(2, "Slow(Accurate)"),
    MORPHO_ACQ_FULL_MULTIMODAL_MODE(3, "Full MultiModal"),
    MORPHO_ACQ_ANTI_SPOOFING_MODE(4, "Anti Spoofing");

    private int code;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static StrategyAcquisitionMode[] valuesCustom() {
        StrategyAcquisitionMode[] strategyAcquisitionModeArrValuesCustom = values();
        int length = strategyAcquisitionModeArrValuesCustom.length;
        StrategyAcquisitionMode[] strategyAcquisitionModeArr = new StrategyAcquisitionMode[length];
        System.arraycopy(strategyAcquisitionModeArrValuesCustom, 0, strategyAcquisitionModeArr, 0, length);
        return strategyAcquisitionModeArr;
    }

    public int getCode() {
        return this.code;
    }

    public String getLabel() {
        return this.label;
    }

    StrategyAcquisitionMode(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public static StrategyAcquisitionMode fromString(String label) {
        if (label != null) {
            for (StrategyAcquisitionMode value : valuesCustom()) {
                if (label.equalsIgnoreCase(value.getLabel())) {
                    return value;
                }
            }
            return null;
        }
        return null;
    }

    public static StrategyAcquisitionMode getValue(int id) {
        StrategyAcquisitionMode[] strategyAcquisitionModes = valuesCustom();
        for (int i = 0; i < strategyAcquisitionModes.length; i++) {
            if (strategyAcquisitionModes[i].code == id) {
                return strategyAcquisitionModes[i];
            }
        }
        return null;
    }
}
