package com.android.a81coundownview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cn.iwgang.countdownview.CountdownView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountdownView countdownView = (CountdownView) findViewById(R.id.countDownView);
        countdownView.start(86400);
    }
}