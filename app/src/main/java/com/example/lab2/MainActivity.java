package com.example.lab2;

import android.os.Bundle;
import android.widget.CheckBox;  // ← IMPORTANT : ajoutez cet import
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de l'interface
    private EditText nomInput, adresseInput, surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;  // ← CORRIGÉ : CheckBox au lieu de View
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison XML <-> Java
        nomInput = findViewById(R.id.input_nom);
        adresseInput = findViewById(R.id.inputAdresse);
        surfaceInput = findViewById(R.id.inputSurface);
        piecesInput = findViewById(R.id.inputdePieces);
        piscineCheckbox = findViewById(R.id.checkboxdePiscine);  // ← Maintenant c'est un CheckBox
        resultView = findViewById(R.id.result);

        // Écouteur du bouton "Calculer"
        findViewById(R.id.buttondeCalcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        // Lecture des valeurs saisies
        String nom = nomInput.getText().toString();
        String adresse = adresseInput.getText().toString();
        double surface = Double.parseDouble(surfaceInput.getText().toString());
        int pieces = Integer.parseInt(piecesInput.getText().toString());
        boolean piscine = piscineCheckbox.isChecked();  // ← CORRIGÉ : isChecked() au lieu de isPressed()

        // Calcul des impôts
        double impotBase = surface * 2;
        double supplement = pieces * 50 + (piscine ? 100 : 0);
        double total = impotBase + supplement;

        // Affichage du résultat
        if (!nom.isEmpty()) {
            resultView.setText("M. " + nom + ", impôt total : " + total + " DH");
        } else {
            resultView.setText("Impôt total : " + total + " DH");
        }
    }
}