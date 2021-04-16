package com.joao.projetofinal3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMapa, btnGif, btnComprar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMapa = findViewById(R.id.btnmapa);
        btnComprar = findViewById(R.id.btncomprar);
        btnGif = findViewById(R.id.btngif);


        btnGif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirGif();
            }
        });
        }

        public void abrirGif(){
        Intent janelaGif = new Intent(this, Gif.class);
        startActivity(janelaGif);


    }
}