package com.morpho.morphosmart.sdk;

/* JADX INFO: loaded from: classes.dex */
public class MorphoString {
    private String data = new String();
    private byte[] bufferData = null;

    public String getData() {
        return this.data;
    }

    public byte[] getBufferData() {
        return this.bufferData;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setBufferData(byte[] bufferData) {
        this.bufferData = bufferData;
    }
}
