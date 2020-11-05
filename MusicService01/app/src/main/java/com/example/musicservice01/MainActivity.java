package com.example.musicservice01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start_click(View view) {
        //버튼을 누르면 음악이 나옴
        startService(new Intent(this, MusicService.class));
    }

    public void end_click(View view) {
        //버튼을 누르면 음악이 꺼짐
        stopService(new Intent(this, MusicService.class));
    }
}