package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WorldClicked extends AppCompatActivity {

    private int img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_clicked);

        Intent worldintent = getIntent();

        ImageView worldpro = (ImageView)findViewById(R.id.img_pro2);
        TextView worldname = (TextView)findViewById(R.id.tv_name2);
        TextView worldinfo = (TextView)findViewById(R.id.tv_info2);

        img2 = Integer.parseInt(worldintent.getStringExtra("worldpro"));
        worldpro.setImageResource(img2);
        worldname.setText(worldintent.getStringExtra("worldname"));
        worldinfo.setText(worldintent.getStringExtra("worldinfo"));

    }
}

