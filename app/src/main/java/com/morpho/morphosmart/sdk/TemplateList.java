package com.morpho.morphosmart.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TemplateList {
    private ArrayList<Template> templateList = new ArrayList<>();
    private ArrayList<TemplateFVP> templateFVPList = new ArrayList<>();
    private ArrayList<MorphoImage> morphoImages = new ArrayList<>();
    private boolean activateFullImageRetrieving = false;

    public void putTemplate(Template template) {
        this.templateList.add(template);
    }

    public void setImage(MorphoImage morphoImage) {
        this.morphoImages.add(morphoImage);
    }

    public MorphoImage getImage(int imageIndex) {
        if (imageIndex < this.morphoImages.size()) {
            return this.morphoImages.get(imageIndex);
        }
        return null;
    }

    public int getNbTemplate() {
        return this.templateList.size();
    }

    public Template getTemplate(int templateIndex) {
        if (templateIndex < this.templateList.size()) {
            return this.templateList.get(templateIndex);
        }
        return null;
    }

    public void putFVPTemplate(TemplateFVP templateFVP) {
        this.templateFVPList.add(templateFVP);
    }

    public int getNbFVPTemplate() {
        return this.templateFVPList.size();
    }

    public TemplateFVP getFVPTemplate(int templateFVPIndex) {
        if (templateFVPIndex < this.templateFVPList.size()) {
            return this.templateFVPList.get(templateFVPIndex);
        }
        return null;
    }

    public boolean isActivateFullImageRetrieving() {
        return this.activateFullImageRetrieving;
    }

    public void setActivateFullImageRetrieving(boolean activateFullImageRetrieving) {
        this.activateFullImageRetrieving = activateFullImageRetrieving;
    }
}
