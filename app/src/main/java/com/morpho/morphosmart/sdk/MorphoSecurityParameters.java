package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public class MorphoSecurityParameters {
    private MatchingScore matchingScore;
    private MorphoFAR morphoFar;
    private TemplateSettings templateSettings;

    public int getTemplateSettings() {
        return this.templateSettings.getValue();
    }

    public void setTemplateSettings(TemplateSettings templateSettings) {
        this.templateSettings = templateSettings;
    }

    public int getMatchingScore() {
        return this.matchingScore.getValue();
    }

    public void setMatchingScore(MatchingScore matchingScore) {
        this.matchingScore = matchingScore;
    }

    public int getMorphoFar() {
        return this.morphoFar.getValue();
    }

    public void setMorphoFar(MorphoFAR morphoFar) {
        this.morphoFar = morphoFar;
    }
}
