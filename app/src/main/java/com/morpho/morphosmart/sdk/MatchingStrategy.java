package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MatchingStrategy {
    MORPHO_STANDARD_MATCHING_STRATEGY(0),
    MORPHO_ADVANCED_MATCHING_STRATEGY(1);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MatchingStrategy[] valuesCustom() {
        MatchingStrategy[] matchingStrategyArrValuesCustom = values();
        int length = matchingStrategyArrValuesCustom.length;
        MatchingStrategy[] matchingStrategyArr = new MatchingStrategy[length];
        System.arraycopy(matchingStrategyArrValuesCustom, 0, matchingStrategyArr, 0, length);
        return matchingStrategyArr;
    }

    MatchingStrategy(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getLabel() {
        if (this.value == 0) {
            return "Default";
        }
        if (this.value == 1) {
            return "Advanced";
        }
        return "";
    }

    public static MatchingStrategy fromString(String label) {
        if (label != null) {
            for (MatchingStrategy value : valuesCustom()) {
                if (label.equalsIgnoreCase(value.getLabel())) {
                    return value;
                }
            }
            return null;
        }
        return null;
    }
}
