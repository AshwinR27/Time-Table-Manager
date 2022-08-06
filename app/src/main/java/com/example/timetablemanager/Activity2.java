package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    Button KKM,ANS,MDS,PRT,RKS,ASM,SGP,AJB,MRJ,KRK,JSK,SDR,CJK,PJM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        KKM = (Button) findViewById(R.id.KKM);
        KKM.setOnClickListener(this);

        ANS= (Button) findViewById(R.id.ANS);
        ANS.setOnClickListener(this);

        MDS = (Button) findViewById(R.id.MDS);
        MDS.setOnClickListener(this);

        PRT = (Button) findViewById(R.id.PRT);
        PRT.setOnClickListener(this);

        RKS = (Button) findViewById(R.id.RKS);
        RKS.setOnClickListener(this);

        ASM = (Button) findViewById(R.id.ASM);
        ASM.setOnClickListener(this);

        SGP = (Button) findViewById(R.id.SGP);
        SGP.setOnClickListener(this);

        AJB = (Button) findViewById(R.id.AJB);
        AJB.setOnClickListener(this);

        MRJ = (Button) findViewById(R.id.MRJ);
        MRJ.setOnClickListener(this);

        KRK = (Button) findViewById(R.id.KRK);
        KRK.setOnClickListener(this);

        JSK = (Button) findViewById(R.id.JSK);
        JSK.setOnClickListener(this);

        SDR = (Button) findViewById(R.id.SDR);
        SDR.setOnClickListener(this);

        CJK = (Button) findViewById(R.id.CJK);
        CJK.setOnClickListener(this);

        PJM = (Button) findViewById(R.id.PJM);
        PJM.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.equals(KKM))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","KKM");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(ANS))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","ANS");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(MDS))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","MDS");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(PRT))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","PRT");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(RKS))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","RKS");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(ASM))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","ASM");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(SGP))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","SGP");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(AJB))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","AJB");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(MRJ))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","MRJ");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(KRK))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","KRK");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(JSK))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","JSK");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(SDR))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","SDR");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(CJK))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","CJK");
            it.putExtra("data",bundle);
            startActivity(it);
        }

        if (v.equals(PJM))
        {
            Intent it = new Intent(this, Activity7.class);
            Bundle bundle = new Bundle();
            bundle.putString("teacher","PJM");
            it.putExtra("data",bundle);
            startActivity(it);
        }


    }




}