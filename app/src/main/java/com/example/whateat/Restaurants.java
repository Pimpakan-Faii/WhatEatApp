package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Restaurants extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    ImageButton backstep;

    /*int IMAGES = R.drawable.bt1;
    String[] NAMES = {"ร้านแอนบะหมี่หน้ามอ", "ร้านป๊า ม๊าอาหารตามสั่ง", "ร้านอาหารบ้านคุณลุง", "ร้านอาหารแม่ดอล่า", "ร้านครัวต้นดอกอ้อ", "วีทีแหนมเนือง"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
       /* ListView listView = (ListView) findViewById(R.id.list1);
        RestAdapter foodAdapter = new RestAdapter();
        listView.setAdapter(foodAdapter);*/
        b1 = (Button) findViewById(R.id.button20);
        b2 = (Button) findViewById(R.id.button);
        b3 = (Button) findViewById(R.id.button2);
        b4 = (Button) findViewById(R.id.button3);
        b5 = (Button) findViewById(R.id.button11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b12 = new Intent(Restaurants.this,Details.class);
                startActivity(b12);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b13 = new Intent(Restaurants.this,Details.class);
                startActivity(b13);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b14 = new Intent(Restaurants.this,Details.class);
                startActivity(b14);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b15 = new Intent(Restaurants.this,Details.class);
                startActivity(b15);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b16 = new Intent(Restaurants.this,Details.class);
                startActivity(b16);
            }
        });

        backstep = (ImageButton) findViewById(R.id.backbtn);

        backstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backst = new Intent(Restaurants.this,fried.class);
                startActivity(backst);
            }
        });
    }

   /* class RestAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.activity_listview, null);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.bg3);
            TextView textView = (TextView) convertView.findViewById(R.id.resturaant);

            imageView.setImageResource(IMAGES);
            textView.setText(NAMES[i]);
            return convertView;

        }
    }*/
}

