package com.example.ljh16.den;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton a = (ImageButton) findViewById(R.id.imageButton);
        ImageButton b = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton c = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton d = (ImageButton) findViewById(R.id.imageButton4);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapsuchintent = new Intent(MainActivity.this, mapsuch.class);
                MainActivity.this.startActivity(mapsuchintent);
            }
        });
    }
}