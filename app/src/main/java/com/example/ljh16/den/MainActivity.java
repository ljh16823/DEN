package com.example.ljh16.den;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
    }

    public void onClick(View view) {
        Intent imIntent = new Intent(this, mapsuch.class);
        startActivity(imIntent);
    }

    public void onClick2(View view) {
        Intent im2Intent = new Intent(this, slideractivity.class);
        startActivity(im2Intent);
    }
}