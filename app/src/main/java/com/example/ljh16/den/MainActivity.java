package com.example.ljh16.den;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageBuIntent = new Intent(MainActivity.this, MapActivity.class);
                MainActivity.this.startActivity(imageBuIntent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageBu2Intent = new Intent(MainActivity.this, slider_main.class);
                startActivity(imageBu2Intent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageBu3Intent = new Intent(MainActivity.this, Result2Activity.class);
                startActivity(imageBu3Intent);
            }
        });


    }
}