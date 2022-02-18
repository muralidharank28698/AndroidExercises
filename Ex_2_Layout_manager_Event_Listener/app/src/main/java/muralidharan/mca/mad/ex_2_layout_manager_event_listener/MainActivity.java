package muralidharan.mca.mad.ex_2_layout_manager_event_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    variable declaration...
    private EditText number1,number2;
    private Button Add,sub,clear;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the id
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        Add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        clear = (Button) findViewById(R.id.button3);
        result = (TextView) findViewById(R.id.result);

        // Addition
        Add.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = number1.getText().toString();
                String value2 = number2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int Add = a + b;
                result.setText(Integer.toString(Add));
//                Toast.makeText(getApplicationContext(), String.valueOf(Add), Toast.LENGTH_LONG).show();
            }
        });

        //subtract
        sub.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = number1.getText().toString();
                String value2 = number2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sub = a - b;
                result.setText(Integer.toString(sub));
//                Toast.makeText(getApplicationContext(), String.valueOf(sub), Toast.LENGTH_LONG).show();
            }
        });

        //clear
        clear.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.getText().clear();
                number2.getText().clear();
                result.setText(" ");
            }
        });
    }
}