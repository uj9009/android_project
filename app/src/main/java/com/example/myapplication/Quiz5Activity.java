package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz5Activity extends AppCompatActivity {

    TextView textView2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra("result",0);
        textView2.setText("참 잘했어요! "+num1+"개 맞았습니다!");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });



    }
}
