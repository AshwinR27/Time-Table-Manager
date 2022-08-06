//package com.example.timetablemanager;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class DatabaseAccess {
//    private SQLiteOpenHelper openHelper;
//    private SQLiteDatabase db;
//    private static DatabaseAccess instance;
//    Cursor c = null;
//
//    private DatabaseAccess(Context context){
//        this.openHelper = new databaseOpenHelper(context);
//    }
//
//    public static DatabaseAccess getInstance(Context context){
//        if(instance == null){
//            instance = new DatabaseAccess(context);
//        }
//        return instance;
//    }
//
//    public void open(){
//        this.db = openHelper.getWritableDatabase();
//
//    }
//
//    public void close(){
//        if(db != null){
//            this.db.close();
//        }
//
//    }
//
//    public String getAddress(String section,String day){
//        c = db.rawQuery("select Subject from TimeT where Section= '"+section+"' and Day= '"+day+"'",new String[]{});
//        StringBuffer buffer = new StringBuffer();
//        while (c.moveToNext()){
//            String subject = c.getString(0);
//            buffer.append(""+subject);
//
//        }
//        return buffer.toString();
//    }
//}
