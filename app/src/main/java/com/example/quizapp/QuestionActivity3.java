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

public class QuestionActivity3 extends AppCompatActivity {

    TextView ques3,result;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3;
    Button submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        ques3=(TextView)findViewById(R.id.question3);
        result=(TextView)findViewById(R.id.result);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup3);

        opt1=(RadioButton)findViewById(R.id.options1);
        opt2=(RadioButton)findViewById(R.id.options2);
        opt3=(RadioButton)findViewById(R.id.options3);

        submit=(Button)findViewById(R.id.finish);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(opt1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Right Answer.. QUIZ FINISHED",Toast.LENGTH_LONG).show();
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                }


            }

        });


    }
}
