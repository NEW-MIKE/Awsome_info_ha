package com.kaya.awsome_info;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.kaya.awsome_info.service.SongService;
import com.kaya.awsome_info.service.TwoSongService;
import com.kaya.awsome_info.tree.TreeAdapter;
import com.kaya.awsome_info.tree.TreeItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTree;
    private DrawerLayout mDrawerLayout;
    private static int flag;
    private static int song;
    Intent startIntent ;
    Intent startIntentTwo ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        flag =0;
        song=0;
        startIntent = new Intent(MainActivity.this, SongService.class);
        startIntentTwo = new  Intent(MainActivity.this, TwoSongService.class);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        rvTree = findViewById(R.id.rvTree);
        TreeAdapter treeAdapter = new TreeAdapter(this, initList());
        rvTree.setLayoutManager(new LinearLayoutManager(this));
        rvTree.setAdapter(treeAdapter);


    /*    if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{ Manifest.permission. WRITE_EXTERNAL_STORAGE }, 1);
        } else {

        }*/
       // startIntent = new Intent(MainActivity.this, SongService.class);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fab1.getVisibility() == View.VISIBLE)
                {
                    fab1.setVisibility(View.INVISIBLE);
                }
                else
                {
                   // fab1.setVisibility(View.VISIBLE);
                }
                if(flag == 0) {
                    if(song==0)
                    {
                        startService(startIntent); // 启动服务
                        song =1;
                    }
                    else
                    {
                        startService(startIntentTwo);
                        song =0;
                    }
                    flag = 1;
                }
                else
                {
                    flag =0;
                    stopService(startIntent);
                    stopService(startIntentTwo);
                }

            /*    Snackbar.make(view, "Data deleted", Snackbar.LENGTH_SHORT)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "Data restored", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();*/
            }
        });
    }


    private List<TreeItem> initList() {
        List<TreeItem> list = new ArrayList<>();

        TreeItem item_0_0 = new TreeItem();
        item_0_0.title = "HR";
        item_0_0.child = new ArrayList<>();

        TreeItem item_1_0 = new TreeItem();

        item_1_0.title = "      三茅HR";
        item_1_0.uri = "https://www.hrloo.com/rz";
       // item_1_0.child = new ArrayList<>();
        TreeItem item_2_0 = new TreeItem();
        item_2_0.title = "      HR沙龙";
        item_2_0.uri = "http://www.hrsalonchina.com";
        TreeItem item_2_1 = new TreeItem();
        item_2_1.title = "      HR GO";
        item_2_1.uri = "http://www.hrgo.cn/article/index";
        TreeItem item_2_2 = new TreeItem();
        item_2_2.title = "      商业新知";
        item_2_2.uri = "https://acc.shangyexinzhi.com";
        TreeItem item_2_3 = new TreeItem();
        item_2_3.title = "      36KR";
        item_2_3.uri = "https://36kr.com";
        TreeItem item_02_3 = new TreeItem();
        item_02_3.title = "     HROOT";
        item_02_3.uri = "http://mobile.hroot.com";
        TreeItem item_12_3 = new TreeItem();
        item_12_3.title = "     中国人力资源网";
        item_12_3.uri = "http://www.hr.com.cn";
        TreeItem item_22_3 = new TreeItem();
        item_22_3.title = "     中国人力资源开发网";
        item_22_3.uri = "http://m.chinahrd.net";
        TreeItem item_32_3 = new TreeItem();
        item_32_3.title = "     MOOC中国";
        item_32_3.uri = "https://www.mooc.cn";
        TreeItem item_42_3 = new TreeItem();
        item_42_3.title = "     中国大学MOOC";
        item_42_3.uri = "https://www.icourse163.org/course/1201ZNUFE022-1002536016?utm_campaign=share&utm_medium=androidShare&utm_source=#/info";
        TreeItem item_52_3 = new TreeItem();
        item_52_3.title = "     世界经理人";
        item_52_3.uri = "http://m.ceconlinebbs.com";
        TreeItem item_62_3 = new TreeItem();
        item_62_3.title = "     人人都是产品经理";
        item_62_3.uri = "http://www.woshipm.com";
        TreeItem item_72_3 = new TreeItem();
        item_72_3.title = "     产品①佰";
        item_72_3.uri = "http://www.chanpin100.com";


        item_0_0.child.add(item_2_0);
        item_0_0.child.add(item_2_1);
        item_0_0.child.add(item_2_2);
        item_0_0.child.add(item_2_3);
        item_0_0.child.add(item_02_3);
        item_0_0.child.add(item_12_3);
        item_0_0.child.add(item_22_3);
        item_0_0.child.add(item_32_3);
        item_0_0.child.add(item_42_3);
        item_0_0.child.add(item_52_3);
        item_0_0.child.add(item_62_3);
        item_0_0.child.add(item_72_3);
        item_0_0.child.add(item_1_0);

        list.add(item_0_0);


        TreeItem item_0_1 = new TreeItem();
        item_0_1.title = "技术管理";
        item_0_1.child = new ArrayList<>();

        TreeItem item_1_2 = new TreeItem();
        item_1_2.uri = "https://www.wanandroid.com/";
        item_1_2.title = "      玩安卓";
       // item_1_2.child = new ArrayList<>();
        TreeItem item_2_5 = new TreeItem();
        item_2_5.title = "      IT 之家";
        item_2_5.uri = "https://www.ithome.com";

        TreeItem item_2_6 = new TreeItem();
        item_2_6.title = "      tool";
        item_2_6.uri = "https://tool.lu/nav/";
        TreeItem item_2_60 = new TreeItem();
        item_2_60.title = "      好奇心日咳咳咳报";
        item_2_60.uri = "http://www.qdaily.com";
        TreeItem item_2_61 = new TreeItem();
        item_2_61.title = "      某柠檬";
        item_2_61.uri = "https://www.moulem.com";
        TreeItem item_2_62 = new TreeItem();
        item_2_62.title = "     gitnavi";
        item_2_62.uri = "http://www.gitnavi.com";
        TreeItem item_2_63 = new TreeItem();
        item_2_63.title = "     gitnavi——hanzhy";
        item_2_63.uri = "http://www.gitnavi.com/u/hanzhy";
        TreeItem item_2_64 = new TreeItem();
        item_2_64.title = "     gitnavi-andi";
        item_2_64.uri = "http://www.gitnavi.com/u/AndyDufresne";
        TreeItem item_2_65 = new TreeItem();
        item_2_65.title = "     download";
        item_2_65.uri = "http://www.github.com/NEW-MIKE/";
        TreeItem item_2_7 = new TreeItem();
        item_2_7.title = "      OSCHINA";
        item_2_7.uri = "https://www.oschina.net";
        TreeItem item_2_70 = new TreeItem();
        item_2_70.title = "     任意门";
        item_2_70.uri = "https://gate.ofo.moe/";
        TreeItem item_2_71 = new TreeItem();
        item_2_71.title = "     rainymood";
        item_2_71.uri = "https://rainymood.com/";
        TreeItem item_2_72 = new TreeItem();
        item_2_72.title = "     musictool";
        item_2_72.uri = "http://www.musictool.top/";
        item_0_1.child.add(item_2_5);
        item_0_1.child.add(item_2_6);
        item_0_1.child.add(item_2_60);
        item_0_1.child.add(item_2_61);
        item_0_1.child.add(item_2_62);
        item_0_1.child.add(item_2_63);
        item_0_1.child.add(item_2_64);
        item_0_1.child.add(item_2_65);
        item_0_1.child.add(item_2_7);
        item_0_1.child.add(item_2_70);
        item_0_1.child.add(item_2_71);
        item_0_1.child.add(item_2_72);
        item_0_1.child.add(item_1_2);

        TreeItem item_1_3 = new TreeItem();
        item_1_3.title = "公众号";
        item_1_3.child = new ArrayList<>();
        TreeItem item_2_8 = new TreeItem();
        item_2_8.title = "第2级，第8个";
        TreeItem item_2_9 = new TreeItem();
        item_2_9.title = "第2级，第9个";
       // item_2_8.child = new ArrayList<>();
        TreeItem item_3_3 = new TreeItem();
        item_3_3.title = "第3级，第3个";
        TreeItem item_3_4 = new TreeItem();
        item_3_4.title = "第3级，第4个";
        TreeItem item_3_5 = new TreeItem();
        item_3_5.title = "第3级，第5个";
        item_1_3.child.add(item_3_3);
        item_1_3.child.add(item_3_4);
        item_1_3.child.add(item_3_5);
        item_1_3.child.add(item_2_8);
        item_1_3.child.add(item_2_9);
        item_0_1.child.add(item_1_3);
        list.add(item_0_1);

        return list;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }
}
