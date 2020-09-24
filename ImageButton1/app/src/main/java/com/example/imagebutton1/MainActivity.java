package com.example.imagebutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        //클릭이 되면 이곳에서 지정된 내용이 작동된다.
        Toast.makeText(getApplicationContext(), "버트니 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }
}