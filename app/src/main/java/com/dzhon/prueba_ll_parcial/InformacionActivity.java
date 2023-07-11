package com.dzhon.prueba_ll_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformacionActivity extends AppCompatActivity {

    Button btn_return;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btn_return=(Button)findViewById(R.id.btn_regresar) ;

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(String.valueOf(MainActivity.class));
                startActivity(intent);
            }
        });
    }
}