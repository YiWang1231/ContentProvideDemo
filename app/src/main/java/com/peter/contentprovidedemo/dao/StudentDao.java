package com.peter.contentprovidedemo.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.peter.contentprovidedemo.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void insert2Db(Context context, SQLiteDatabase db, List<Student> students) {
        // TODO
    }

    public List<Student> loadFromDb(Context context, SQLiteDatabase db) {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
