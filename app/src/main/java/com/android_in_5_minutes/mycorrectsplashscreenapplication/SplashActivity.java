package com.android_in_5_minutes.mycorrectsplashscreenapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        for (int i = 0; i < 200000; i++) {
            Log.i("LOG", "i: "+i);
        }

        startActivity(new Intent(this, MainActivity.class));
    }
}
