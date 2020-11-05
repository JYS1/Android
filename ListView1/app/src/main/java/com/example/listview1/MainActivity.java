package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
//1. 리스트 화면 구성을 java에서 하는것 -> ListActivity로 만들기
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 2. 샘플 데이터를 만들기
        String[] values = {"사과", "딸기", "바나나", "포도", "복숭아"};

        // 3. 배열 어댑터를 생성 하고 배열 정보가 들어갑니다.
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, values);

        // 4. 리스트뷰에 어댑터 내용을 쏨
        setListAdapter(adapter);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String)getListAdapter().getItem(position);
        Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();

        super.onListItemClick(l, v, position, id);
    }
}