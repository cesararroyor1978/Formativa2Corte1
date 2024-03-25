package com.example.formativa2corte1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] options = new String[]{"Potenciación", "Fraccionario", "Ecuación cuadrática"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, PotenciacionActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, FraccionarioActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, EcuacionCuadraticaActivity.class));
                        break;
                }
            }
        });
    }
}
