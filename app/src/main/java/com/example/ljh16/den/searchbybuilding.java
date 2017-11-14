package com.example.ljh16.den;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by pshbo on 2017-11-11.
 */

public class searchbybuilding extends AppCompatActivity{

    Adapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_searchbybuilding);
        viewPager = (ViewPager) findViewById(R.id.vpsb);
        adapter = new Adapter(this);
        viewPager.setAdapter(adapter);

    }

}
