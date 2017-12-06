package com.example.ljh16.den;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;



public class TtimeActivity extends AppCompatActivity {
    private static String TAG = "phptest_TtimeActivity";
String myTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttime);
        @SuppressLint("WrongViewCast") final CheckBox Mon1 = (CheckBox) findViewById(R.id.Mon1);
        Mon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon1.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon2 = (CheckBox) findViewById(R.id.Mon2);
        Mon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon2.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon3 = (CheckBox) findViewById(R.id.Mon3);
        Mon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon3.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon4 = (CheckBox) findViewById(R.id.Mon4);
        Mon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon4.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon5 = (CheckBox) findViewById(R.id.Mon5);
        Mon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon5.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon6 = (CheckBox) findViewById(R.id.Mon6);
        Mon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon6.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon7 = (CheckBox) findViewById(R.id.Mon7);
        Mon7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon7.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon8 = (CheckBox) findViewById(R.id.Mon8);
        Mon8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon8.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon9 = (CheckBox) findViewById(R.id.Mon9);
        Mon9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Mon9.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues1 = (CheckBox) findViewById(R.id.Tues1);
        Tues1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues1.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues2 = (CheckBox) findViewById(R.id.Tues2);
        Tues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues2.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues3 = (CheckBox) findViewById(R.id.Tues3);
        Tues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues3.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues4 = (CheckBox) findViewById(R.id.Tues4);
        Tues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues4.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues5 = (CheckBox) findViewById(R.id.Tues5);
        Tues5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues5.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues6 = (CheckBox) findViewById(R.id.Tues6);
        Tues6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues6.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues7 = (CheckBox) findViewById(R.id.Tues7);
        Tues7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues7.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues8 = (CheckBox) findViewById(R.id.Tues8);
        Tues8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues8.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues9 = (CheckBox) findViewById(R.id.Tues9);
        Tues9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Tues9.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes1 = (CheckBox) findViewById(R.id.Wednes1);
        Wednes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes1.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes2 = (CheckBox) findViewById(R.id.Wednes2);
        Wednes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes2.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes3 = (CheckBox) findViewById(R.id.Wednes3);
        Wednes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes3.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes4 = (CheckBox) findViewById(R.id.Wednes4);
        Wednes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes4.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes5 = (CheckBox) findViewById(R.id.Wednes5);
        Wednes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes5.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes6 = (CheckBox) findViewById(R.id.Wednes6);
        Wednes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes6.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes7 = (CheckBox) findViewById(R.id.Wednes7);
        Wednes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes7.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes8 = (CheckBox) findViewById(R.id.Wednes8);
        Wednes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes8.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes9 = (CheckBox) findViewById(R.id.Wednes9);
        Wednes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Wednes9.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs1 = (CheckBox) findViewById(R.id.Thurs1);
        Thurs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs1.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs2 = (CheckBox) findViewById(R.id.Thurs2);
        Thurs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs2.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs3 = (CheckBox) findViewById(R.id.Thurs3);
        Thurs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs3.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs4 = (CheckBox) findViewById(R.id.Thurs4);
        Thurs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs4.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs5 = (CheckBox) findViewById(R.id.Thurs5);
        Thurs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs5.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs6 = (CheckBox) findViewById(R.id.Thurs6);
        Thurs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs6.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs7 = (CheckBox) findViewById(R.id.Thurs7);
        Thurs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs7.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs8 = (CheckBox) findViewById(R.id.Thurs8);
        Thurs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs8.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs9 = (CheckBox) findViewById(R.id.Thurs9);
        Thurs9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Thurs9.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri1 = (CheckBox) findViewById(R.id.Fri1);
        Fri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri1.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri2 = (CheckBox) findViewById(R.id.Fri2);
        Fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri2.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri3 = (CheckBox) findViewById(R.id.Fri3);
        Fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri3.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri4 = (CheckBox) findViewById(R.id.Fri4);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri4.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri5 = (CheckBox) findViewById(R.id.Fri5);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri5.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri6 = (CheckBox) findViewById(R.id.Fri6);
        Fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri6.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri7 = (CheckBox) findViewById(R.id.Fri7);
        Fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri7.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri8 = (CheckBox) findViewById(R.id.Fri8);
        Fri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = Fri8.getText().toString();
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri9 = (CheckBox) findViewById(R.id.Fri9);
        Fri9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myTime = Fri9.getText().toString();
            }
        });
        @SuppressLint("StaticFieldLeak")
        class BackgroundTask extends AsyncTask<String, Void, String> {
            String target;
            Intent BuIntent = getIntent();
            String building1 = BuIntent.getStringExtra("");
            @Override
            protected void onPreExecute() {
                try {
                    target = "http://ec2-13-125-31-169.ap-northeast-2.compute.amazonaws.com/ttest.php?building1=" +
                            URLEncoder.encode(building1) + "&time1=" + URLEncoder.encode(myTime);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    URL url = new URL(target);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String temp;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((temp = bufferedReader.readLine()) != null) {
                        stringBuilder.append(temp + "\n");
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return stringBuilder.toString().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public void onProgressUpdate(Void... values) {super.onProgressUpdate();}
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.next, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.newPost) {
            Intent NextBu = new Intent(TtimeActivity.this, ResultActivity.class);
            TtimeActivity.this.startActivity(NextBu);
        }
        return super.onOptionsItemSelected(item);
    }
}