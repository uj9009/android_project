package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_fillipper;
    Button  mplaybtn, btn_google;
    Button mstopbtn;
    Button btn_stop;
    Button btn_play;
    Button btn_coffee;
    Button btn_world;
    Button btn_refill;
    Button btn_choice;
    SeekBar seekBar1;
    ImageView coffee1_img, coffee2_img, coffee3_img, coffee4_img;
    MediaPlayer mMediaPlayer;



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

     // 각 메뉴 버튼 클릭
    View.OnClickListener btn_coffee_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, CoffeeList.class);
            startActivity(intent);

        }
    };

    View.OnClickListener btn_world_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WorldList.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btn_google_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btn_refill_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, RefillList.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btn_choice_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ChoiceActivity.class);
            startActivity(intent);
        }
    };


     // 음악 재생 - seekbar 없음

    /* View.OnClickListener btn_play_click = new View.OnClickListener() {
         @Override
         public void onClick(View v) {
          //  mMediaPlayer.start();
             if (mMediaPlayer != null){
                 IsPlaying();
             } else {
                 mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.americano);
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
    } */


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





     //  main_coffee = (TextView)findViewById(R.id.main_coffee);
     //  main_world = (TextView)findViewById(R.id.main_world);
        // btn_music = (Button)findViewById(R.id.btn_music);

      //  btn_more1.setOnClickListener(btn_more1_click);
      //  btn_more2.setOnClickListener(btn_more2_click);
      //  main_coffee.setOnClickListener(main_coffee_click);
     //   main_world.setOnClickListener(main_world_click);

        btn_coffee = (Button)findViewById(R.id.btn_coffee);
        btn_coffee.setOnClickListener(btn_coffee_click);
        btn_world = (Button)findViewById(R.id.btn_world);
        btn_world.setOnClickListener(btn_world_click);
        btn_choice = (Button)findViewById(R.id.btn_choice);
        btn_choice.setOnClickListener(btn_choice_click);

        btn_refill = (Button)findViewById(R.id.btn_refill);
        btn_refill.setOnClickListener(btn_refill_click);

        btn_google = (Button)findViewById(R.id.btn_google);
        btn_google.setOnClickListener(btn_google_click);

        // 음악재생 - seekbar 있음
        btn_play = (Button)findViewById(R.id.btn_play);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);

       mMediaPlayer = MediaPlayer.create(this, R.raw.americano);
       mMediaPlayer.setLooping(true); //무한반복

        ((SeekBar) seekBar1).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                if (fromUser)
                    mMediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });


    }

    // 음악 재생 - seekbar 있음

    public void btn_play_click(View view) {

        ((SeekBar) seekBar1).setMax(mMediaPlayer.getDuration());


         if (mMediaPlayer.isPlaying()) {
             mMediaPlayer.pause();
             btn_play.setText("start");
              //재생중이면 실행될 작업 (정지)
             try {
                 mMediaPlayer.prepare();
             } catch (IllegalStateException e) {
                 e.printStackTrace();
             } catch (IOException e){
                 e.printStackTrace();
             }
             mMediaPlayer.seekTo(0);

             seekBar1.setProgress(0);
         }else {
             mMediaPlayer.start(); //재생
             btn_play.setText("stop");


              Thread();
         }
    }

    public void Thread() {
         Runnable task = new Runnable() {
             @Override
             public void run() {
                 while (mMediaPlayer.isPlaying()){
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e){
                         e.printStackTrace();
                     }
                     seekBar1.setProgress(mMediaPlayer.getCurrentPosition());
                 }
             }
         };
         Thread thread = new Thread(task);
         thread.start();
    }
}




































