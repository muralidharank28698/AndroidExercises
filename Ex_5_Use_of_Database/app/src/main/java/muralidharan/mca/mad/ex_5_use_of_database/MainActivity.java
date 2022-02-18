package muralidharan.mca.mad.ex_5_use_of_database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbMca helper = new MyDbMca(this,"PTU",null,1);
        db = helper.getWritableDatabase();
    }

    // data insertion...
    public void insertdata(View view) {
        if (db == null) {
            Toast.makeText(this,"database not connected",Toast.LENGTH_SHORT).show();
            return;
        }

        EditText studName = (EditText) findViewById(R.id.studName);
        EditText studReg = (EditText) findViewById(R.id.studReg);

        String sName = studName.getText().toString();
        String sReg = studReg.getText().toString();

        ContentValues values = new ContentValues();
        values.put("stud_name", sName);
        values.put("stud_reg", sReg);

        long rowid = db.insert("students",null,values);
        if (rowid > 0) {
            Toast.makeText(this,"Row Inserted",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"Row Not Inserted",Toast.LENGTH_LONG).show();
        }
    }

    // view data
    public void viewdata(View view) {
        if (db == null) {
            Toast.makeText(this,"database not connected",Toast.LENGTH_SHORT).show();
            return;
        }
        Cursor c = db.query("students",null,null,null,null,null,null);
        StringBuilder myBuilder = new StringBuilder();
        if (c.moveToFirst()) {
            do {
                myBuilder.append(c.getInt(0) + "  " + c.getString(1) + "  " + c.getString(2) + "\n");
            } while (c.moveToNext());
        }
        Toast.makeText(this,myBuilder.toString(),Toast.LENGTH_LONG).show();

    }
}