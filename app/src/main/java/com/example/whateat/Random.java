package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Random extends AppCompatActivity {
    TextView text;
    ImageButton random, nextgoto, backstep;
    private String ran[] = {"ข้าวหมูทอดกระเทียม",
            "ข้าวหมูกรอบทอดกระเทียม",
            "ข้าวไก่ทอดกระเทียม",
            "ข้าวไข่เจียวหมูสับ",
            "ข้าวกุ้งทอดกระเทียม"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        text = (TextView) findViewById(R.id.randomized);
        random = (ImageButton) findViewById(R.id.randombtn);
        nextgoto = (ImageButton) findViewById(R.id.nextstep);
        backstep = (ImageButton) findViewById(R.id.backbtn);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Random random=new java.util.Random();
                int num = random.nextInt(ran.length);
                text.setText(ran[num]);
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