package muralidharan.mca.mad.a1st_exercise_font_size_font_color;

import static muralidharan.mca.mad.a1st_exercise_font_size_font_color.R.id.Text;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void color(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        name.setTextColor(Color.GREEN);
    }

    public void size(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        name.setTextSize(40);
    }
}