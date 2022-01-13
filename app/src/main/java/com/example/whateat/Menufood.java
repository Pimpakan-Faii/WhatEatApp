package com.example.whateat;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Menufood extends AppCompatActivity {
    Button b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufood);
       // ListView listView = (ListView) findViewById(R.id.list);

        b6 = (Button) findViewById(R.id.button4);
        b7 = (Button) findViewById(R.id.button5);
        b8 = (Button) findViewById(R.id.button6);
        b9 = (Button) findViewById(R.id.button7);
        b10 = (Button) findViewById(R.id.button8);
        b11 = (Button) findViewById(R.id.button9);
        b12 = (Button) findViewById(R.id.button10);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b17 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b17);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b18 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b18);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b19 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b19);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b20 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b20);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b21 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b21);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b22 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b22);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b23 = new Intent(Menufood.this,Restaurants.class);
                startActivity(b23);
            }
        });
    }
    }


