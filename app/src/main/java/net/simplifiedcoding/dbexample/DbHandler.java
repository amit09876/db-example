package net.simplifiedcoding.dbexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHandler extends SQLiteOpenHelper {

    public static final String DB_NAME = "UMUDb";
    public static final int DB_VERSION = 1;


    public DbHandler(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE students (\n" +
                "\tid integer PRIMARY KEY AUTOINCREMENT,\n" +
                "\tname varchar,\n" +
                "\tclass varchar,\n" +
                "\tsession varchar\n" +
                ");\n");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addStudent(Student student){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("name", student.getName());
        cv.put("class", student.getsClass());
        cv.put("session", student.getSession());

        db.insert("students", null, cv);

        return true;
    }

}
