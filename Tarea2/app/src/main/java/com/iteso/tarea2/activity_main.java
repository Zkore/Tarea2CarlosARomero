package com.iteso.tarea2;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_main extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button cart;
    Button undo;
    boolean btnsel1 = false;
    boolean btnsel2 = false;
    boolean btnsel3 = false;
    boolean btnsel4 = false;
    boolean added = false;
    ImageButton like;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
        }
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_s);
        btn2 = findViewById(R.id.btn_m);
        btn3 = findViewById(R.id.btn_l);
        btn4 = findViewById(R.id.btn_xl);
        cart = findViewById(R.id.btn_agregar);
        undo = findViewById(R.id.btn_undo);
        like = findViewById(R.id.btn_like);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_main.this, R.string.toast_like, Toast.LENGTH_SHORT).show();
            }
        });


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart.setText(R.string.btn_agregado);
                undo.setVisibility(View.VISIBLE);
            }
        });

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart.setText(R.string.btn_agregar);
                undo.setVisibility(View.INVISIBLE);
            }
        });


    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        btnsel1 = savedInstanceState.getBoolean("btn1");
        btnsel2 = savedInstanceState.getBoolean("btn2");
        btnsel3 = savedInstanceState.getBoolean("btn3");
        btnsel4 = savedInstanceState.getBoolean("btn4");
        added = savedInstanceState.getBoolean("added");
        if (added){
            cart.setText(R.string.btn_agregado);
            undo.setVisibility(View.VISIBLE);
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("btn1",btnsel1);
        outState.putBoolean("btn2",btnsel2);
        outState.putBoolean("btn3",btnsel3);
        outState.putBoolean("btn4",btnsel4);
        outState.putBoolean("added",added);
    }
    public void onClick(View view){
         if (view == btn1 || btnsel1){
             btn1.setBackgroundResource(R.color.colorPrimary);
             btn1.setTextColor(getResources().getColor(R.color.colorWhite));
             btnsel1 = true;
             btn2.setBackgroundResource(R.drawable.forma_cuadrado);
             btn2.setTextColor(getResources().getColor(R.color.colorPrimary));
             btnsel2 = false;
             btn3.setBackgroundResource(R.drawable.forma_cuadrado);
             btn3.setTextColor(getResources().getColor(R.color.colorPrimary));
             btnsel3 = false;
             btn4.setBackgroundResource(R.drawable.forma_cuadrado);
             btn4.setTextColor(getResources().getColor(R.color.colorPrimary));
             btnsel4 = false;
         }
        if (view == btn2 || btnsel2){
            btn2.setBackgroundResource(R.color.colorPrimary);
            btn2.setTextColor(getResources().getColor(R.color.colorWhite));
            btnsel2 = true;
            btn1.setBackgroundResource(R.drawable.forma_cuadrado);
            btn1.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel1 = false;
            btn3.setBackgroundResource(R.drawable.forma_cuadrado);
            btn3.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel3 = false;
            btn4.setBackgroundResource(R.drawable.forma_cuadrado);
            btn4.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel4 = false;
        }
        if (view == btn3 || btnsel3){
            btn3.setBackgroundResource(R.color.colorPrimary);
            btn3.setTextColor(getResources().getColor(R.color.colorWhite));
            btnsel3 = true;
            btn2.setBackgroundResource(R.drawable.forma_cuadrado);
            btn2.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel2 = false;
            btn1.setBackgroundResource(R.drawable.forma_cuadrado);
            btn1.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel1 = false;
            btn4.setBackgroundResource(R.drawable.forma_cuadrado);
            btn4.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel4 = false;
        }
        if (view == btn4 || btnsel4){
            btn4.setBackgroundResource(R.color.colorPrimary);
            btn4.setTextColor(getResources().getColor(R.color.colorWhite));
            btnsel4 = true;
            btn2.setBackgroundResource(R.drawable.forma_cuadrado);
            btn2.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel2 = false;
            btn3.setBackgroundResource(R.drawable.forma_cuadrado);
            btn3.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel3 = false;
            btn1.setBackgroundResource(R.drawable.forma_cuadrado);
            btn1.setTextColor(getResources().getColor(R.color.colorPrimary));
            btnsel1 = false;
        }

    }

}
