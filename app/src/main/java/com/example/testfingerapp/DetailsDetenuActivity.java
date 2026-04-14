package com.example.testfingerapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsDetenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_detenu);

        Button btnRetour = findViewById(R.id.btn_retour);
        Button btnEnrolement = findViewById(R.id.btn_enrolement);
        Button btnFicheEcrou = findViewById(R.id.btn_fiche_ecrou);
        Button btnSignalerIncident = findViewById(R.id.btn_signaler_incident);

        if(btnRetour != null) {
            btnRetour.setOnClickListener(v -> finish());
        }

        if(btnEnrolement != null) {
         btnEnrolement.setOnClickListener(v->{
             Intent intent = new Intent(DetailsDetenuActivity.this, IdentityConfirmeeActivity.class);
             intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
             startActivity(intent);
         });
        }
        // Voir la fiche d'écrou (à implémenter plus tard)

        // Signaler un incident (à implémenter plus tard)
    }
}
