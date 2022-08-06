package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity implements View.OnClickListener{

    Button ABtn,BBtn,CBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);



        ABtn = (Button) findViewById(R.id.btn1);
        ABtn.setOnClickListener(this);

        BBtn = (Button) findViewById(R.id.btn2);
        BBtn.setOnClickListener(this);

        CBtn = (Button) findViewById(R.id.btn3);
        CBtn.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if (v.equals(ABtn))
        {
            Intent it = new Intent(this, Activity6.class);
            Bundle bundle = new Bundle();
            bundle.putString("section","CSEA");
            it.putExtra("data",bundle);
            startActivity(it);
        }
        if (v.equals(BBtn))
        {
            Intent it = new Intent(this, Activity6.class);
            Bundle bundle = new Bundle();
            bundle.putString("section","CSEB");
            it.putExtra("data",bundle);
            startActivity(it);
        }
        if (v.equals(CBtn))
        {
            Intent it = new Intent(this, Activity6.class);
            Bundle bundle = new Bundle();
            bundle.putString("section","CSEC");
            it.putExtra("data",bundle);
            startActivity(it);
        }
    }


}