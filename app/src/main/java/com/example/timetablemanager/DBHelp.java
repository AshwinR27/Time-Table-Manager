//package com.example.timetablemanager;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
//
//public class DBHelp extends SQLiteOpenHelper {
//    public DBHelp(Context context) {
//        super(context, "TimeTable.db", null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("create Table TimeT(section TEXT," +
//                "day TEXT," +
//                "subject TEXT," +
//                "primary key(section,day));");
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("drop table if exists TimeT");
//
//    }
//
//    public Boolean insertData(String section,String day,String subject){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("section",section);
//        contentValues.put("day",day);
//        contentValues.put("subject",subject);
//        long result = db.insert("TimeT",null,contentValues);
//        if(result==-1){
//            return false;
//        }
//        else
//            return true;
//    }
//
//    public Boolean updateData(String section,String day,String subject){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("subject",subject);
//        long result = db.update("TimeT",contentValues,"section=?" AND "day=?",new String[] {section});
//        if(result==-1){
//            return false;
//        }
//        else
//            return true;
//    }
//}
