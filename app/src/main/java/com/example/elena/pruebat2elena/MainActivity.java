package com.example.elena.pruebat2elena;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    TextView nombre;
    CircleImageView logo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        logo2 =(CircleImageView)findViewById(R.id.logo2) ;
        nombre=(TextView)findViewById(R.id.nombre);
        String fuentes = "fonts/AmaticSC-Regular.ttf";
        Typeface textoFuent = Typeface.createFromAsset(getAssets(), fuentes);
        nombre.setTypeface(textoFuent);
        Thread timerTread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, MyLogin.class);
                    startActivity(intent);
                }
            }
        };
        timerTread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}

