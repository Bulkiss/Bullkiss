package club.bullkiss.bullkiss;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private int test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test = 1;

// TODO ATTEMPT LOGIN DURING SPLASH SCREEN

        /****** SPLASH SCREEN ****/
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(2*1000);

                    // After 5 seconds redirect to another intent
//                    Intent i=new Intent(getBaseContext(),RegisterActivity.class);
//                    startActivity(i);

                    if (test == 1) {
                        Intent intent = new Intent(getBaseContext(), club.bullkiss.bullkiss.RegisterActivity.class);
                        finish();
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(getBaseContext(), club.bullkiss.bullkiss.LoginActivity.class);
                        finish();
                        startActivity(intent);
                    }

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();


    }
}
