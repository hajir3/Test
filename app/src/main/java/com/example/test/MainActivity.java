package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Start,Stop;
    Vibrator vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Start = findViewById(R.id.button_start);
    Stop = findViewById(R.id.button_stop);

    vibrate = (Vibrator) getSystemService(VIBRATOR_SERVICE);

    Start.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            long[] muster = {0,150,80,150};
            vibrate.vibrate(muster,0);
        }
    });

    Stop.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            vibrate.cancel();
        }
    });
    }
}