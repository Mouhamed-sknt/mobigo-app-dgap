package com.example.testfingerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IdentityConfirmeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identite_confirmee);

        Button btnRetour = findViewById(R.id.btn_retour);
        Button btnNouvelleVerif = findViewById(R.id.btn_nouvelle_verif);
        Button btnVoirFiche = findViewById(R.id.btn_voir_fiche);

        // Bouton Retour au Tableau de Bord
        if (btnRetour != null) {
            btnRetour.setOnClickListener(v -> finish());
        }

        // Nouvelle vérification → Retour à MainActivity
        if (btnNouvelleVerif != null) {
            btnNouvelleVerif.setOnClickListener(v -> {
                Intent intent = new Intent(IdentityConfirmeeActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            });
        }

        // Voir la fiche complète (à implémenter plus tard)
        if (btnVoirFiche != null) {
            btnVoirFiche.setOnClickListener(v -> {
                // Pour le moment on affiche juste un message
                // Tu pourras ouvrir une autre Activity plus tard
                Intent intent = new Intent(IdentityConfirmeeActivity.this, DetailsDetenuActivity.class);
                startActivity(intent);
            });
        }
    }
}