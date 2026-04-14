package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum TemplateSettings {
    SETTINGS_ONLY_SIGNED_TEMPLATE(0),
    TKB_SETTINGS_SIGNED_BOTH_TEMPLATE(1),
    TKB_SETTINGS_DEVICE_DEFAULT(255);

    private int value;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static TemplateSettings[] valuesCustom() {
        TemplateSettings[] templateSettingsArrValuesCustom = values();
        int length = templateSettingsArrValuesCustom.length;
        TemplateSettings[] templateSettingsArr = new TemplateSettings[length];
        System.arraycopy(templateSettingsArrValuesCustom, 0, templateSettingsArr, 0, length);
        return templateSettingsArr;
    }

    TemplateSettings(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
