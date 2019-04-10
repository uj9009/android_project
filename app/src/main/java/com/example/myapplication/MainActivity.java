package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
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
    Button btn_more1, btn_more2, mplaybtn, mstopbtn, btn_stop, btn_play;
    ImageView coffee1_img, coffee2_img, coffee3_img, coffee4_img;
    MediaPlayer mMediaPlayer;

    Button nn;

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

     // 음악 재생

     View.OnClickListener btn_play_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {
          //  mMediaPlayer.start();
             if (mMediaPlayer != null){
                 IsPlaying();
             } else {
                 mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.konan);
                 IsPlaying();
             }

         }
     };

    private void IsPlaying() {
        if (!mMediaPlayer.isPlaying()) {
            mMediaPlayer.start();
            mplaybtn.setText("stop");
        } else {
            mplaybtn.setText("play");
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }


     // 슬라이드

     public void fllipperImages(int image){
         ImageView imageView = new ImageView(this);
         imageView.setBackgroundResource(image);

         v_fillipper.addView(imageView);
         v_fillipper.setFlipInterval(3000);
         v_fillipper.setAutoStart(true);

         v_fillipper.setInAnimation(this, android.R.anim.slide_in_left);
         v_fillipper.setOutAnimation(this, android.R.anim.slide_out_right);

     }

    View.OnClickListener nnn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 슬라이드

        int images[] = {
                R.drawable.slide1,
                R.drawable.slide2,
                R.drawable.slide3

        };

        v_fillipper = (ViewFlipper) findViewById(R.id.img_slide);

        for(int image : images){
            fllipperImages(image);
        }




        btn_more1 = (Button)findViewById(R.id.btn_more1);
        btn_more2 = (Button)findViewById(R.id.btn_more2);
        main_coffee = (TextView)findViewById(R.id.main_coffee);
        main_world = (TextView)findViewById(R.id.main_world);
        // btn_music = (Button)findViewById(R.id.btn_music);

        btn_more1.setOnClickListener(btn_more1_click);
        btn_more2.setOnClickListener(btn_more2_click);
        main_coffee.setOnClickListener(main_coffee_click);
        main_world.setOnClickListener(main_world_click);

        // 음악

        mplaybtn = (Button)findViewById(R.id.btn_play);
        mplaybtn.setOnClickListener(btn_play_click);

        mMediaPlayer = MediaPlayer.create(this, R.raw.Americano);
   //     mMediaPlayer.setLooping(true); //무한반복
        nn = (Button)findViewById(R.id.nn);
        nn.setOnClickListener(nnn);

    }
}


































