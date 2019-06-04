package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    Button button;
    Integer num1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        button = findViewById(R.id.button);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if ((radioButton2.isChecked()==true)){
                    num1=1;
                    intent = new Intent(getApplicationContext(), Quiz2Activity.class);
                    intent.putExtra("result", num1.intValue());
                }
                else {
                    num1=0;
                    intent = new Intent(getApplicationContext(), Quiz2Activity.class);
                    intent.putExtra("result", num1.intValue());
                }
                startActivity(intent);
            }
        });



    }
}
