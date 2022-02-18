package muralidharan.mca.mad.notes_app;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    private Button nextpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextpage=findViewById(R.id.addnote);
//        MaterialButton addNoteBtn = findViewById(R.id.addnewnote);

        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddNoteActivity.class);
                StartActivity(intent);
//                StartActivity(new Intent(MainActivity.this,AddNoteActivity.class));
//                StartActivity(new Intent(MainActivity.this,AddNoteActivity.class));
            }

            private void StartActivity(Intent intent) {
            }
        });
    }
}