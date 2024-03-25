package com.example.formativa2corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PotenciacionActivity extends AppCompatActivity {
    private EditText baseEditText;
    private EditText exponenteEditText;
    private Button calcularButton;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potenciacion);

        baseEditText = findViewById(R.id.baseEditText);
        exponenteEditText = findViewById(R.id.exponenteEditText);
        calcularButton = findViewById(R.id.calcularButton);
        resultadoTextView = findViewById(R.id.resultadoTextView);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double base = Double.parseDouble(baseEditText.getText().toString());
                double exponente = Double.parseDouble(exponenteEditText.getText().toString());
                double resultado = Math.pow(base, exponente);
                resultadoTextView.setText(String.valueOf(resultado));
            }
        });
    }
}
