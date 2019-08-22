package com.example.mediaescolarmelhorado.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mediaescolarmelhorado.R;

public class SplashActivity extends AppCompatActivity {


    private static final int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        presentSpalshScreen();

    }

    private void presentSpalshScreen(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainScreen =
                        new Intent(SplashActivity.this,MainActivity.class);
                startActivity(mainScreen);

            }
        },SPLASH_TIME_OUT );
    }
}