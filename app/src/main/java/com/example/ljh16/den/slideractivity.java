package com.example.ljh16.den;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

/**
 * Created by pshbo on 2017-11-14.
 */
public class slideractivity extends Activity {
    adapter adapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        viewPager =(ViewPager) findViewById(R.id.view4);
        adapter = new adapter(this);
        viewPager.setAdapter(adapter);

    }
}
