package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewalt, textViewbas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewalt = findViewById(R.id.textViewalt);
        textViewbas = findViewById(R.id.textViewbas);

        float alt = getIntent().getFloatExtra("alt", 0);
        float bas = getIntent().getFloatExtra("bas", 0);

        textViewalt.setText("Alt: " + alt);
        textViewbas.setText("Bas: " + bas);
    }
}
