package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button studentBtn,teacherBtn,adminBtn;
    TextView x;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentBtn = (Button) findViewById(R.id.btn1);
        studentBtn.setOnClickListener(this);

        teacherBtn = (Button) findViewById(R.id.btn2);
        teacherBtn.setOnClickListener(this);

        adminBtn = (Button) findViewById(R.id.btn3);
        adminBtn.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        Intent it;
        if (v.equals(studentBtn))
        {
            it = new Intent(this, Activity1.class);
            startActivity(it);

        }
        if (v.equals(teacherBtn))
        {
           it = new Intent(this, Activity2.class);
            startActivity(it);
        }
        if (v.equals(adminBtn))
        {
            it = new Intent(this, Activity3.class);
            startActivity(it);
        }
    }




}