package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public class MorphoField {
    public static final int MORPHO_FIELD_NAME_LEN = 6;
    private FieldAttribute fieldAttribute;
    private int maxSize;
    private String name;

    public FieldAttribute getFieldAttribute() {
        return this.fieldAttribute;
    }

    public int getFieldAttributeIntValue() {
        return this.fieldAttribute.ordinal();
    }

    public void setFieldAttribute(FieldAttribute fieldAttribute) {
        this.fieldAttribute = fieldAttribute;
    }

    public void setFieldAttributeIntValue(int fieldAttributeInteger) {
        switch (fieldAttributeInteger) {
            case 0:
                this.fieldAttribute = FieldAttribute.MORPHO_PUBLIC_FIELD;
                break;
            case 1:
                this.fieldAttribute = FieldAttribute.MORPHO_PRIVATE_FIELD;
                break;
        }
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws MorphoSmartException {
        if (name != null) {
            if (name.length() > 6) {
                throw new MorphoSmartException("Invalid field size, field size must be less than equal to 6");
            }
            this.name = name;
            return;
        }
        throw new MorphoSmartException("Invalid parameter");
    }
}
