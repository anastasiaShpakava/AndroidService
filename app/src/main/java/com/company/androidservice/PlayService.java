package com.company.androidservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.os.PowerManager;
import android.widget.Toast;

public class PlayService extends Service {
    private static MediaPlayer mediaPlayer;

    public PlayService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
      return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        mediaPlayer = MediaPlayer.create(this,R.raw.eminem);
        mediaPlayer.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service is started",Toast.LENGTH_SHORT ).show();
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
       // mediaPlayer.seekTo();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service stopped",Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();
    }

    public static void pause() {
        if (mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }
}
