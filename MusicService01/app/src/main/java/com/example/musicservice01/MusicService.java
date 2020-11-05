package com.example.musicservice01;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;


public class MusicService extends Service { //서비스를 다루는 클래스
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {  // 통신과 관계하는 값 현재 안씀
        return null;
    }

    @Override
    public void onCreate() {                // 음악 플레이어 만들기
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.old_pop);
        player.setLooping(false);
    }

    @Override
    public void onDestroy() {               // 서비스 중단
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "음악서비스가 중단되었습니다.", Toast.LENGTH_SHORT).show();
        player.stop();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {  //음악 재생기로 재생 시작
        Toast.makeText(getApplicationContext(), "음악 서비스가 시작되었습니다." ,Toast.LENGTH_SHORT).show();
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }
}
