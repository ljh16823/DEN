package com.example.ljh16.den;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.setWebViewClient(new WebViewClient()); //이걸 해주지 않으니 폰의 웹브라우저에서 열림
        browser.loadUrl("http://ec2-13-125-31-169.ap-northeast-2.compute.amazonaws.com/ttest.php");

    }
}
