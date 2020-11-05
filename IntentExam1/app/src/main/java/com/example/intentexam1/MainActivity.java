package com.example.intentexam1;

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


    public void onClick1(View view) {
        // 첫번째 화면에서 두번째 화면으로 가는것.
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}