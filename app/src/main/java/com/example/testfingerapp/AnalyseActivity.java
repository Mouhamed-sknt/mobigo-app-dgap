package com.example.testfingerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
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

        // Simulation de scan réussi après 3 secondes (pour tester)
        // ←←← Tu pourras remplacer cette partie plus tard par le vrai code Morpho
        new Handler().postDelayed(this::simulateSuccessfulVerification, 3000);
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
}