package com.example.ljh16.den;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_map);
        final Button Bu = findViewById(R.id.기초과학관);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "기초과학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu2 =  findViewById(R.id.공학관);
        Bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "공학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu3 = findViewById(R.id.응용과학관);
        Bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "응용과학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu4 = findViewById(R.id.공학실험관);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "기초과학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu5 = findViewById(R.id.학생회관);
        Bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "학생회관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu6 = findViewById(R.id.창의학습관);
        Bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "창의학습관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu7 = findViewById(R.id.창학관);
        Bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "창학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu8 = findViewById(R.id.MACC센터);
        Bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "MACC센터";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu9 = findViewById(R.id.렉처홀);
        Bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu9.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu10 = findViewById(R.id.지산도서관);
        Bu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu10.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu11 = findViewById(R.id.기념관);
        Bu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu11.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);
            }
        });
        final Button Bu12 = findViewById(R.id.혜화문화관);
        Bu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu12.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu13 = findViewById(R.id.인문사회관);
        Bu13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu13.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu14 = findViewById(R.id.문무관);
        Bu14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu14.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu15 = findViewById(R.id.한의학관);
        Bu15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu15.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu16 = findViewById(R.id.산학협력관);
        Bu16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = Bu16.getText().toString();
                BuIntent.putExtra("", myID);
                startActivity(BuIntent);

            }
        });
        final Button Bu17 = findViewById(R.id.융합과학관);
        Bu17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuIntent = new Intent(MapActivity.this, TtimeActivity.class);
                String myID = "융합과학관";
                BuIntent.putExtra("String", myID);
                startActivity(BuIntent);
            }
        });
    }
}