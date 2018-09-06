package com.example.opet.victor_exe03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private CheckBox res01;
    private CheckBox res02;
    private CheckBox res03;
    private CheckBox res04;
    private CheckBox res05;
    private int acerto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        res01 = findViewById(R.id.Per_A);
        res02 = findViewById(R.id.Per_B);
        res03 = findViewById(R.id.Per_C);
        res04 = findViewById(R.id.Per_D);
        res05 = findViewById(R.id.Per_E);
    }

    public void resultado(View v){

        if(res01.isChecked()){
            acerto = acerto + 1;
        }

        if(res02.isChecked()){
            acerto = acerto + 1;
        }

        if(res03.isChecked()){
            acerto = acerto + 1;
        }

        if(res04.isChecked()){
            acerto = acerto + 1;
        }

        if(res05.isChecked()){
            acerto = acerto + 1;
        }

        resultado.setText("Seu resultado é: " + acerto + "/5");

    }
}
