package com.example.ljh16.den;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;


    public class slideractivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_slider);
            TextView tV = (TextView) findViewById(R.id.textView);
            ImageView iV = (ImageView) findViewById(R.id.imageView);

        }
    }
