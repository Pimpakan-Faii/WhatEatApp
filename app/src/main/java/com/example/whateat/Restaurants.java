package com.example.whateat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Restaurants extends AppCompatActivity {

    int IMAGES = R.drawable.bt1;
    String[] NAMES = {"ร้านแอนบะหมี่หน้ามอ", "ร้านป๊า ม๊าอาหารตามสั่ง", "ร้านอาหารบ้านคุณลุง", "ร้านอาหารแม่ดอล่า", "ร้านครัวต้นดอกอ้อ", "วีทีแหนมเนือง"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ListView listView = (ListView) findViewById(R.id.list1);

        RestAdapter foodAdapter = new RestAdapter();
        listView.setAdapter(foodAdapter);

    }

    class RestAdapter extends BaseAdapter {
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
    }
}

