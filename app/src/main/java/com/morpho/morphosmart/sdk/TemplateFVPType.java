package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum TemplateFVPType implements ITemplateType {
    MORPHO_NO_PK_FVP(0, "NO PK FVP", ""),
    MORPHO_PK_FVP(1, "SAGEM PkFVP", ".fvp"),
    MORPHO_PK_FVP_MATCH(2, "SAGEM PkFVP Match", ".fvp-m");

    private int code;
    private String extension;
    private String label;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static TemplateFVPType[] valuesCustom() {
        TemplateFVPType[] templateFVPTypeArrValuesCustom = values();
        int length = templateFVPTypeArrValuesCustom.length;
        TemplateFVPType[] templateFVPTypeArr = new TemplateFVPType[length];
        System.arraycopy(templateFVPTypeArrValuesCustom, 0, templateFVPTypeArr, 0, length);
        return templateFVPTypeArr;
    }

    @Override // com.morpho.morphosmart.sdk.ITemplateType
    public int getCode() {
        return this.code;
    }

    @Override // com.morpho.morphosmart.sdk.ITemplateType
    public String getLabel() {
        return this.label;
    }

    @Override // com.morpho.morphosmart.sdk.ITemplateType
    public String getExtension() {
        return this.extension;
    }

    TemplateFVPType(int code, String label, String extension) {
        this.code = code;
        this.label = label;
        this.extension = extension;
    }

    protected static TemplateFVPType getValue(int id) {
        TemplateFVPType[] templateFVPTypes = valuesCustom();
        for (int i = 0; i < templateFVPTypes.length; i++) {
            if (templateFVPTypes[i].code == id) {
                return templateFVPTypes[i];
            }
        }
        return MORPHO_NO_PK_FVP;
    }
}
