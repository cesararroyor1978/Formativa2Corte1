package com.example.formativa2corte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EcuacionCuadraticaActivity extends AppCompatActivity {
    private EditText aEditText;
    private EditText bEditText;
    private EditText cEditText;
    private Button calcularButton3;
    private TextView resultado3TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion_cuadratica);

        aEditText = findViewById(R.id.aEditText);
        bEditText = findViewById(R.id.bEditText);
        cEditText = findViewById(R.id.cEditText);
        calcularButton3 = findViewById(R.id.calcularButton3);
        resultado3TextView = findViewById(R.id.resultado3TextView);

        calcularButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(aEditText.getText().toString());
                double b = Double.parseDouble(bEditText.getText().toString());
                double c = Double.parseDouble(cEditText.getText().toString());

                double discriminante = Math.pow(b, 2) - 4 * a * c;

                if (discriminante > 0) {
                    double root1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    resultado3TextView.setText("Las raíces son: " + root1 + " y " + root2);
                } else if (discriminante == 0) {
                    double root = -b / (2 * a);
                    resultado3TextView.setText("La raíz es: " + root);
                } else {
                    resultado3TextView.setText("Las raíces no son reales.");
                }
            }
        });
    }
}
