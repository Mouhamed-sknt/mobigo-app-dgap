package com.example.testfingerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnalyseActivity extends AppCompatActivity {

    private TextView txtStatusMessage;
    private TextView txtScanStatus;
    private TextView txtScanDetail;
    private TextView txtQualite;
    private TextView txtType;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);

        // Initialisation des vues
        txtStatusMessage = findViewById(R.id.txt_status_message);
        txtScanStatus = findViewById(R.id.txt_scan_status);
        txtScanDetail = findViewById(R.id.txt_scan_detail);
        txtQualite = findViewById(R.id.txt_qualite);
        txtType = findViewById(R.id.txt_type);
        btnRetour = findViewById(R.id.btn_retour);

        // Récupérer le doigt sélectionné depuis MainActivity
        String doigt = getIntent().getStringExtra("DOIGT_SELECTIONNE");

        if (doigt != null && txtStatusMessage != null) {
            txtStatusMessage.setText("Veuillez poser votre " + doigt.toLowerCase() + " sur le capteur");
        }

        // Bouton Retour
        if (btnRetour != null) {
            btnRetour.setOnClickListener(v -> finish());
        }

        // SIMULATION : On teste le cas "Non trouvé" après 3 secondes
        new Handler().postDelayed(() -> {
            updateUI(false); // On appelle avec 'false' pour tester le rouge
        }, 3000);
        // Simulation de scan réussi après 3 secondes (pour tester)
        // ←←← Tu pourras remplacer cette partie plus tard par le vrai code Morpho
       // new Handler().postDelayed(this::simulateSuccessfulVerification, 3000);
    }
    // Simulation de vérification réussie (à remplacer par le vrai scan Morpho)
    private void simulateSuccessfulVerification() {
        // Mise à jour de l'UI pendant le scan
        if (txtScanStatus != null) txtScanStatus.setText("Vérification terminée");
        if (txtScanDetail != null) txtScanDetail.setText("Correspondance trouvée");

        if (txtQualite != null) txtQualite.setText("96%");
        if (txtType != null) txtType.setText("Pouce D");

        // Passer à l'écran de succès après 1 seconde
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(AnalyseActivity.this, IdentityConfirmeeActivity.class);
            startActivity(intent);
            finish(); // Ferme l'écran de scan pour ne pas pouvoir revenir en arrière
        }, 1000);
    }

    public void updateUI(boolean isMatch){
        TextView txtStatus = findViewById(R.id.txt_status_message);
        TextView txtScanStatus = findViewById(R.id.txt_scan_status);
        TextView txtScanDetail = findViewById(R.id.txt_scan_detail);

        ImageView imgIcon = findViewById(R.id.img_status);
        ImageView fingerprintIcon = findViewById(R.id.img_fingerprint);

        View dotStatus = findViewById(R.id.dot_status);
        View scanLine = findViewById(R.id.scan_line);
        View circleOuter1 = findViewById(R.id.circle_outer_id_1);
        View circleOuter2 = findViewById(R.id.circle_outer_id_2);

        LinearLayout banner = findViewById(R.id.banner_status);

        if(isMatch){
            txtStatus.setText("Correspondance trouvée");
            txtStatus.setTextColor(getResources().getColor(R.color.success_green));
            dotStatus.setBackgroundResource(R.drawable.dot_green);

            banner.setBackgroundResource(R.drawable.banner_green_bg);
            fingerprintIcon.setColorFilter(getResources().getColor(R.color.success_green));
        }else{
            txtStatus.setText("Veuillez réessayer svp!");
            txtScanStatus.setText("Pas trouvé");
            txtScanDetail.setText("Veuillez poser à nouveau votre doigt....");

            txtStatus.setTextColor(getResources().getColor(R.color.error_red));
            dotStatus.setBackgroundResource(R.drawable.dot_red);
            banner.setBackgroundResource(R.drawable.banner_red_bg);
            imgIcon.setColorFilter(getResources().getColor(R.color.error_red));

            scanLine.setBackgroundResource(R.color.error_red);
            circleOuter1.setBackgroundResource(R.drawable.circle_outer_red);
            circleOuter2.setBackgroundResource(R.drawable.circle_outer_red);

            fingerprintIcon.setColorFilter(getResources().getColor(R.color.error_red));
           // findViewById(R.id.scan_line).setVisibility(View.GONE);
        }
    }
}