package com.kaya.awsome_info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.Calendar;


public class WebActivity extends AppCompatActivity {
    private WebView web;
    private Calendar mCalendar;
    private int mHour,mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web=(WebView) findViewById(R.id.web);
        long time=System.currentTimeMillis();
        mCalendar = Calendar.getInstance();
        mCalendar.setTimeInMillis(time);
        mHour = mCalendar.get(Calendar.HOUR);
        mMinute = mCalendar.get(Calendar.MINUTE);

        Intent intent = getIntent();
        String data = intent.getStringExtra("extar_data");
        Toast toast = Toast.makeText(this,"小主，欢迎您来到成长的世界，不负韶华，不忘初心，何不输出动人的果实呢(●'◡'●) ||", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
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

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event)
    {
        if(web.canGoBack())
        {
            //Toast.makeText(WebActivity.this,"can go back",Toast.LENGTH_SHORT).show();
        }
        else
        {

            long time1=System.currentTimeMillis();
            mCalendar = Calendar.getInstance();
            mCalendar.setTimeInMillis(time1);
            int mHour1 = mCalendar.get(Calendar.HOUR);
            int mMinute1 = mCalendar.get(Calendar.MINUTE);
            int cost = mMinute1 + (mHour1-mHour) * 60 - mMinute;

            Toast lat = Toast.makeText(WebActivity.this,"主人大大(●'◡'●)，您学习了  "+String.valueOf(cost)+" 分钟",Toast.LENGTH_LONG);
            lat.setGravity(Gravity.CENTER,0,0);
            lat.show();
            //Toast.makeText(WebActivity.this,"can not go back",Toast.LENGTH_SHORT).show();
        }
        if((keyCode == KeyEvent.KEYCODE_BACK) && (web.canGoBack()))
        {
            web.goBack();
            return true;
        }
        finish();
        return super.onKeyDown(keyCode,event);
    }


}
