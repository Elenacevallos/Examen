package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextnom, editTextbas, editTextalt;
    private Button buttonsig, buttonsal, buttonlim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextnom = findViewById(R.id.editTextnom);
        editTextbas = findViewById(R.id.editTextbas);
        editTextalt = findViewById(R.id.editTextalt);
        buttonsig = findViewById(R.id.buttonsig);
        buttonsal = findViewById(R.id.buttonsal);
        buttonlim = findViewById(R.id.buttonlim);

        buttonlim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextnom.setText("");
                editTextbas.setText("");
                editTextalt.setText("");
            }
        });

        buttonsig.setOnClickListener(v -> {
            String nom = editTextnom.getText().toString();
            String basStr = editTextbas.getText().toString();
            String altStr = editTextalt.getText().toString();

            if (nom.isEmpty() || basStr.isEmpty() || altStr.isEmpty()) {
                Toast.makeText(this, "escriba todas las casillas", Toast.LENGTH_SHORT).show();
                return;
            }

            float bas = Float.parseFloat(basStr);
            float alt = Float.parseFloat(altStr);

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("nom", nom);
            intent.putExtra("bas", bas);
            intent.putExtra("alt", alt);
            startActivity(intent);
        });

        buttonsal.setOnClickListener(v -> finish());
    }
}