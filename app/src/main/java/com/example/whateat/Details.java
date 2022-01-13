package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Details extends AppCompatActivity {

    Button viewdo,viewran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        viewdo = (Button) findViewById(R.id.ran2);
        viewran = (Button) findViewById(R.id.ran3);

        viewdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v1 = new Intent(Details.this,Restaurants.class);
                startActivity(v1);
            }
        });
        viewran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v2 = new Intent(Details.this,Random.class);
                startActivity(v2);
            }
        });
    }
}