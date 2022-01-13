package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Menufood extends AppCompatActivity {


    int IMAGES = R.drawable.bt1;
    String[] NAMES = {"เมนูประเภททอด", "เมนูประเภทต้ม", "เมนูข้าวผัด", "เมนูข้าวกะเพรา", "เมนูก๋วยเตี๋ยว", "หมมูย่าง", "ชาบู"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufood);
        ListView listView = (ListView) findViewById(R.id.list);

        FoodAdapter foodAdapter = new FoodAdapter();
        listView.setAdapter(foodAdapter);

    }

    class FoodAdapter extends BaseAdapter {
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

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView3);
            TextView textView = (TextView) convertView.findViewById(R.id.typefood);

            imageView.setImageResource(IMAGES);
            textView.setText(NAMES[i]);
            return convertView;

        }
    }
}

