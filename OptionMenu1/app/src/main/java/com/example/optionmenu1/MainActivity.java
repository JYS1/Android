package com.example.optionmenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set 컨텐츠뷰에 activity_main만 있습니다. 즉 우리가 만든 mymenu를 달아야 한다.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 여기부터는 외우지 말고 코드를 읽듯 이해!
        MenuInflater inflater;                          // 선언
        inflater = getMenuInflater();                   // inflater에 메뉴여러 값 입력
        inflater.inflate(R.menu.mymenu, menu);          // 우리가 만든 메뉴의 경로를 넣는다.

        return super.onCreateOptionsMenu(menu);
    }

    public void apple_click(MenuItem itme) {
        Toast.makeText(getApplicationContext(), "사과가 눌렸네요", Toast.LENGTH_SHORT).show();
    }

    public void grape_click(MenuItem itme) {
        Toast.makeText(getApplicationContext(), "포도가 눌렸네요", Toast.LENGTH_SHORT).show();
    }

    public void banana_click(MenuItem itme) {
        Toast.makeText(getApplicationContext(), "바나나가 눌렸네요", Toast.LENGTH_SHORT).show();
    }
}