package com.test.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Change the theme here after activity is created
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);
    }
}
