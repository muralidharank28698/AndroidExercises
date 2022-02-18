package muralidharan.mca.mad.ex_3_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    boolean isNewinput = true;
    String op = "+";
    String oldNumber = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.edittext);
    }

    public void numberEvent(View view) {
        if (isNewinput)
            ed1.setText("");
        isNewinput = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.b1:
                number += "1";
                break;
            case R.id.b2:
                number += "2";
                break;
            case R.id.b3:
                number += "3";
                break;
            case R.id.b4:
                number += "4";
                break;
            case R.id.b5:
                number += "5";
                break;
            case R.id.b6:
                number += "6";
                break;
            case R.id.b7:
                number += "7";
                break;
            case R.id.b8:
                number += "8";
                break;
            case R.id.b9:
                number += "9";
                break;
            case R.id.b0:
                number += "0";
                break;
            case R.id.bdot:
                number += ".";
                break;
        }
        ed1.setText(number);
    }

    public void clear(View view) {
        ed1.setText("0");
        isNewinput = true;
    }

    public void operatorEvent(View view) {
        isNewinput = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.bdiv:op = "/";break;
            case R.id.bmul:op = "*";break;
            case R.id.badd:op = "+";break;
            case R.id.bsub:op = "-";break;
        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }

    public void percentage(View view) {
        double no = Double.parseDouble(ed1.getText().toString()) / 100;
        ed1.setText(no + "");
        isNewinput =  true;
    }
}