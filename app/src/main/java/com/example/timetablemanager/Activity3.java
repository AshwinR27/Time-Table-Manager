package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    Button signin;
    EditText username, password;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signin = (Button) findViewById(R.id.btn_signin);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String usernametxt = username.getText().toString();
        String passwordtxt = password.getText().toString();
        if(usernametxt.equals( "admin" ) && passwordtxt.equals( "admin" )){
            Toast.makeText(getBaseContext(),"Login successful",Toast.LENGTH_LONG).show();
            Intent it = new Intent(this, Activity4.class);
            startActivity(it);
        }
        else{
            Toast.makeText( getBaseContext(), "Invalid Username or Password", Toast.LENGTH_LONG ).show();
        }
    }
}



