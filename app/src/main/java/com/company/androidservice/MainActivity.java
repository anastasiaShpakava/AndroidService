package com.company.androidservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonStart;
    private Button buttonStop;
    private Button buttonPause;
    private Intent intent;
    private PowerManager.WakeLock wakeLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PowerManager mgr = (PowerManager)getSystemService(Context.POWER_SERVICE);
        wakeLock = mgr.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "myapp:MyWakeLock");
        wakeLock.acquire();

        buttonStop = findViewById(R.id.button_stop);
        buttonStart = findViewById(R.id.button_start);
        buttonPause = findViewById(R.id.button_pause);

        intent = new Intent(this, PlayService.class);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPause();
                onRestart();
            }
        });
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//    }
//    @Override
//    public void onPause() {
//        super.onPause();
//        stopService(intent);
//        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
//    }
}