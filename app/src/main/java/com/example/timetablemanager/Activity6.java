package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    TextView mon1,mon2,mon3,mon4,mon5,mon6,mon7,tue1,tue2,tue3,tue4,tue5,tue6,tue7;
    TextView wed1,wed2,wed3,wed4,wed5,wed6,wed7,thu1,thu2,thu3,thu4,thu5,thu6,thu7;
    TextView fri1,fri2,fri3,fri4,fri5,fri6,fri7;

    TextView cT;

    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Bundle bundle = getIntent().getBundleExtra("data");
        String sec = bundle.getString("section");

        cT = (TextView)findViewById(R.id.classText) ;

        if(sec.equals("CSEA")) {
            cT.setText("TIME-TABLE\nCSE VI A");
        }
        else if(sec.equals("CSEB")){
            cT.setText("TIME-TABLE\nCSE VI B");
        }
        else if(sec.equals("CSEC")){
            cT.setText("TIME-TABLE\nCSE VI C");
        }

        mon1 = (TextView) findViewById(R.id.Mon1);
        mon2 = (TextView) findViewById(R.id.Mon2);
        mon3 = (TextView) findViewById(R.id.Mon3);
        mon4 = (TextView) findViewById(R.id.Mon4);
        mon5 = (TextView) findViewById(R.id.Mon5);
        mon6 = (TextView) findViewById(R.id.Mon6);
        mon7 = (TextView) findViewById(R.id.Mon7);

        tue1 = (TextView) findViewById(R.id.Tue1);
        tue2 = (TextView) findViewById(R.id.Tue2);
        tue3 = (TextView) findViewById(R.id.Tue3);
        tue4 = (TextView) findViewById(R.id.Tue4);
        tue5 = (TextView) findViewById(R.id.Tue5);
        tue6 = (TextView) findViewById(R.id.Tue6);
        tue7 = (TextView) findViewById(R.id.Tue7);

        wed1 = (TextView) findViewById(R.id.Wed1);
        wed2 = (TextView) findViewById(R.id.Wed2);
        wed3 = (TextView) findViewById(R.id.Wed3);
        wed4 = (TextView) findViewById(R.id.Wed4);
        wed5 = (TextView) findViewById(R.id.Wed5);
        wed6 = (TextView) findViewById(R.id.Wed6);
        wed7 = (TextView) findViewById(R.id.Wed7);

        thu1 = (TextView) findViewById(R.id.Thu1);
        thu2 = (TextView) findViewById(R.id.Thu2);
        thu3 = (TextView) findViewById(R.id.Thu3);
        thu4 = (TextView) findViewById(R.id.Thu4);
        thu5 = (TextView) findViewById(R.id.Thu5);
        thu6 = (TextView) findViewById(R.id.Thu6);
        thu7 = (TextView) findViewById(R.id.Thu7);

        fri1 = (TextView) findViewById(R.id.Fri1);
        fri2 = (TextView) findViewById(R.id.Fri2);
        fri3 = (TextView) findViewById(R.id.Fri3);
        fri4 = (TextView) findViewById(R.id.Fri4);
        fri5 = (TextView) findViewById(R.id.Fri5);
        fri6 = (TextView) findViewById(R.id.Fri6);
        fri7 = (TextView) findViewById(R.id.Fri7);

        db = openOrCreateDatabase("TimeT", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS TimeT(Section TEXT," +
                "Day TEXT," +
                "Teacher TEXT," +
                "Subject TEXT," +
                "primary key(Section,Day));");

        //viewing db values in tt
        Cursor c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON1';", null) ;
        if(c.moveToFirst())
        {
            mon1.setText(c.getString(3));

        }


        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON2';", null) ;
        if(c.moveToFirst())
        {
            mon2.setText(c.getString(3));

        }

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON3';", null) ;
        if(c.moveToFirst())
        {
            mon3.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON4';", null) ;
        if(c.moveToFirst())
        {
            mon4.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON5';", null) ;
        if(c.moveToFirst())
        {
            mon5.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON6';", null) ;
        if(c.moveToFirst())
        {
            mon6.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON7';", null) ;
        if(c.moveToFirst())
        {
            mon7.setText(c.getString(3));

        }

        //Tuesday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE1';", null) ;
        if(c.moveToFirst())
        {
            tue1.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE2';", null) ;
        if(c.moveToFirst())
        {
            tue2.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE3';", null) ;
        if(c.moveToFirst())
        {
            tue3.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE4';", null) ;
        if(c.moveToFirst())
        {
            tue4.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE5';", null) ;
        if(c.moveToFirst())
        {
            tue5.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE6';", null) ;
        if(c.moveToFirst())
        {
            tue6.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE7';", null) ;
        if(c.moveToFirst())
        {
            tue7.setText(c.getString(3));

        }

        //Wednesday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED1';", null) ;
        if(c.moveToFirst())
        {
            wed1.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED2';", null) ;
        if(c.moveToFirst())
        {
            wed2.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED3';", null) ;
        if(c.moveToFirst())
        {
            wed3.setText(c.getString(3));
        }c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED4';", null) ;
        if(c.moveToFirst())
        {
            wed4.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED5';", null) ;
        if(c.moveToFirst())
        {
            wed5.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED6';", null) ;
        if(c.moveToFirst())
        {
            wed6.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED7';", null) ;
        if(c.moveToFirst())
        {
            wed7.setText(c.getString(3));
        }

        //Thursday


        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU1';", null) ;
        if(c.moveToFirst())
        {
            thu1.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU2';", null) ;
        if(c.moveToFirst())
        {
            thu2.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU3';", null) ;
        if(c.moveToFirst())
        {
            thu3.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU4';", null) ;
        if(c.moveToFirst())
        {
            thu4.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU5';", null) ;
        if(c.moveToFirst())
        {
            thu5.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU6';", null) ;
        if(c.moveToFirst())
        {
            thu6.setText(c.getString(3));

        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU7';", null) ;
        if(c.moveToFirst())
        {
            thu7.setText(c.getString(3));
        }

        //Friday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI1';", null) ;
        if(c.moveToFirst())
        {
            fri1.setText(c.getString(3));
        }c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI2';", null) ;
        if(c.moveToFirst())
        {
            fri2.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI3';", null) ;
        if(c.moveToFirst())
        {
            fri3.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI4';", null) ;
        if(c.moveToFirst())
        {
            fri4.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI5';", null) ;
        if(c.moveToFirst())
        {
            fri5.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI6';", null) ;
        if(c.moveToFirst())
        {
            fri6.setText(c.getString(3));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI7';", null) ;
        if(c.moveToFirst())
        {
            fri7.setText(c.getString(3));
        }
    }
}