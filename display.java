package com.example.lenovo.squlite_data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class display extends AppCompatActivity {

    private TextView name,mobile,city;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name=(TextView)findViewById(R.id.textView1);
        mobile=(TextView)findViewById(R.id.textView3);
        city=(TextView)findViewById(R.id.textView5);
        db= openOrCreateDatabase("harsh.db",MODE_PRIVATE,null);
        Cursor cursor=db.rawQuery("select * from hj",null);
        while(cursor.moveToNext()) {
            name.setText(cursor.getString(0));
            mobile.setText(cursor.getString(1));
            city.setText(cursor.getString(2));

        }

    }
}
