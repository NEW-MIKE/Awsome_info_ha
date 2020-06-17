package com.kaya.awsome_info;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView web=(WebView) findViewById(R.id.web);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extar_data");
        Toast.makeText(this,data, Toast.LENGTH_LONG).show();
        web.loadUrl(data);

        web.getSettings().setJavaScriptEnabled(true);  //加上这一行网页为响应式的
        web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;   //返回true， 立即跳转，返回false,打开网页有延时
            }
        });
    }

}
