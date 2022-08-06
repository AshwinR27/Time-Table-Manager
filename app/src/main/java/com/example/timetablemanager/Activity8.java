package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//gg
public class Activity8 extends AppCompatActivity {
    EditText mon1,mon2,mon3,mon4,mon5,mon6,mon7,tue1,tue2,tue3,tue4,tue5,tue6,tue7;
    EditText wed1,wed2,wed3,wed4,wed5,wed6,wed7,thu1,thu2,thu3,thu4,thu5,thu6,thu7;
    EditText fri1,fri2,fri3,fri4,fri5,fri6,fri7;

    EditText tmon1,tmon2,tmon3,tmon4,tmon5,tmon6,tmon7,ttue1,ttue2,ttue3,ttue4,ttue5,ttue6,ttue7;
    EditText twed1,twed2,twed3,twed4,twed5,twed6,twed7,tthu1,tthu2,tthu3,tthu4,tthu5,tthu6,tthu7;
    EditText tfri1,tfri2,tfri3,tfri4,tfri5,tfri6,tfri7;

    TextView cT;

    Button save;
    SQLiteDatabase db;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        Bundle bundle = getIntent().getBundleExtra("data");
        String sec = bundle.getString("section");

        cT = (TextView)findViewById(R.id.classText) ;

        if(sec.equals("CSEA")) {
            cT.setText("CSE VI A");
        }
        else if(sec.equals("CSEB")){
            cT.setText("CSE VI B");
        }
        else if(sec.equals("CSEC")){
            cT.setText("CSE VI C");
        }

        //Subjects
        mon1 = (EditText) findViewById(R.id.Mon1);
        mon2 = (EditText) findViewById(R.id.Mon2);
        mon3 = (EditText) findViewById(R.id.Mon3);
        mon4 = (EditText) findViewById(R.id.Mon4);
        mon5 = (EditText) findViewById(R.id.Mon5);
        mon6 = (EditText) findViewById(R.id.Mon6);
        mon7 = (EditText) findViewById(R.id.Mon7);

        tue1 = (EditText) findViewById(R.id.Tue1);
        tue2 = (EditText) findViewById(R.id.Tue2);
        tue3 = (EditText) findViewById(R.id.Tue3);
        tue4 = (EditText) findViewById(R.id.Tue4);
        tue5 = (EditText) findViewById(R.id.Tue5);
        tue6 = (EditText) findViewById(R.id.Tue6);
        tue7 = (EditText) findViewById(R.id.Tue7);

        wed1 = (EditText) findViewById(R.id.Wed1);
        wed2 = (EditText) findViewById(R.id.Wed2);
        wed3 = (EditText) findViewById(R.id.Wed3);
        wed4 = (EditText) findViewById(R.id.Wed4);
        wed5 = (EditText) findViewById(R.id.Wed5);
        wed6 = (EditText) findViewById(R.id.Wed6);
        wed7 = (EditText) findViewById(R.id.Wed7);

        thu1 = (EditText) findViewById(R.id.Thu1);
        thu2 = (EditText) findViewById(R.id.Thu2);
        thu3 = (EditText) findViewById(R.id.Thu3);
        thu4 = (EditText) findViewById(R.id.Thu4);
        thu5 = (EditText) findViewById(R.id.Thu5);
        thu6 = (EditText) findViewById(R.id.Thu6);
        thu7 = (EditText) findViewById(R.id.Thu7);

        fri1 = (EditText) findViewById(R.id.Fri1);
        fri2 = (EditText) findViewById(R.id.Fri2);
        fri3 = (EditText) findViewById(R.id.Fri3);
        fri4 = (EditText) findViewById(R.id.Fri4);
        fri5 = (EditText) findViewById(R.id.Fri5);
        fri6 = (EditText) findViewById(R.id.Fri6);
        fri7 = (EditText) findViewById(R.id.Fri7);

        //Teachers
        tmon1 = (EditText) findViewById(R.id.TMon1);
        tmon2 = (EditText) findViewById(R.id.TMon2);
        tmon3 = (EditText) findViewById(R.id.TMon3);
        tmon4 = (EditText) findViewById(R.id.TMon4);
        tmon5 = (EditText) findViewById(R.id.TMon5);
        tmon6 = (EditText) findViewById(R.id.TMon6);
        tmon7 = (EditText) findViewById(R.id.TMon7);

        ttue1 = (EditText) findViewById(R.id.TTue1);
        ttue2 = (EditText) findViewById(R.id.TTue2);
        ttue3 = (EditText) findViewById(R.id.TTue3);
        ttue4 = (EditText) findViewById(R.id.TTue4);
        ttue5 = (EditText) findViewById(R.id.TTue5);
        ttue6 = (EditText) findViewById(R.id.TTue6);
        ttue7 = (EditText) findViewById(R.id.TTue7);

