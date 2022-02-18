package muralidharan.mca.mad.ex_7_implement_multi_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
    }

    private class MyRunnable implements Runnable {

        @Override
        public void run() {
            // long running operations...
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            img.setImageResource(R.drawable.ic_launcher_foreground);
        }
    }

    public void ChangeInAsync(View view) {
        Thread ImgLoad = new Thread(new MyRunnable());
        ImgLoad.start();
    }

    public void ChangeInSync(View view) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        img.setImageResource(R.drawable.ic_launcher_foreground);
    }

    public void Reset(View view) {
        img.setImageResource(R.drawable.ic_launcher_background);
    }

    public void ShowToastMessage(View view) {
        Toast.makeText(this,"Toast Message Showing",Toast.LENGTH_SHORT).show();
    }
}