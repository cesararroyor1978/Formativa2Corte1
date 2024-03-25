package com.example.formativa2corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FraccionarioActivity extends AppCompatActivity {
    private EditText num1EditText;
    private EditText den1EditText;
    private EditText num2EditText;
    private EditText den2EditText;
    private Button calcularButton2;
    private TextView resultado2TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraccionario);

        num1EditText = findViewById(R.id.num1EditText);
        den1EditText = findViewById(R.id.den1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        den2EditText = findViewById(R.id.den2EditText);
        calcularButton2 = findViewById(R.id.calcularButton2);
        resultado2TextView = findViewById(R.id.resultado2TextView);

        calcularButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int den1 = Integer.parseInt(den1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int den2 = Integer.parseInt(den2EditText.getText().toString());

                // Calcula el mínimo común múltiplo de los denominadores
                int denComun = den1 * den2 / gcd(den1, den2);

                // Calcula la suma de los fraccionarios
                int numSuma = num1 * (denComun / den1) + num2 * (denComun / den2);

                resultado2TextView.setText(numSuma + "/" + denComun);
            }
        });
    }

    // Método para calcular el máximo común divisor de dos números
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