        twed1 = (EditText) findViewById(R.id.TWed1);
        twed2 = (EditText) findViewById(R.id.TWed2);
        twed3 = (EditText) findViewById(R.id.TWed3);
        twed4 = (EditText) findViewById(R.id.TWed4);
        twed5 = (EditText) findViewById(R.id.TWed5);
        twed6 = (EditText) findViewById(R.id.TWed6);
        twed7 = (EditText) findViewById(R.id.TWed7);

        tthu1 = (EditText) findViewById(R.id.TThu1);
        tthu2 = (EditText) findViewById(R.id.TThu2);
        tthu3 = (EditText) findViewById(R.id.TThu3);
        tthu4 = (EditText) findViewById(R.id.TThu4);
        tthu5 = (EditText) findViewById(R.id.TThu5);
        tthu6 = (EditText) findViewById(R.id.TThu6);
        tthu7 = (EditText) findViewById(R.id.TThu7);

        tfri1 = (EditText) findViewById(R.id.TFri1);
        tfri2 = (EditText) findViewById(R.id.TFri2);
        tfri3 = (EditText) findViewById(R.id.TFri3);
        tfri4 = (EditText) findViewById(R.id.TFri4);
        tfri5 = (EditText) findViewById(R.id.TFri5);
        tfri6 = (EditText) findViewById(R.id.TFri6);
        tfri7 = (EditText) findViewById(R.id.TFri7);

