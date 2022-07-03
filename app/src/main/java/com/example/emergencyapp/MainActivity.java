package com.example.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3;

    public void onClick(View view){

        switch (view.getId()) {

            case R.id.button:
                Intent intent = new Intent(this,HospitalH.class);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1 = new Intent(this,PoliceH.class);
                startActivity(intent1);
                break;

            case R.id.button3:
                Intent intent2 = new Intent(this,FireB.class);
                startActivity(intent2);
                break;

            default:
                break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.mainText);
        textView.setTextColor(Color.MAGENTA);
        textView.setShadowLayer(16,8,8,Color.WHITE);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }



}