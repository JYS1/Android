package com.example.myviewevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

// 첫번째 : 화면(뷰)를 만듬
// 두번째 : 터치 이벤트 처리를 하고
// 세번째 : 결과를 볼수 있게 해줌


class MyView extends View { //화면 설정
    int key;
    String str;
    int x,y;

    public MyView(Context context) {
        super(context);                     // 우리가 만든 화면(뷰)의 바탕색
        setBackgroundColor(Color.YELLOW);   // 노란색으로 설정

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {    // 터치 이벤트 메소드
        x = (int) event.getX(); // 좌표가 소숫점으로 들어오므로, int형으로 강제 전환
        y = (int) event.getY(); // Y값도 셋팅
        invalidate();           //갱신

        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {      //결과 그려주기
        Paint paint = new Paint();
        paint.setTextSize(50);                  // 텍스트 사이즈 50
        canvas.drawCircle(x, y, 30, paint);                    // 인자 4개 x, y, 30짜리 원 그리기
        canvas.drawText(x + " , " + y + "에서 터치 이벤트 발생", x, y+100, paint);                                             // 인자 4개
        super.onDraw(canvas);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w); //이 코드가 xml 연결해서 띄우는 코드. 이부분을 바꿈

    }
}