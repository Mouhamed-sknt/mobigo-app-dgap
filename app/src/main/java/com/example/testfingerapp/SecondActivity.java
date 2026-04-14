package com.example.testfingerapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.morpho.android.usb.USBManager;
import com.morpho.morphosmart.sdk.Coder;
import com.morpho.morphosmart.sdk.CompressionAlgorithm;
import com.morpho.morphosmart.sdk.CustomInteger;
import com.morpho.morphosmart.sdk.EnrollmentType;
import com.morpho.morphosmart.sdk.LatentDetection;
import com.morpho.morphosmart.sdk.MatchingStrategy;
import com.morpho.morphosmart.sdk.MorphoDevice;
import com.morpho.morphosmart.sdk.ResultMatching;
import com.morpho.morphosmart.sdk.TemplateFVPType;
import com.morpho.morphosmart.sdk.TemplateList;
import com.morpho.morphosmart.sdk.TemplateType;

/* JADX INFO: loaded from: classes3.dex */
public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MorphoSample";
    private Button btnEnroll;
    private Button btnVerify;
    private TemplateList enrolledTemplate;
    private MorphoDevice morphoDevice;
    private TextView statusText;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.statusText = (TextView) findViewById(R.id.statusText);
        //this.btnEnroll = (Button) findViewById(R.id.btnEnroll);
       // this.btnVerify = (Button) findViewById(R.id.btnVerify);
        this.morphoDevice = new MorphoDevice();
        initMorpho();
        this.btnEnroll.setOnClickListener(new View.OnClickListener() { // from class: com.example.testfingerapp.SecondActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                // A decommenter
                // this.f$0.m55lambda$onCreate$0$comexampletestfingerappSecondActivity(view);
            }
        });
        this.btnVerify.setOnClickListener(new View.OnClickListener() { // from class: com.example.testfingerapp.SecondActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                // A decommenter
               // this.f$0.m56lambda$onCreate$1$comexampletestfingerappSecondActivity(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-example-testfingerapp-SecondActivity, reason: not valid java name */
    /* synthetic */ void m55lambda$onCreate$0$comexampletestfingerappSecondActivity(View v) {
        doEnroll();
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-example-testfingerapp-SecondActivity, reason: not valid java name */
    /* synthetic */ void m56lambda$onCreate$1$comexampletestfingerappSecondActivity(View v) {
        doVerify();
    }

    private void initMorpho() {
        log("Initialisation du capteur…");
        try {
            USBManager usbManager = USBManager.getInstance();
            int ret = usbManager.initialize(this, getPackageName(), true);
            if (ret != 0) {
                log("Erreur USBManager.init : " + ret);
                return;
            }
            log("USBManager initialisé avec succès.");
            CustomInteger nbDevices = new CustomInteger();
            if (this.morphoDevice.initUsbDevicesNameEnum(nbDevices) == 0 && nbDevices.getValueOf() != 0) {
                String deviceName = this.morphoDevice.getUsbDeviceName(0);
                log("Périphérique détecté : " + deviceName);
                int ret2 = this.morphoDevice.openUsbDevice(deviceName, 5000);
                if (ret2 == 0) {
                    log("Capteur connecté avec succès.");
                } else {
                    log("Erreur ouverture capteur : " + ret2);
                }
                return;
            }
            log("Aucun périphérique détecté.");
        } catch (Exception e) {
            e.printStackTrace();
            log("Erreur initMorpho: " + e.getMessage());
        }
    }

    private void doEnroll() {
        new Thread(new Runnable() { // from class: com.example.testfingerapp.SecondActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                // A decommenter

                //this.f$0.m52lambda$doEnroll$2$comexampletestfingerappSecondActivity();
            }
        }).start();
    }

    /* JADX INFO: renamed from: lambda$doEnroll$2$com-example-testfingerapp-SecondActivity, reason: not valid java name */
    /* synthetic */ void m52lambda$doEnroll$2$comexampletestfingerappSecondActivity() {
        try {
            this.enrolledTemplate = new TemplateList();
            int ret = this.morphoDevice.capture(30, 0, 255, 1, TemplateType.MORPHO_PK_COMP, TemplateFVPType.MORPHO_NO_PK_FVP, 170, EnrollmentType.THREE_ACQUISITIONS, LatentDetection.LATENT_DETECT_DISABLE, Coder.MORPHO_MSO_V9_CODER, 0, CompressionAlgorithm.MORPHO_NO_COMPRESS, 0, this.enrolledTemplate, 0, null);
            if (ret == 0) {
                log("Enrôlement réussi.");
            } else {
                log("Échec enrôlement: " + ret);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log("Erreur enrôlement: " + e.getMessage());
        }
    }

    private void doVerify() {
        if (this.enrolledTemplate == null) {
            log("Aucun template enrôlé pour vérification.");
        } else {
            new Thread(new Runnable() { // from class: com.example.testfingerapp.SecondActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    // A decommenter
                    //this.f$0.m53lambda$doVerify$3$comexampletestfingerappSecondActivity();
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: lambda$doVerify$3$com-example-testfingerapp-SecondActivity, reason: not valid java name */
    /* synthetic */ void m53lambda$doVerify$3$comexampletestfingerappSecondActivity() {
        try {
            ResultMatching resultMatching = new ResultMatching();
            int ret = this.morphoDevice.verify(30, 5, Coder.MORPHO_MSO_V9_CODER, 1, MatchingStrategy.MORPHO_STANDARD_MATCHING_STRATEGY.getValue(), this.enrolledTemplate, 0, null, resultMatching);
            if (ret == 0) {
                log("Vérification réussie. Score: " + resultMatching.getMatchingScore());
            } else {
                log("Échec vérification: " + ret);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log("Erreur vérification: " + e.getMessage());
        }
    }

    private void log(final String message) {
        Log.d(TAG, message);
        runOnUiThread(new Runnable() { // from class: com.example.testfingerapp.SecondActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                // A decommenter

                //this.f$0.m54lambda$log$4$comexampletestfingerappSecondActivity(message);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$log$4$com-example-testfingerapp-SecondActivity, reason: not valid java name */
    /* synthetic */ void m54lambda$log$4$comexampletestfingerappSecondActivity(String message) {
        this.statusText.setText(message);
    }
}
