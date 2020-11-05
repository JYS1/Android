package com.example.graphic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;


class MyView extends View {
    public MyView (Context context) {
        super(context);
        setBackgroundColor(Color.BLUE);
    }
       //그림 넣기

    @Override
    protected void onDraw(Canvas canvas) {
        // 그림 이미지 처리
        // 1. 비트맵 이미지로 무조건 전환
        // 2. 그걸 캔버스에 부르기
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.cat);

        canvas.drawBitmap(b, 0 ,0 , null);
        Paint paint = new Paint();
        paint.setTextSize(80);
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(20);
        canvas.drawText("고양이 사진이에요",100,700,paint);
        canvas.drawLine(100,900,700,900,paint);
        canvas.drawCircle(300, 1200, 200, paint);
        super.onDraw(canvas);
    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w;
        w = new MyView(this);   // MyView 선언


        setContentView(w); //그냥 넣으면 Error뜸 쓸때 다시 이름 부여해줘야함

    }
}