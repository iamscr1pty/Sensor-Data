package com.example.magneto.sensor_data;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    public Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.acc);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1=new Intent(MainActivity.this,accActivity.class);
                startActivity(toy1);
            }
        });
        btn2=(Button)findViewById(R.id.mag);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy2=new Intent(MainActivity.this,magActivity.class);
                startActivity(toy2);
            }
        });
        btn3=(Button)findViewById(R.id.prox);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy3=new Intent(MainActivity.this,proxActivity.class);
                startActivity(toy3);
            }
        });
        btn4=(Button)findViewById(R.id.list);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4=new Intent(MainActivity.this,listActivity.class);
                startActivity(toy4);
            }
        });
    }
    }
