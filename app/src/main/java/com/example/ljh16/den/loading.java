package com.example.ljh16.den;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


public class loading  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_first);
//loading_first 엑티비티에 있는 이미지뷰 선언
        ImageView load = (ImageView) findViewById(R.id.load);
//handler 기능을 이용해 일정시간 로딩화면이 보인 뒤 intent 기능을 이용하여 화면을 이동
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}