package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {

    TextView question;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3;
    Button button;
    String op1,op2,op3;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        question=(TextView)findViewById(R.id.question);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup2);
        opt1=(RadioButton)findViewById(R.id.opt1);
        opt2=(RadioButton)findViewById(R.id.opt2);
        opt3=(RadioButton)findViewById(R.id.opt3);

        button=(Button)findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             op1=opt1.getText().toString();
             op2=opt2.getText().toString();
             op3=opt3.getText().toString();

             if(opt1.isChecked())
             {
                 Bundle b = new Bundle();
                 Intent intent=new Intent(getApplicationContext(),QuestionActivity2.class);
                 startActivity(intent);
                 score=score+1;
                 b.putInt("score",score);
             }
             else {

                 Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
             }

            }
        });


    }
}
