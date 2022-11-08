package com.example.test_wiffe;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (player == null){
            player = MediaPlayer.create(getApplicationContext(),R.raw.ngoi_sao_co_don);
            player.start();
        }
        return START_NOT_STICKY;
    }

}
