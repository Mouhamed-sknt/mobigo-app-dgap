package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum MatchingScore {
    MATCHING_SCORE_DO_NOT_EXPORT_SCORE(0),
    MATCHING_SCORE_EXPORT_SCORE(1),
    MATCHING_SCORE_DEVICE_DEFAULT(255);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MatchingScore[] valuesCustom() {
        MatchingScore[] matchingScoreArrValuesCustom = values();
        int length = matchingScoreArrValuesCustom.length;
        MatchingScore[] matchingScoreArr = new MatchingScore[length];
        System.arraycopy(matchingScoreArrValuesCustom, 0, matchingScoreArr, 0, length);
        return matchingScoreArr;
    }

    MatchingScore(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
