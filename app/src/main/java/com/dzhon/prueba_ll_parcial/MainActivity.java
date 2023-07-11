package com.dzhon.prueba_ll_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
Button btn_somos,btn_curso,btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_somos=(Button)findViewById(R.id.btn_somos) ;
        btn_curso=(Button)findViewById(R.id.btn_curso) ;
        btn_info=(Button)findViewById(R.id.btn_contacto) ;


        btn_somos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SomosActivity.class);
                startActivity(intent);
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InformacionActivity.class);
                startActivity(intent);
            }
        });


        btn_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CursoActivity.class);
                startActivity(intent);
            }
        });




        Button closeButton = findViewById(R.id.btn_salir);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }
}