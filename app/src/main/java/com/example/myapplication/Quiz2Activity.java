package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz2Activity extends AppCompatActivity {

    Button button;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    TextView textView1;
    Integer num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        button = findViewById(R.id.button);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        textView1 = findViewById(R.id.textView1);
        final Intent intent = getIntent();
        num1 = intent.getIntExtra("result", 0); //메인액티에서 가져온 점수
        textView1.setText("현재까지 점수 : "+num1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1;
                if (radioButton3.isChecked() == true){
                    num1++;
                    intent1 = new Intent(getApplicationContext(), Quiz3Activity.class);
                    intent1.putExtra("result", num1.intValue());
                }else{
                    intent1 = new Intent(getApplicationContext(), Quiz3Activity.class);
                    intent1.putExtra("result", num1.intValue());
                }
                startActivity(intent1);
            }
        });


    }
}
