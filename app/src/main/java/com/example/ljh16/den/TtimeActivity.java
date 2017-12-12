package com.example.ljh16.den;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
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
import android.widget.CheckBox;



public class TtimeActivity extends AppCompatActivity {
    private static String TAG = "DEN_MainActivity";
    String myTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttime);
        @SuppressLint("WrongViewCast") final CheckBox Mon1 = (CheckBox) findViewById(R.id.Mon1);
        Mon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon1";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon2 = (CheckBox) findViewById(R.id.Mon2);
        Mon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon2";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon3 = (CheckBox) findViewById(R.id.Mon3);
        Mon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon3";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon4 = (CheckBox) findViewById(R.id.Mon4);
        Mon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon4";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon5 = (CheckBox) findViewById(R.id.Mon5);
        Mon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon5";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon6 = (CheckBox) findViewById(R.id.Mon6);
        Mon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon6";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon7 = (CheckBox) findViewById(R.id.Mon7);
        Mon7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon7";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon8 = (CheckBox) findViewById(R.id.Mon8);
        Mon8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon8";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Mon9 = (CheckBox) findViewById(R.id.Mon9);
        Mon9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Mon9";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues1 = (CheckBox) findViewById(R.id.Tues1);
        Tues1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues1";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues2 = (CheckBox) findViewById(R.id.Tues2);
        Tues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues2";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues3 = (CheckBox) findViewById(R.id.Tues3);
        Tues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues3";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues4 = (CheckBox) findViewById(R.id.Tues4);
        Tues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues4";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues5 = (CheckBox) findViewById(R.id.Tues5);
        Tues5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues5";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues6 = (CheckBox) findViewById(R.id.Tues6);
        Tues6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues6";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues7 = (CheckBox) findViewById(R.id.Tues7);
        Tues7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues7";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues8 = (CheckBox) findViewById(R.id.Tues8);
        Tues8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues8";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Tues9 = (CheckBox) findViewById(R.id.Tues9);
        Tues9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Tues9";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes1 = (CheckBox) findViewById(R.id.Wednes1);
        Wednes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes1";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes2 = (CheckBox) findViewById(R.id.Wednes2);
        Wednes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes2";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes3 = (CheckBox) findViewById(R.id.Wednes3);
        Wednes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes3";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes4 = (CheckBox) findViewById(R.id.Wednes4);
        Wednes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes4";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes5 = (CheckBox) findViewById(R.id.Wednes5);
        Wednes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes5";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes6 = (CheckBox) findViewById(R.id.Wednes6);
        Wednes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes6";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes7 = (CheckBox) findViewById(R.id.Wednes7);
        Wednes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes7";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes8 = (CheckBox) findViewById(R.id.Wednes8);
        Wednes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes8";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Wednes9 = (CheckBox) findViewById(R.id.Wednes9);
        Wednes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Wednes9";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs1 = (CheckBox) findViewById(R.id.Thurs1);
        Thurs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs1";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs2 = (CheckBox) findViewById(R.id.Thurs2);
        Thurs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs2";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs3 = (CheckBox) findViewById(R.id.Thurs3);
        Thurs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs3";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs4 = (CheckBox) findViewById(R.id.Thurs4);
        Thurs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs4";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs5 = (CheckBox) findViewById(R.id.Thurs5);
        Thurs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs5";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs6 = (CheckBox) findViewById(R.id.Thurs6);
        Thurs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs6";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs7 = (CheckBox) findViewById(R.id.Thurs7);
        Thurs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs7";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs8 = (CheckBox) findViewById(R.id.Thurs8);
        Thurs8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs8";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Thurs9 = (CheckBox) findViewById(R.id.Thurs9);
        Thurs9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Thurs9";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri1 = (CheckBox) findViewById(R.id.Fri1);
        Fri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri1";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri2 = (CheckBox) findViewById(R.id.Fri2);
        Fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri2";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri3 = (CheckBox) findViewById(R.id.Fri3);
        Fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri3";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri4 = (CheckBox) findViewById(R.id.Fri4);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri4";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri5 = (CheckBox) findViewById(R.id.Fri5);
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri5";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri6 = (CheckBox) findViewById(R.id.Fri6);
        Fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri6";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri7 = (CheckBox) findViewById(R.id.Fri7);
        Fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri7";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri8 = (CheckBox) findViewById(R.id.Fri8);
        Fri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTime = "Fri8";
            }
        });
        @SuppressLint("WrongViewCast") final CheckBox Fri9 = (CheckBox) findViewById(R.id.Fri9);
        Fri9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myTime = "Fri9";
            }
        });
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

            class InsertData extends AsyncTask<String, Void, String> {
                ProgressDialog progressDialog;

                @Override
                protected void onPreExecute() {
                    super.onPreExecute();

                    progressDialog = ProgressDialog.show(TtimeActivity.this,
                            "Please Wait", null, true, true);
                }


                @Override
                protected void onPostExecute(String result) {
                    super.onPostExecute(result);

                    progressDialog.dismiss();
                }


                @Override
                protected String doInBackground(String... params) {
                    Intent BuIntent = getIntent();
                    String building1 = BuIntent.getStringExtra("String");

                    String serverURL = "http://127.0.0.1/test.php";
                    String postParameters = "building1=" + building1 + "&times1=" + myTime;


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
                        outputStream.write(postParameters.getBytes("utf-8"));
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
                        String line;

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
        return super.onOptionsItemSelected(item);
    }
}
