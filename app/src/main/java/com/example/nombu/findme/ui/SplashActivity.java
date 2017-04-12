package com.example.nombu.findme.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nombu.findme.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread() {
            public void run() {
                try
                {
                    sleep(2000);
                    Intent myActivity = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(myActivity);
                    finish();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };
        timer.start();
    }
}
