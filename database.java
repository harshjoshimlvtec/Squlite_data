
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import static android.content.Context.MODE_PRIVATE;



public class database {


    private EditText mobile,name,city;
    private SQLiteDatabase db;

    public void create() {
        String n = name.getText().toString();
        String m = mobile.getText().toString();
        String c = city.getText().toString();
        db = database.this.openOrCreateDatabase("abc.db", MODE_PRIVATE, null);
        db.execSQL("create table if not exists xyz(name varchar,mobile varchar,city varchar);");
        db.execSQL("insert into xyz (name,mobile,city) values('" + n + "','" + m + "','" + c + "');");
        db.close();
        Intent intent = new Intent(database.this, display.class);

        startActivity(intent);
    }

    private void startActivity(Intent intent) {
    }
}
