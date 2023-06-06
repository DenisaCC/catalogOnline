package com.example.proiectsda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class PaginaDeStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pagina_de_start);

        Button button = findViewById(R.id.Orar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaDeStart.this,PdfActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.Teze);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaDeStart.this,Teze.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.Note);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaDeStart.this,Note.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.Noutati);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaDeStart.this,Noutati.class);
                startActivity(intent);
            }
        });
    }
}