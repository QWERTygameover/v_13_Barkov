package com.example.barkov_v_13;

import static android.provider.UserDictionary.Words._ID;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "USER";
    public static final String LOGIN = "LOGIN";
    public static final String PASSWORD = "PASSWORD";

    public DBHelper(Context context){
        super(context, "DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                LOGIN + " TEXT, " +
                PASSWORD + " TEXT " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
    }
}
