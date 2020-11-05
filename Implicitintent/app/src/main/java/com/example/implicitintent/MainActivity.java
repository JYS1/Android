package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_phone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+82)123456789"));
        startActivity(intent);
    }

    public void onClick_map(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("geo:37.30.127.2?z=10"));
        startActivity(intent);
    }

    public void onClick_web(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void onClick_add(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("content://contacts/people/"));
        startActivity(intent);
    }
}