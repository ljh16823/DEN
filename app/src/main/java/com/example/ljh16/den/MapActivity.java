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
        Button Bu = findViewById(R.id.기초과학관);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","기초과학관");
                startActivity(BuIntent);
            }
        });
        Button Bu2 =  findViewById(R.id.공학관);
        Bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","공학관");
                startActivity(BuIntent);
            }
        });
        Button Bu3 = findViewById(R.id.응용과학관);
        Bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","응용과학관");
                startActivity(BuIntent);
            }
        });
        Button Bu4 = findViewById(R.id.공학실험관);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","공학실험관");
                startActivity(BuIntent);
            }
        });
        Button Bu5 = findViewById(R.id.학생회관);
        Bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(BuIntent);
            }
        });
        Button Bu6 = findViewById(R.id.창의학습관);
        Bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","창의학습관");
                startActivity(BuIntent);
            }
        });
        Button Bu7 = findViewById(R.id.창학관);
        Bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","창학관");
                startActivity(BuIntent);
            }
        });
        Button Bu8 = findViewById(R.id.MACC센터);
        Bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","MACC센터");
                startActivity(BuIntent);
            }
        });
        Button Bu9 = findViewById(R.id.렉처홀);
        Bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","렉처홀");
                startActivity(BuIntent);
            }
        });
        Button Bu10 = findViewById(R.id.지산도서관);
        Bu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                startActivity(BuIntent);

            }
        });
        Button Bu11 = findViewById(R.id.기념관);
        Bu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","기념관");
                startActivity(BuIntent);
            }
        });
        Button Bu12 = findViewById(R.id.혜화문화관);
        Bu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","혜화문화관");
                startActivity(BuIntent);

            }
        });
        Button Bu13 = findViewById(R.id.인문사회관);
        Bu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","인문사회관");
                startActivity(BuIntent);

            }
        });
        Button Bu14 = findViewById(R.id.문무관);
        Bu14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","문무관");
                startActivity(BuIntent);

            }
        });
        Button Bu15 = findViewById(R.id.한의학관);
        Bu15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","한의학관");
                startActivity(BuIntent);

            }
        });
        Button Bu16 = findViewById(R.id.산학협력관);
        Bu16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                BuIntent.putExtra("ID","산학협력관");
                startActivity(BuIntent);

            }
        });

    }
}