package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_fillipper;
    TextView main_coffee, main_world;
    Button btn_more1, btn_more2;
    ImageView coffee1_img, coffee2_img, coffee3_img, coffee4_img;

     View.OnClickListener btn_more1_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     };

     View.OnClickListener btn_more2_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     };

     View.OnClickListener main_coffee_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     };

     View.OnClickListener main_world_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     };

     public void fllipperImages(int image){
         ImageView imageView = new ImageView(this);
         imageView.setBackgroundResource(image);

         v_fillipper.addView(imageView);
         v_fillipper.setFlipInterval(3000);
         v_fillipper.setAutoStart(true);

         v_fillipper.setInAnimation(this, android.R.anim.slide_in_left);
         v_fillipper.setOutAnimation(this, android.R.anim.slide_out_right);

     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {
                R.drawable.coffee1,
                R.drawable.coffee2,
                R.drawable.coffee3

        };

        v_fillipper = (ViewFlipper) findViewById(R.id.img_slide);

        for(int image : images){
            fllipperImages(image);
        }

        btn_more1 = (Button)findViewById(R.id.btn_more1);
        btn_more2 = (Button)findViewById(R.id.btn_more2);
        main_coffee = (TextView)findViewById(R.id.main_coffee);
        main_world = (TextView)findViewById(R.id.main_world);

        btn_more1.setOnClickListener(btn_more1_click);
        btn_more2.setOnClickListener(btn_more2_click);
        main_coffee.setOnClickListener(main_coffee_click);
        main_world.setOnClickListener(main_world_click);

    }
}
