package com.example.lenovo.squlite_data;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by lenovo on 11-05-2018.
 */

public class database {


    private EditText mobile,name,city;
    private SQLiteDatabase db;

    public void create() {
        String n = name.getText().toString();
        String m = mobile.getText().toString();
        String c = city.getText().toString();
        db = database.this.openOrCreateDatabase("harsh.db", MODE_PRIVATE, null);
        db.execSQL("create table if not exists hj(name varchar,mobile varchar,city varchar);");
        db.execSQL("insert into hj (name,mobile,city) values('" + n + "','" + m + "','" + c + "');");
        db.close();
        Intent intent = new Intent(database.this, display.class);

        startActivity(intent);
    }

    private void startActivity(Intent intent) {
    }
}
