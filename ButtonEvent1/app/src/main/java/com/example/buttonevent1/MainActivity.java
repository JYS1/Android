package com.example.buttonevent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //할일 첫번째 : 버튼이 클릭되면 작동할 함수를 만든다.
    //할일 두번째 : 만든 클래스를 버튼에 연결
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;                              // 우리가 만든 button id를 사용하기 위해 선언 int x 로 생각하면 됨
        button=(Button)findViewById(R.id.button);   //자바의 button과 xml의 button 연결
        /*
        MyListenerClass buttonListener;             // 자바에서 내가 만든 클래스도 이름을 새로 줘야 함
        buttonListener = new MyListenerClass();
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        // 결국 button이 클릭되면 MyListenerClass가 작동됨
    }

    /*
    class MyListenerClass implements View.OnClickListener {
        @Override

        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다.", Toast.LENGTH_SHORT).show();
        }
        // 클래스 생성 -> 자바문법, 클래스는 함수(메소드)와 변수를 다 합쳐서 한 통에 넣을 것
        // 이 클래스가 바로 클릭되면 움직

    }
    */

}