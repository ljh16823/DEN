package com.example.ljh16.den;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class slider_main extends AppCompatActivity {
    adapter adapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Toast.makeText(this, "슬라이드로 선택하세요.", Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_main);
        viewPager = (ViewPager) findViewById(R.id.view);
        adapter = new adapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1400);
        ImageButton Bu = findViewById(R.id.imageButton6);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(slider_main.this, TtimeActivity.class);
                startActivity(BuIntent);
            }
        });


    }
}
