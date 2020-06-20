package com.kaya.awsome_info.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.IBinder;
import android.support.v4.content.ContextCompat;

import com.kaya.awsome_info.R;

import java.io.File;

import static java.lang.Boolean.TRUE;

public class SongService extends Service {

    private MediaPlayer mediaPlayer ;
    public SongService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public void onCreate() {
        super.onCreate();
        initMediaPlayer();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        mediaPlayer.setLooping(TRUE);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }

    private void initMediaPlayer() {
        try {
            mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.weiwei);
            mediaPlayer.prepare(); // 让MediaPlayer进入到准备状态
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
