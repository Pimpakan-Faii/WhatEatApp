package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Random extends AppCompatActivity {

    ImageButton random, nextgoto, backstep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        random = (ImageButton) findViewById(R.id.randombtn);
        nextgoto = (ImageButton) findViewById(R.id.nextstep);
        backstep = (ImageButton) findViewById(R.id.backbtn);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nextgoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextst = new Intent(Random.this,Restaurants.class);
                startActivity(nextst);
            }
        });

        backstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backst = new Intent(Random.this,MainActivity.class);
                startActivity(backst);
            }
        });
    }
}