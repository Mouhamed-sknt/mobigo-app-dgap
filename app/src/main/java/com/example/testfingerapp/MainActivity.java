package com.example.testfingerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerDoigt;
    private Button btnLaunchScan;
    private TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des vues
        spinnerDoigt = findViewById(R.id.spinner_doigt);
        btnLaunchScan = findViewById(R.id.btnLaunchScan);
        //statusText = findViewById(R.id.statusText);

        // Configuration du Spinner (choix du doigt)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"Pouce Droit", "Pouce Gauche", "Index Droit", "Index Gauche"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDoigt.setAdapter(adapter);

        // Action du bouton "LANCER LE SCAN"
        btnLaunchScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doigtSelectionne = spinnerDoigt.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, AnalyseActivity.class);
                intent.putExtra("DOIGT_SELECTIONNE", doigtSelectionne);
                startActivity(intent);
            }
        });

        // Message de statut initial
        if (statusText != null) {
            statusText.setText("Sélectionnez le doigt du membre de référence");
        }
    }
}