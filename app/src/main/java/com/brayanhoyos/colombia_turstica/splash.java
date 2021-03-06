package com.brayanhoyos.colombia_turstica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    private static final long SPLASH_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        /*this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WindowManager.LayoutParams.FLAG_FULLSCREEN;
        /*android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.hide();                                                   */

        setContentView(R.layout.activity_splash);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent().setClass(splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_DELAY);
    }
}
