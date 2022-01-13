package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class fried extends AppCompatActivity {

    ImageButton backstep;

    Button m1, m2, m3, m4, m5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fried);

        Intent nextst = new Intent(fried.this,Restaurants.class);

        m1 = (Button) findViewById(R.id.b1);
        m2 = (Button) findViewById(R.id.b2);
        m3 = (Button) findViewById(R.id.b3);
        m4 = (Button) findViewById(R.id.b4);
        m5 = (Button) findViewById(R.id.b5);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextst);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextst);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextst);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextst);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextst);
            }
        });

        backstep = (ImageButton) findViewById(R.id.backbtn);

        backstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backst = new Intent(fried.this,Menufood.class);
                startActivity(backst);
            }
        });
    }
}