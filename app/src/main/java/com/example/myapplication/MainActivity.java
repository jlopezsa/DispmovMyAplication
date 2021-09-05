package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-- Creando una vista de tipo TextView directamente desde el código
        //TextView titulo = new TextView(this);
        //titulo.setText("Mensaje desde codigo fuente");
        //setContentView(titulo);

    }
}