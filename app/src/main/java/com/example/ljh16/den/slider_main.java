package com.example.ljh16.den;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class slider_main extends Activity {
    adapter adapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_main);
        viewPager = (ViewPager) findViewById(R.id.view);
        adapter = new adapter(this);
        viewPager.setAdapter(adapter);

    }
}