        save = (Button) findViewById(R.id.savebtn);

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
            tmon1.setText(c.getString(2));
        }


        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON2';", null) ;
        if(c.moveToFirst())
        {
            mon2.setText(c.getString(3));
            tmon2.setText(c.getString(2));
        }

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON3';", null) ;
        if(c.moveToFirst())
        {
            mon3.setText(c.getString(3));
            tmon3.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON4';", null) ;
        if(c.moveToFirst())
        {
            mon4.setText(c.getString(3));
            tmon4.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON5';", null) ;
        if(c.moveToFirst())
        {
            mon5.setText(c.getString(3));
            tmon5.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON6';", null) ;
        if(c.moveToFirst())
        {
            mon6.setText(c.getString(3));
            tmon6.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='MON7';", null) ;
        if(c.moveToFirst())
        {
            mon7.setText(c.getString(3));
            tmon7.setText(c.getString(2));
        }

        //Tuesday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE1';", null) ;
        if(c.moveToFirst())
        {
            tue1.setText(c.getString(3));
            ttue1.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE2';", null) ;
        if(c.moveToFirst())
        {
            tue2.setText(c.getString(3));
            ttue2.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE3';", null) ;
        if(c.moveToFirst())
        {
            tue3.setText(c.getString(3));
            ttue3.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE4';", null) ;
        if(c.moveToFirst())
        {
            tue4.setText(c.getString(3));
            ttue4.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE5';", null) ;
        if(c.moveToFirst())
        {
            tue5.setText(c.getString(3));
            ttue5.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE6';", null) ;
        if(c.moveToFirst())
        {
            tue6.setText(c.getString(3));
            ttue6.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='TUE7';", null) ;
        if(c.moveToFirst())
        {
            tue7.setText(c.getString(3));
            ttue7.setText(c.getString(2));
        }

        //Wednesday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED1';", null) ;
        if(c.moveToFirst())
        {
            wed1.setText(c.getString(3));
                    twed1.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED2';", null) ;
        if(c.moveToFirst())
        {
            wed2.setText(c.getString(3));
                    twed2.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED3';", null) ;
        if(c.moveToFirst())
        {
            wed3.setText(c.getString(3));
                    twed3.setText(c.getString(2));
        }c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED4';", null) ;
        if(c.moveToFirst())
        {
            wed4.setText(c.getString(3));
                    twed4.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED5';", null) ;
        if(c.moveToFirst())
        {
            wed5.setText(c.getString(3));
                    twed5.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED6';", null) ;
        if(c.moveToFirst())
        {
            wed6.setText(c.getString(3));
                    twed6.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='WED7';", null) ;
        if(c.moveToFirst())
        {
            wed7.setText(c.getString(3));
                    twed7.setText(c.getString(2));
        }

        //Thursday


        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU1';", null) ;
        if(c.moveToFirst())
        {
            thu1.setText(c.getString(3));
                    tthu1.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU2';", null) ;
        if(c.moveToFirst())
        {
            thu2.setText(c.getString(3));
                    tthu2.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU3';", null) ;
        if(c.moveToFirst())
        {
            thu3.setText(c.getString(3));
                    tthu3.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU4';", null) ;
        if(c.moveToFirst())
        {
            thu4.setText(c.getString(3));
                    tthu4.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU5';", null) ;
        if(c.moveToFirst())
        {
            thu5.setText(c.getString(3));
                    tthu5.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU6';", null) ;
        if(c.moveToFirst())
        {
            thu6.setText(c.getString(3));
                    tthu6.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='THU7';", null) ;
        if(c.moveToFirst())
        {
            thu7.setText(c.getString(3));
                    tthu7.setText(c.getString(2));
        }

        //Friday

        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI1';", null) ;
        if(c.moveToFirst())
        {
            fri1.setText(c.getString(3));
                    tfri1.setText(c.getString(2));
        }c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI2';", null) ;
        if(c.moveToFirst())
        {
            fri2.setText(c.getString(3));
                    tfri2.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI3';", null) ;
        if(c.moveToFirst())
        {
            fri3.setText(c.getString(3));
                    tfri3.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI4';", null) ;
        if(c.moveToFirst())
        {
            fri4.setText(c.getString(3));
                    tfri4.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI5';", null) ;
        if(c.moveToFirst())
        {
            fri5.setText(c.getString(3));
                    tfri5.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI6';", null) ;
        if(c.moveToFirst())
        {
            fri6.setText(c.getString(3));
                    tfri6.setText(c.getString(2));
        }
        c=db.rawQuery("SELECT * FROM TimeT WHERE Section='"+sec+"' AND Day='FRI7';", null) ;
        if(c.moveToFirst())
        {
            fri7.setText(c.getString(3));
                    tfri7.setText(c.getString(2));
        }






        try{

            save.setOnClickListener(v -> {
                db.execSQL("DELETE FROM TimeT WHERE Section='"+sec+"'");



                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON1','"+tmon1.getText().toString()+"','"+ mon1.getText().toString()+"');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON2','"+tmon2.getText().toString()+"','"+ mon2.getText().toString()+"');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON3','"+tmon3.getText().toString()+"','"+ mon3.getText().toString()+"');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON4','"+tmon4.getText().toString()+"','"+ mon4.getText().toString()+"');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON5','"+tmon5.getText().toString()+"','"+ mon5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON6','"+tmon6.getText().toString()+"','"+ mon6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON7','"+tmon7.getText().toString()+"','"+ mon7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE1','"+ttue1.getText().toString()+"','"+ tue1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE2','"+ttue2.getText().toString()+"','"+ tue2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE3','"+ttue3.getText().toString()+"','"+ tue3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE4','"+ttue4.getText().toString()+"','"+ tue4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE5','"+ttue5.getText().toString()+"','"+ tue5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE6','"+ttue6.getText().toString()+"','"+ tue6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE7','"+ttue7.getText().toString()+"','"+ tue7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED1','"+twed1.getText().toString()+"','"+ wed1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED2','"+twed2.getText().toString()+"','"+ wed2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED3','"+twed3.getText().toString()+"','"+ wed3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED4','"+twed4.getText().toString()+"','"+ wed4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED5','"+twed5.getText().toString()+"','"+ wed5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED6','"+twed6.getText().toString()+"','"+ wed6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED7','"+twed7.getText().toString()+"','"+ wed7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU1','"+tthu1.getText().toString()+"','"+ thu1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU2','"+tthu2.getText().toString()+"','"+ thu2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU3','"+tthu3.getText().toString()+"','"+ thu3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU4','"+tthu4.getText().toString()+"','"+ thu4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU5','"+tthu5.getText().toString()+"','"+ thu5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU6','"+tthu6.getText().toString()+"','"+ thu6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU7','"+tthu7.getText().toString()+"','"+ thu7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI1','"+tfri1.getText().toString()+"','"+ fri1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI2','"+tfri2.getText().toString()+"','"+ fri2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI3','"+tfri3.getText().toString()+"','"+ fri3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI4','"+tfri4.getText().toString()+"','"+ fri4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI5','"+tfri5.getText().toString()+"','"+ fri5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI6','"+tfri6.getText().toString()+"','"+ fri6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI7','"+tfri7.getText().toString()+"','"+ fri7.getText().toString()+ "');");




                Toast.makeText(getBaseContext(), "Time-Table Successfully Updated", Toast.LENGTH_LONG).show();
            });
        }catch (Exception e){
            System.out.println(e);
            Toast.makeText(getBaseContext(), "Error Updating Time-Table", Toast.LENGTH_LONG).show();
        }

    }
}