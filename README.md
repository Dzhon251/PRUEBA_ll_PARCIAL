# PRUEBA_ll_PARCIAL

HOLA!

trabajo realizado por:
  -Miranda M. Jhonn C.
  -Catucuago V. Juan P.

Para ver mis repositorios puedes acceder a mi perfil y conocer más sobre mis proyectos

Perfil GitHub: Dzhon251 (github.com)

Construcción de un aplocativo en Android Studio en java 

![image](https://github.com/Dzhon251/PRUEBA_ll_PARCIAL/assets/133244354/d74d490f-0d0d-49d3-8f83-0bf6232b61ff)
![image](https://github.com/Dzhon251/PRUEBA_ll_PARCIAL/assets/133244354/1f93e998-0d58-4807-ba60-b1470bffbf13)

![image](https://github.com/Dzhon251/PRUEBA_ll_PARCIAL/assets/133244354/15727114-9a36-4c8f-83d0-162886a29b53)
![image](https://github.com/Dzhon251/PRUEBA_ll_PARCIAL/assets/133244354/a86c2a75-69ec-459e-ba35-6f47ba311d58)



CÓDIGO DEL PROYECTO

este código pertenece al MainActivity.java

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
