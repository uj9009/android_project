package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ChoiceActivity extends AppCompatActivity {

    Button bStart, bStop;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        bStart = findViewById(R.id.bStart);
        bStop = findViewById(R.id.bStop);
        vf = findViewById(R.id.viewFlipper);
        vf.setFlipInterval(100);
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.startFlipping();

            }
        });
        bStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.stopFlipping();

            }
        });
    }
}

