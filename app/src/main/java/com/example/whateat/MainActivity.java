package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton menu,a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (ImageButton) findViewById(R.id.menufood);
        a1 = (ImageButton) findViewById(R.id.ran);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Menufood.class);
                startActivity(i);
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,Random.class);
                startActivity(b);
            }
        });
    }

}