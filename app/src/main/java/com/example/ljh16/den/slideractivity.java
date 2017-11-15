package com.example.ljh16.den;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

/**
 * Created by pshbo on 2017-11-14.
 */
public class slideractivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

    }
}
