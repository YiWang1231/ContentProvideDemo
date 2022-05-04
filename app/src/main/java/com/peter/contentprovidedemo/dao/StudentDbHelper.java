package com.peter.contentprovidedemo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.peter.contentprovidedemo.bean.Student;

public class StudentDbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "db_student.db";
    private static final int VERSION = 1;

    public static StudentDbHelper sInstance;

    public StudentDbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    public static synchronized StudentDbHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new StudentDbHelper(context.getApplicationContext());
        }
        return  sInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createStudent = "CREATE TABLE IF NOT EXISTS " + Student.TABLE_NAME + "("
                + Student.COL_ID + " INTEGER PRIMARY KEY, " +
                Student.COL_NAME + " VARCHAR, " +
                Student.COL_GENDER + " VARCHAR, " +
                Student.COL_AGE + " INTEGER" + ")";
        sqLiteDatabase.execSQL(createStudent);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
