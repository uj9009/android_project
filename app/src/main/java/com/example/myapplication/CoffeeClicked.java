package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffeeClicked extends AppCompatActivity {

    private int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_clicked);

        Intent coffeeintent = getIntent();

        ImageView profile = (ImageView)findViewById(R.id.img_pro1);
        TextView name = (TextView)findViewById(R.id.tv_name);
        TextView info = (TextView)findViewById(R.id.tv_info);

        img = Integer.parseInt(coffeeintent.getStringExtra("profile"));
        profile.setImageResource(img);
        name.setText(coffeeintent.getStringExtra("name"));
        info.setText(coffeeintent.getStringExtra("info"));

    }
}
