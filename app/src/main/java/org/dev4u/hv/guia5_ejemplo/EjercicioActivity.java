package org.dev4u.hv.guia5_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {

    private Button btnIzq, btnCenter, btnDer;
    private ImageView imgIzq, imgCenter, imgDer;
    Animation animacionizq,animacioncenter, animacionder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        btnIzq = findViewById(R.id.btnIzq);
        btnCenter = findViewById(R.id.btncenter);
        btnDer = findViewById(R.id.btnder);
        imgIzq = findViewById(R.id.imgView1);
        imgCenter = findViewById(R.id.imgView2);
        imgDer = findViewById(R.id.imgView3);


        animacionizq = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacionizq.setDuration(1000);
        animacionizq.setFillAfter(true);

        animacioncenter = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacioncenter.setDuration(1000);
        animacioncenter.setFillAfter(true);

        animacionder = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        animacionder.setDuration(1000);
        animacionder.setFillAfter(true);

        btnIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation(animacion);
                imgIzq.startAnimation(animacionizq);
            }
        });

        btnCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation(animacion);
                imgCenter.startAnimation(animacioncenter);
            }
        });

        btnDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.startAnimation(animacion);
                imgDer.startAnimation(animacionder);
            }
        });

    }
}
