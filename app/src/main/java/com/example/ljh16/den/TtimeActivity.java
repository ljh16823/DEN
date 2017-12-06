package com.example.ljh16.den;

import java.io.*;
import java.net.*;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import org.apache.http.params.HttpParams;

import java.net.HttpURLConnection;
import java.net.URL;

public class TtimeActivity extends AppCompatActivity {
    private static String TAG = "TtimeActivity";
    String myId, myTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttime);
        @SuppressLint("WrongViewCast") CheckBox Mon1 = (CheckBox) findViewById(R.id.Mon1);
        Mon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon1";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon2 = (CheckBox) findViewById(R.id.Mon2);
        Mon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon2";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon3 = (CheckBox) findViewById(R.id.Mon3);
        Mon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon3";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon4 = (CheckBox) findViewById(R.id.Mon4);
        Mon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon4";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon5 = (CheckBox) findViewById(R.id.Mon5);
        Mon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon5";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon6 = (CheckBox) findViewById(R.id.Mon6);
        Mon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon6";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon7 = (CheckBox) findViewById(R.id.Mon7);
        Mon7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon7";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon8 = (CheckBox) findViewById(R.id.Mon8);
        Mon8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon8";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Mon9 = (CheckBox) findViewById(R.id.Mon9);
        Mon9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Mon9";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues1 = (CheckBox) findViewById(R.id.Tues1);
        Tues1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues1";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues2 = (CheckBox) findViewById(R.id.Tues2);
        Tues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues2";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues3 = (CheckBox) findViewById(R.id.Tues3);
        Tues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues3";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues4 = (CheckBox) findViewById(R.id.Tues4);
        Tues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues4";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues5 = (CheckBox) findViewById(R.id.Tues5);
        Tues5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues5";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues6 = (CheckBox) findViewById(R.id.Tues6);
        Tues6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues6";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues7 = (CheckBox) findViewById(R.id.Tues7);
        Tues7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues7";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues8 = (CheckBox) findViewById(R.id.Tues8);
        Tues8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues8";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Tues9 = (CheckBox) findViewById(R.id.Tues9);
        Tues9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Tues9";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes1 = (CheckBox) findViewById(R.id.Wednes1);
        Wednes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes1";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes2 = (CheckBox) findViewById(R.id.Wednes2);
        Wednes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes2";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes3 = (CheckBox) findViewById(R.id.Wednes3);
        Wednes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes3";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes4 = (CheckBox) findViewById(R.id.Wednes4);
        Wednes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes4";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes5 = (CheckBox) findViewById(R.id.Wednes5);
        Wednes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes5";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes6 = (CheckBox) findViewById(R.id.Wednes6);
        Wednes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes6";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes7 = (CheckBox) findViewById(R.id.Wednes7);
        Wednes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes7";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes8 = (CheckBox) findViewById(R.id.Wednes8);
        Wednes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes8";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Wednes9 = (CheckBox) findViewById(R.id.Wednes9);
        Wednes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Wednes9";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs1 = (CheckBox) findViewById(R.id.Thurs1);
        Thurs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs1";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs2 = (CheckBox) findViewById(R.id.Thurs2);
        Thurs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs2";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs3 = (CheckBox) findViewById(R.id.Thurs3);
        Thurs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs3";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs4 = (CheckBox) findViewById(R.id.Thurs4);
        Thurs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs4";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs5 = (CheckBox) findViewById(R.id.Thurs5);
        Thurs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs5";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs6 = (CheckBox) findViewById(R.id.Thurs6);
        Thurs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs6";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs7 = (CheckBox) findViewById(R.id.Thurs7);
        Thurs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs7";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs8 = (CheckBox) findViewById(R.id.Thurs8);
        Thurs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs8";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Thurs9 = (CheckBox) findViewById(R.id.Thurs9);
        Thurs9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Thurs9";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri1 = (CheckBox) findViewById(R.id.Fri1);
        Fri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri1";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri2 = (CheckBox) findViewById(R.id.Fri2);
        Fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri2";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri3 = (CheckBox) findViewById(R.id.Fri3);
        Fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri3";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri4 = (CheckBox) findViewById(R.id.Fri4);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri4";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri5 = (CheckBox) findViewById(R.id.Fri5);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri5";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri6 = (CheckBox) findViewById(R.id.Fri6);
        Fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri6";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri7 = (CheckBox) findViewById(R.id.Fri7);
        Fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri7";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri8 = (CheckBox) findViewById(R.id.Fri8);
        Fri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri8";
            }
        });
        @SuppressLint("WrongViewCast") CheckBox Fri9 = (CheckBox) findViewById(R.id.Fri9);
        Fri9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTime = "Fri9";
            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.next, menu);
        Intent BuIntent = getIntent();
        myId = BuIntent.getExtras().getString("ID");
        String buildiing1 = myId;
        String times1 = myTime;

        InsertData task = new InsertData();
        task.execute(buildiing1, times1);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.newPost) {
            Toast.makeText(TtimeActivity.this, "새 글 `등록 버튼을 클릭했습니다.", Toast.LENGTH_SHORT).show();
            Intent NextBu = new Intent(TtimeActivity.this, ResultActivity.class);
            TtimeActivity.this.startActivity(NextBu);
        }
        return super.onOptionsItemSelected(item);
    }

    class InsertData extends AsyncTask<String, Void, String> {
        ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(TtimeActivity.this,
                    "Please Wait", null, true, true);
        }

        @Override
        protected String doInBackground(String... params) {
            String myId = (String) params[0];
            String myTime = (String) params[1];
            String serverURL = "http://ec2-13-125-31-169.ap-northeast-2.compute.amazonaws.com/tttest.php";
            String postParameters = "building1=" + myId + "&times1=" + myTime;


            try {

                URL url = new URL(serverURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                //httpURLConnection.setRequestProperty("content-type", "application/json");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();


                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(postParameters.getBytes("UTF-8"));
                outputStream.flush();
                outputStream.close();


                int responseStatusCode = httpURLConnection.getResponseCode();
                Log.d(TAG, "POST response code - " + responseStatusCode);

                InputStream inputStream;
                if (responseStatusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = httpURLConnection.getInputStream();
                } else {
                    inputStream = httpURLConnection.getErrorStream();
                }


                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();
                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }


                bufferedReader.close();


                return sb.toString();


            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);
                return new String("Error: " + e.getMessage());
            }
        }
    }
}