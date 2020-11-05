package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //1. xml에서 만든 리스트뷰를 자바에서도 쓸 수 있게 선언하고 값을 넣음
    ListView listView;

    //2. 데이터를 만들기
    String[] values = {"서울", "부산", "광주", "제주", "울산"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3. 어댑터를 만들기
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, values);

        //4. 어댑터를 리스트뷰에 셋팅하기
        listView = (ListView)findViewById(R.id.listView);   //xml의 listView를 자바에서 만든 listView에 넣기.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), values[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}