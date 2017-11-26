package com.example.ljh16.den;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_map);
        Button Bu = findViewById(R.id.Bu);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(BuIntent);
            }
        });
        Button Bu2 =  findViewById(R.id.Bu2);
        Bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu2Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu2Intent);
            }
        });
        Button Bu3 = findViewById(R.id.Bu3);
        Bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu3Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu3Intent);
            }
        });
        Button Bu4 = findViewById(R.id.Bu4);
        Bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu4Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu4Intent);
            }
        });
        Button Bu5 = findViewById(R.id.Bu5);
        Bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu5Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu5Intent);
            }
        });
        Button Bu6 = findViewById(R.id.Bu6);
        Bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu6Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu6Intent);
            }
        });
        Button Bu7 = findViewById(R.id.Bu7);
        Bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu7Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu7Intent);
            }
        });
        Button Bu8 = findViewById(R.id.Bu8);
        Bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu8Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu8Intent);
            }
        });
        Button Bu9 = findViewById(R.id.Bu9);
        Bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu9Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu9Intent);
            }
        });
        Button Bu10 = findViewById(R.id.Bu10);
        Bu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu10Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu10Intent);

            }
        });
        Button Bu11 = findViewById(R.id.Bu11);
        Bu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu11Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu11Intent);
            }
        });
        Button Bu12 = findViewById(R.id.Bu12);
        Bu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu12Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu12Intent);

            }
        });
        Button Bu13 = findViewById(R.id.Bu13);
        Bu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu13Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu13Intent);

            }
        });
        Button Bu14 = findViewById(R.id.Bu14);
        Bu14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu14Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu14Intent);

            }
        });
        Button Bu15 = findViewById(R.id.Bu15);
        Bu15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu15Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu15Intent);

            }
        });
        Button Bu16 = findViewById(R.id.Bu16);
        Bu16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bu16Intent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(Bu16Intent);

            }
        });

    }
}