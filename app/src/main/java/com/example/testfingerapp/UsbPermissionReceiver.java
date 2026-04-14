package com.example.testfingerapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class UsbPermissionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        UsbDevice device;
        String action = intent.getAction();
        if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action) && (device = (UsbDevice) intent.getParcelableExtra("device")) != null) {
            Log.d("UsbPermissionReceiver", "Périphérique attaché : " + device.getDeviceName());
            Intent i = new Intent(context, (Class<?>) MainActivity.class);
            i.addFlags(268435456);
            context.startActivity(i);
        }
    }
}
