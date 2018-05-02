package com.example.luyin.finalproject;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class BackGroundSoundService extends Service {
    private static final String TAG = null;
    static MediaPlayer player;
    public static boolean isOn;
    public IBinder onBind(Intent arg0) {

        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this,R.raw.music1);
        player.setLooping(true); // Set looping
        player.setVolume(1,1);

    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return 1;
    }

    public void onStart(Intent intent, int startId) {
        // TO DO
    }
    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }
    public void onPause() {

    }

    public static void Pause() {
        if (player.isPlaying()) {
            player.pause();
            isOn = false;
        } else {
            player.start();
            isOn = true;
        }
    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {

    }
}
