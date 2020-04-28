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

public class QuestionActivity2 extends AppCompatActivity {

    TextView question2,scores;
    RadioGroup radioGroup;
    RadioButton op1,op2,op3;
    Button next;
    int score=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        question2=(TextView)findViewById(R.id.question2);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup2);
        op1=(RadioButton)findViewById(R.id.opt1);
        op2=(RadioButton)findViewById(R.id.opt2);
        op3=(RadioButton)findViewById(R.id.opt3);
        scores=(TextView)findViewById(R.id.scores);

        next=(Button)findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(op2.isChecked())
                {
                    score=score+1;
                    Intent intent=new Intent(getApplicationContext(),QuestionActivity3.class);
                    startActivity(intent);


                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
