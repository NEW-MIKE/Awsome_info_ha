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
        TreeItem item_82_3 = new TreeItem();
        item_82_3.title = "     BFA 簡報";
        item_82_3.uri = "https://www.bfa.com.tw/";


        item_0_0.child.add(item_1_0);
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
        item_0_0.child.add(item_82_3);

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
        TreeItem item_2_73 = new TreeItem();
        item_2_73.title = "     猎手导航";
        item_2_73.uri = "http://www.lsdhss.com/";
        TreeItem item_2_74 = new TreeItem();
        item_2_74.title = "     短信16573973830";
        item_2_74.uri = "https://www.cnwml.com/free-sms-online/8616573973830.html";
        TreeItem item_2_75 = new TreeItem();
        item_2_75.title = "     邮箱";
        item_2_75.uri = "http://www.linshiyouxiang.net/";
        TreeItem item_2_76 = new TreeItem();
        item_2_76.title = "     FREE-STOCK-MUSIC";
        item_2_76.uri = "https://www.free-stock-music.com/";

        item_0_1.child.add(item_1_2);
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
        item_0_1.child.add(item_2_73);
        item_0_1.child.add(item_2_74);
        item_0_1.child.add(item_2_75);
        item_0_1.child.add(item_2_76);

        list.add(item_0_1);

        TreeItem item_1_3 = new TreeItem();
        item_1_3.title = "视野区";
        item_1_3.child = new ArrayList<>();
        TreeItem item_3_3 = new TreeItem();
        item_3_3.title = "      爱思想";
        item_3_3.uri = "http://www.aisixiang.com/";
        TreeItem item_3_4 = new TreeItem();
        item_3_4.title = "      github/awsome";
        item_3_4.uri = "https://github.com/search?q=awesome";
        TreeItem item_3_5 = new TreeItem();
        item_3_5.title = "      MEETUP";
        item_3_5.uri="https://www.meetup.com/";
        TreeItem item_3_50 = new TreeItem();
        item_3_50.title = "      artstation";
        item_3_50.uri="https://www.artstation.com/";
        TreeItem item_3_51 = new TreeItem();
        item_3_51.title = "      deviantart";
        item_3_51.uri="https://www.deviantart.com/";
        TreeItem item_3_52 = new TreeItem();
        item_3_52.title = "      FIND THE TOP DESIGNER";
        item_3_52.uri="https://dribbble.com/";
        TreeItem item_3_53 = new TreeItem();
        item_3_53.title = "      behance";
        item_3_53.uri="https://www.behance.net/";
        TreeItem item_3_54 = new TreeItem();
        item_3_54.title = "      设计家";
        item_3_54.uri="https://www.searchome.net/";
        TreeItem item_3_55 = new TreeItem();
        item_3_55.title = "      zbrushcentral";
        item_3_55.uri="https://www.zbrushcentral.com/";
        TreeItem item_3_56 = new TreeItem();
        item_3_56.title = "      HACKMD";
        item_3_56.uri="https://hackmd.io/";
        TreeItem item_3_57 = new TreeItem();
        item_3_57.title = "      橙皮书";
        item_3_57.uri="https://orange.xyz/";
        TreeItem item_3_58 = new TreeItem();
        item_3_58.title = "      虚拟币";
        item_3_58.uri="https://makerdao.com/zh-CN/";
        TreeItem item_3_59 = new TreeItem();
        item_3_59.title = "      电脑玩物";
        item_3_59.uri="https://www.playpcesor.com/";
        TreeItem item_3_60 = new TreeItem();
        item_3_60.title = "      链闻";
        item_3_60.uri="https://www.chainnews.com/";
        TreeItem item_3_61 = new TreeItem();
        item_3_61.title = "      medium";
        item_3_61.uri="https://medium.com/";
        TreeItem item_3_62 = new TreeItem();
        item_3_62.title = "      ethresear";
        item_3_62.uri="https://ethresear.ch/";
        item_1_3.child.add(item_3_3);
        item_1_3.child.add(item_3_4);
        item_1_3.child.add(item_3_5);
        item_1_3.child.add(item_3_50);
        item_1_3.child.add(item_3_51);
        item_1_3.child.add(item_3_52);
        item_1_3.child.add(item_3_53);
        item_1_3.child.add(item_3_54);
        item_1_3.child.add(item_3_55);
        item_1_3.child.add(item_3_56);
        item_1_3.child.add(item_3_57);
        item_1_3.child.add(item_3_58);
        item_1_3.child.add(item_3_59);
        item_1_3.child.add(item_3_60);
        item_1_3.child.add(item_3_61);
        item_1_3.child.add(item_3_62);
        list.add(item_1_3);



        TreeItem item_4_0 = new TreeItem();
        item_4_0.title = "提升专区";
        item_4_0.child = new ArrayList<>();

        TreeItem item_4_01 = new TreeItem();
        item_4_01.title = "     考试时间";
        item_4_01.uri="https://www.ppkao.com/kaoshishijian/";
        TreeItem item_4_02 = new TreeItem();
        item_4_02.title = "     销售话术";
        item_4_02.uri="http://xiaoshou.mlbuy.com/";
        TreeItem item_4_03 = new TreeItem();
        item_4_03.title = "     英语听力";
        item_4_03.uri="https://www.ieltsbuddy.com/";
        TreeItem item_4_04 = new TreeItem();
        item_4_04.title = "     usingenglish";
        item_4_04.uri="https://www.usingenglish.com/";
        TreeItem item_4_05 = new TreeItem();
        item_4_05.title = "     english stack";
        item_4_05.uri="https://english.stackexchange.com/";
        item_4_0.child.add(item_4_01);
        item_4_0.child.add(item_4_02);
        item_4_0.child.add(item_4_03);
        item_4_0.child.add(item_4_04);
        item_4_0.child.add(item_4_05);

        list.add(item_4_0);


        TreeItem item_5_0 = new TreeItem();
        item_5_0.title = "技术专区";
        item_5_0.child = new ArrayList<>();

        TreeItem item_5_01 = new TreeItem();
        item_5_01.title = "     安全客";
        item_5_01.uri="https://www.anquanke.com/";
        TreeItem item_5_02 = new TreeItem();
        item_5_02.title = "     码农周刊";
        item_5_02.uri="https://github.com/toutiaoio/weekly.manong.io";
        TreeItem item_5_03 = new TreeItem();
        item_5_03.title = "     IT github";
        item_5_03.uri="https://github.com/ruanyf/free-books";
        TreeItem item_5_04 = new TreeItem();
        item_5_04.title = "     微学课堂";
        item_5_04.uri="http://www.waveshare.net/study/portal.php?mod=list&catid=29";
        TreeItem item_5_05 = new TreeItem();
        item_5_05.title = "     树莓派";
        item_5_05.uri="https://www.arduino.cn/forum-86-1.html";
        TreeItem item_5_06 = new TreeItem();
        item_5_06.title = "     wonderkun";
        item_5_06.uri="https://wonderkun.cc/";
        TreeItem item_5_07 = new TreeItem();
        item_5_07.title = "     游戏化编程";
        item_5_07.uri="https://yukaichou.com/";
        TreeItem item_5_08 = new TreeItem();
        item_5_08.title = "     游戏化编程";
        item_5_08.uri="https://gamicon.us/";
        item_5_0.child.add(item_5_01);
        item_5_0.child.add(item_5_02);
        item_5_0.child.add(item_5_03);
        item_5_0.child.add(item_5_04);
        item_5_0.child.add(item_5_05);
        item_5_0.child.add(item_5_06);
        item_5_0.child.add(item_5_07);
        item_5_0.child.add(item_5_08);

        list.add(item_5_0);


        TreeItem item_6_0 = new TreeItem();
        item_6_0.title = "课程专区";
        item_6_0.child = new ArrayList<>();

        TreeItem item_6_01 = new TreeItem();
        item_6_01.title = "     北京大学公开课";
        item_6_01.uri="http://cetl.pku.edu.cn/peking/opencourse/view3/oc_index.jsp";
        TreeItem item_6_02 = new TreeItem();
        item_6_02.title = "     学堂在线";
        item_6_02.uri="https://next.xuetangx.com/";
        TreeItem item_6_03 = new TreeItem();
        item_6_03.title = "     classcentral";
        item_6_03.uri="https://www.classcentral.com/";
        TreeItem item_6_04 = new TreeItem();
        item_6_04.title = "     麻省理工公开课";
        item_6_04.uri="https://ocw.mit.edu/index.htm";
        TreeItem item_6_05 = new TreeItem();
        item_6_05.title = "     哈佛大学公开课";
        item_6_05.uri="https://online-learning.harvard.edu/";
        TreeItem item_6_06 = new TreeItem();
        item_6_06.title = "     斯坦福大学公开课";
        item_6_06.uri="https://online.stanford.edu/";
        TreeItem item_6_07 = new TreeItem();
        item_6_07.title = "     耶鲁大学公开课";
        item_6_07.uri="https://oyc.yale.edu/";
        TreeItem item_6_08 = new TreeItem();
        item_6_08.title = "     公开大学课程";
        item_6_08.uri="http://www.open.ac.uk/";
        TreeItem item_6_09 = new TreeItem();
        item_6_09.title = "     classcentral";
        item_6_09.uri="https://www.classcentral.com/";
        TreeItem item_6_10 = new TreeItem();
        item_6_10.title = "     优达学城";
        item_6_10.uri="https://www.udacity.com/";
        TreeItem item_6_11 = new TreeItem();
        item_6_11.title = "     哈佛和MIT联合创办的MOOC网站";
        item_6_11.uri="https://www.edx.org/";
        TreeItem item_6_12 = new TreeItem();
        item_6_12.title = "     爱课程";
        item_6_12.uri="http://www.icourses.cn/home/";
        TreeItem item_6_13 = new TreeItem();
        item_6_13.title = "     网易云课堂";
        item_6_13.uri="https://study.163.com/";
        TreeItem item_6_14 = new TreeItem();
        item_6_14.title = "     可汗学院";
        item_6_14.uri="https://www.khanacademy.org/";


        TreeItem item_6_15 = new TreeItem();
        item_6_15.title = "     doyoudo国内的";
        item_6_15.uri="https://www.doyoudo.com/resources";
        TreeItem item_6_16 = new TreeItem();
        item_6_16.title = "     openculture";
        item_6_16.uri="http://www.openculture.com/";
        TreeItem item_6_17 = new TreeItem();
        item_6_17.title = "     stepik";
        item_6_17.uri="https://stepik.org/catalog?language=en";



        item_6_0.child.add(item_6_01);
        item_6_0.child.add(item_6_02);
        item_6_0.child.add(item_6_03);
        item_6_0.child.add(item_6_04);
        item_6_0.child.add(item_6_05);
        item_6_0.child.add(item_6_06);
        item_6_0.child.add(item_6_07);
        item_6_0.child.add(item_6_08);
        item_6_0.child.add(item_6_09);
        item_6_0.child.add(item_6_10);
        item_6_0.child.add(item_6_11);
        item_6_0.child.add(item_6_12);
        item_6_0.child.add(item_6_13);
        item_6_0.child.add(item_6_14);
        item_6_0.child.add(item_6_15);
        item_6_0.child.add(item_6_16);
        item_6_0.child.add(item_6_17);
        list.add(item_6_0);


        TreeItem item_7_0 = new TreeItem();
        item_7_0.title = "收集狂人";
        item_7_0.child = new ArrayList<>();

        TreeItem item_7_01 = new TreeItem();
        item_7_01.title = "     有趣的网站";
        item_7_01.uri="http://123.kfd.me/";
        TreeItem item_7_02 = new TreeItem();
        item_7_02.title = "     三顿导航";
        item_7_02.uri="https://sandunppt.com/";
        TreeItem item_7_03 = new TreeItem();
        item_7_03.title = "     国外导航";
        item_7_03.uri="https://www.refseek.com/directory/health_medical.html";
        TreeItem item_7_04 = new TreeItem();
        item_7_04.title = "     每天一小时纪录片";
        item_7_04.uri="https://www.onehourlife.net/";
        TreeItem item_7_05 = new TreeItem();
        item_7_05.title = "     有趣的网站";
        item_7_05.uri="http://123.kfd.me/";
        TreeItem item_7_06 = new TreeItem();
        item_7_06.title = "     优设";
        item_7_06.uri="https://www.uisdc.com/";


        item_7_0.child.add(item_7_01);
        item_7_0.child.add(item_7_02);
        item_7_0.child.add(item_7_03);
        item_7_0.child.add(item_7_04);
        item_7_0.child.add(item_7_05);
        item_7_0.child.add(item_7_06);
        list.add(item_7_0);


        TreeItem item_8_0 = new TreeItem();
        item_8_0.title = "比赛专区";
        item_8_0.child = new ArrayList<>();

        TreeItem item_8_01 = new TreeItem();
        item_8_01.title = "     USACO";
        item_8_01.uri="http://www.usaco.org/";
        TreeItem item_8_02 = new TreeItem();
        item_8_02.title = "     euler";
        item_8_02.uri="https://projecteuler.net/archives";
        TreeItem item_8_03 = new TreeItem();
        item_8_03.title = "     atcoder";
        item_8_03.uri="https://atcoder.jp/";
        TreeItem item_8_04 = new TreeItem();
        item_8_04.title = "     rosa";
        item_8_04.uri="http://rosalind.info/";
        TreeItem item_8_05 = new TreeItem();
        item_8_05.title = "     best";
        item_8_05.uri="https://best.eu.org/index.jsp";

        TreeItem item_8_06 = new TreeItem();
        item_8_06.title = "     codinggame";
        item_8_06.uri="https://www.codingame.com/start";
        TreeItem item_8_07 = new TreeItem();
        item_8_07.title = "     力扣";
        item_8_07.uri="https://leetcode-cn.com/problemset/all/";
        TreeItem item_8_08 = new TreeItem();
        item_8_08.title = "     菜鸟教程";
        item_8_08.uri="https://www.runoob.com/";
        TreeItem item_8_09 = new TreeItem();
        item_8_09.title = "     赛码";
        item_8_09.uri="https://exercise.acmcoder.com/online/online_judge";
        TreeItem item_8_10 = new TreeItem();
        item_8_10.title = "     牛客网";
        item_8_10.uri="https://www.nowcoder.com/activity/oj";

        TreeItem item_8_11 = new TreeItem();
        item_8_11.title = "     w3cschool";
        item_8_11.uri="https://www.w3cschool.cn/";
        TreeItem item_8_12 = new TreeItem();
        item_8_12.title = "     HACKER";
        item_8_12.uri="https://code.hackerearth.com/zh/";
        TreeItem item_8_13 = new TreeItem();
        item_8_13.title = "     CODERBYTE";
        item_8_13.uri="https://www.coderbyte.com/";
        TreeItem item_8_14 = new TreeItem();
        item_8_14.title = "     hackerrank";
        item_8_14.uri="https://www.hackerrank.com/";
        TreeItem item_8_15 = new TreeItem();
        item_8_15.title = "     lintcode";
        item_8_15.uri="https://www.lintcode.com/";
        TreeItem item_8_16 = new TreeItem();
        item_8_16.title = "     repl";
        item_8_16.uri="https://repl.it/";


        item_8_0.child.add(item_8_01);
        item_8_0.child.add(item_8_02);
        item_8_0.child.add(item_8_03);
        item_8_0.child.add(item_8_04);
        item_8_0.child.add(item_8_05);
        item_8_0.child.add(item_8_06);
        item_8_0.child.add(item_8_07);
        item_8_0.child.add(item_8_08);
        item_8_0.child.add(item_8_09);
        item_8_0.child.add(item_8_10);
        item_8_0.child.add(item_8_11);
        item_8_0.child.add(item_8_12);
        item_8_0.child.add(item_8_13);
        item_8_0.child.add(item_8_14);
        item_8_0.child.add(item_8_15);
        item_8_0.child.add(item_8_16);
        list.add(item_8_0);


        TreeItem item_9_0 = new TreeItem();
        item_9_0.title = "调整空间";
        item_9_0.child = new ArrayList<>();

        TreeItem item_9_01 = new TreeItem();
        item_9_01.title = "     personalexcellence";
        item_9_01.uri="https://personalexcellence.co/";
        TreeItem item_9_02 = new TreeItem();
        item_9_02.title = "     keepinspiring";
        item_9_02.uri="https://www.keepinspiring.me/";
        TreeItem item_9_03 = new TreeItem();
        item_9_03.title = "     chopra";
        item_9_03.uri="https://chopra.com/";
        TreeItem item_9_04 = new TreeItem();
        item_9_04.title = "     nytimes";
        item_9_04.uri="https://www.nytimes.com/";
        TreeItem item_9_05 = new TreeItem();
        item_9_05.title = "     cnbc";
        item_9_05.uri="https://www.cnbc.com/2019/07/03/advice-from-90-year-olds-how-to-live-a-long-happy-and-regret-free-life.html";
        TreeItem item_9_06 = new TreeItem();
        item_9_06.title = "     lifehack";
        item_9_06.uri="https://www.lifehack.org/articles/lifestyle";


        TreeItem item_9_07 = new TreeItem();
        item_9_07.title = "     活到100岁";
        item_9_07.uri="https://www.worth.com/how-to-live-past-100/";
        TreeItem item_9_08 = new TreeItem();
        item_9_08.title = "     如何才能开心";
        item_9_08.uri="http://www.ox.ac.uk/research/research-in-conversation/how-live-happy-life";
        TreeItem item_9_09 = new TreeItem();
        item_9_09.title = "     活在当下";
        item_9_09.uri="https://www.becomingminimalist.com/10-tips-to-start-living-in-the-present/";
        TreeItem item_9_10 = new TreeItem();
        item_9_10.title = "     明天，最后一天";
        item_9_10.uri="https://www.adaymag.com/2018/09/11/learn-how-to-live-through-death.html";
        TreeItem item_9_11 = new TreeItem();
        item_9_11.title = "     过得更好一点";
        item_9_11.uri="https://vickichi.pixnet.net/blog/post/21579063-%E5%A6%82%E4%BD%95%E8%AE%93%E6%88%91%E5%80%91%E7%9A%84%E7%94%9F%E6%B4%BB%E9%81%8E%E5%BE%97%E6%9B%B4%E5%A5%BD%E4%B8%80%E9%BB%9E";
        TreeItem item_9_12 = new TreeItem();
        item_9_12.title = "     过你想要的生活";
        item_9_12.uri="https://www.managertoday.com.tw/articles/view/50783";
        TreeItem item_9_13 = new TreeItem();
        item_9_13.title = "     搜宝名言 自我提升的句子";
        item_9_13.uri="https://www.sb580.com/juzi/10280.html";



        item_9_0.child.add(item_9_01);
        item_9_0.child.add(item_9_02);
        item_9_0.child.add(item_9_03);
        item_9_0.child.add(item_9_04);
        item_9_0.child.add(item_9_05);
        item_9_0.child.add(item_9_06);

        item_9_0.child.add(item_9_07);
        item_9_0.child.add(item_9_08);
        item_9_0.child.add(item_9_09);
        item_9_0.child.add(item_9_10);
        item_9_0.child.add(item_9_11);
        item_9_0.child.add(item_9_12);
        item_9_0.child.add(item_9_13);
        list.add(item_9_0);

        TreeItem item_10_0 = new TreeItem();
        item_10_0.title = "职场打怪兽";
        item_10_0.child = new ArrayList<>();

        TreeItem item_10_1 = new TreeItem();
        item_10_1.title = "     如何利用业余时间提升";
        item_10_1.uri="https://socialbeta.com/t/how-professional-people-use-their-spare-time-to-improve-themselves";
        TreeItem item_10_2 = new TreeItem();
        item_10_2.title = "     aerotek";
        item_10_2.uri="https://www.aerotek.com/zh-cn/insights/9-tips-for-using-technology-the-right-way-at-work";
        TreeItem item_10_3 = new TreeItem();
        item_10_3.title = "     morganmckinley";
        item_10_3.uri="https://www.morganmckinley.com.cn/";
        TreeItem item_10_4 = new TreeItem();
        item_10_4.title = "     right";
        item_10_4.uri="https://www.right.com/";
        TreeItem item_10_5 = new TreeItem();
        item_10_5.title = "     提升工作能力的5大秘訣";
        item_10_5.uri="https://www.jessicahk.com/articles/ti-sheng-gong-zuo-neng-li-de-5da-mi-jue";
        TreeItem item_10_6 = new TreeItem();
        item_10_6.title = "     财富中文网   提升在工作中的信心";
        item_10_6.uri="http://app.fortunechina.com/mobile/article/264/content_264619.html";
        TreeItem item_10_7 = new TreeItem();
        item_10_7.title = "     华尔街日报 待办清单这样列才有效";
        item_10_7.uri="https://www.storm.mg/lifestyle/414957";
        TreeItem item_10_8 = new TreeItem();
        item_10_8.title = "     easy work 为什么工作效率低下？";
        item_10_8.uri="https://www.easywork.asia/blog/%E4%B8%BA%E4%BB%80%E4%B9%88%E5%B7%A5%E4%BD%9C%E6%95%88%E7%8E%87%E4%BD%8E%E4%B8%8B%EF%BC%9F%E5%9B%A0%E4%B8%BA%E4%BD%A0%E4%B8%8D%E4%BC%9A%E8%BF%993%E4%B8%AA%E6%96%B9%E6%B3%95";
        TreeItem item_10_9 = new TreeItem();
        item_10_9.title = "     褪墨 提高工作效率的十条好习惯";
        item_10_1.uri="https://www.mifengtd.cn/articles/10-timeless-work-habits-to-boost-productivity.html";
        TreeItem item_10_10 = new TreeItem();
        item_10_10.title = "     michaelpage 如何实现工作目标";
        item_10_10.uri="https://www.michaelpage.com.cn/advice/career-advice/productivity-and-performance/how-prioritise-tasks-and-make-effective-do-list";
        TreeItem item_10_11 = new TreeItem();
        item_10_11.title = "     女人迷 工作效率";
        item_10_11.uri="https://womany.net/read/article/16790";
        TreeItem item_10_12 = new TreeItem();
        item_10_12.title = "     wikihow 如何更有效工作";
        item_10_12.uri="https://zh.wikihow.com/%E6%9B%B4%E6%9C%89%E6%95%88%E7%8E%87%E5%9C%B0%E5%B7%A5%E4%BD%9C";
        TreeItem item_10_13 = new TreeItem();
        item_10_13.title = "     阿里巴巴 如何提高员工效率";
        item_10_13.uri="https://activities.alibaba.com/alibaba/wmqt/wmstq/qiyewenhua/wenzhang/23.php?tracelog=wmstq_shouye";
        TreeItem item_10_14 = new TreeItem();
        item_10_14.title = "     bbc 减少工作时间完成更多任务";
        item_10_14.uri="https://www.bbc.com/ukchina/simp/vert-cap-40521192";
        TreeItem item_10_15 = new TreeItem();
        item_10_15.title = "     壹伴 如何在职场中提升自己，怎样提高自己的工作价值?";
        item_10_15.uri="https://yiban.io/blog/2446";
        TreeItem item_10_16 = new TreeItem();
        item_10_16.title = "     职业发展网站";
        item_10_16.uri="http://www.zhishangwang.com/test/1833.html";
        TreeItem item_10_17 = new TreeItem();
        item_10_17.title = "     少数派  他们这样提升效率";
        item_10_17.uri="https://sspai.com/post/38529";
        TreeItem item_10_18 = new TreeItem();
        item_10_18.title = "     盖雅工场 小雅教你这6招，和效率低说再见 ";
        item_10_18.uri="https://www.gaiaworks.cn/no-longer-low-efficiency.html";
        TreeItem item_10_19 = new TreeItem();
        item_10_19.title = "     展望，未来需要什么样的员工";
        item_10_19.uri="https://www.accenture.com/_acnmedia/pdf-95/accenture-what-kind-employees-needed-future.pdf";
        TreeItem item_10_20 = new TreeItem();
        item_10_20.title = "     姑婆圈 提升职场写作力";
        item_10_20.uri="http://www.gupowang.com/article/view/6350";
        TreeItem item_10_21 = new TreeItem();
        item_10_21.title = "     accenture";
        item_10_21.uri="https://www.accenture.com/cn-zh";
        TreeItem item_10_22 = new TreeItem();
        item_10_22.title = "     人才发展协会，提升专业能力";
        item_10_22.uri="https://china.td.org/insights/101-50";
        TreeItem item_10_23 = new TreeItem();
        item_10_23.title = "     什么值得买  我不是懒只是效率高";
        item_10_23.uri="https://post.smzdm.com/p/ag82z78m/";
        TreeItem item_10_24 = new TreeItem();
        item_10_24.title = "     itread01 成長的思考：如何在工作中保持高速的自我成長";
        item_10_24.uri="https://www.itread01.com/content/1544828597.html";
        TreeItem item_10_25 = new TreeItem();
        item_10_25.title = "     thenewslens 工作中耍個廢，反讓效率提升！？";
        item_10_25.uri="https://www.thenewslens.com/article/28744";
        TreeItem item_10_26 = new TreeItem();
        item_10_26.title = "     近周刊，建立工作規律，就是效率管理的最好策略";
        item_10_26.uri="https://www.businesstoday.com.tw/article/category/80408/post/201712220026/%E5%BB%BA%E7%AB%8B%E5%B7%A5%E4%BD%9C%E8%A6%8F%E5%BE%8B%EF%BC%8C%E5%B0%B1%E6%98%AF%E6%95%88%E7%8E%87%E7%AE%A1%E7%90%86%E7%9A%84%E6%9C%80%E5%A5%BD%E7%AD%96%E7%95%A5";
        TreeItem item_10_27 = new TreeItem();
        item_10_27.title = "     知识家  想提升工作效率？記得這5個撇步";
        item_10_27.uri="https://www.knowledger.info/2017/11/23/5-things-you-can-do-in-just-1-day-to-work-smarter/";
        TreeItem item_10_28 = new TreeItem();
        item_10_28.title = "     17個增加工作效率的訣竅";
        item_10_28.uri="https://www.cw.com.tw/article/article.action?id=5078626";
        TreeItem item_10_29 = new TreeItem();
        item_10_29.title = "     cheers 與其管理時間，不如管理壓力";
        item_10_29.uri="https://www.cheers.com.tw/article/article.action?id=5073363";
        TreeItem item_10_30 = new TreeItem();
        item_10_30.title = "     部格格 提升工作效率：是沒有辦法還是沒有方法？";
        item_10_30.uri="https://www.pmtone.com/how-to-improve-your-work-efficiency/";




        item_10_0.child.add(item_10_1);
        item_10_0.child.add(item_10_2);
        item_10_0.child.add(item_10_3);
        item_10_0.child.add(item_10_4);
        item_10_0.child.add(item_10_5);
        item_10_0.child.add(item_10_6);
        item_10_0.child.add(item_10_7);
        item_10_0.child.add(item_10_8);
        item_10_0.child.add(item_10_9);
        item_10_0.child.add(item_10_10);
        item_10_0.child.add(item_10_11);
        item_10_0.child.add(item_10_12);
        item_10_0.child.add(item_10_13);
        item_10_0.child.add(item_10_14);
        item_10_0.child.add(item_10_15);
        item_10_0.child.add(item_10_16);
        item_10_0.child.add(item_10_17);
        item_10_0.child.add(item_10_18);
        item_10_0.child.add(item_10_19);
        item_10_0.child.add(item_10_20);
        item_10_0.child.add(item_10_21);
        item_10_0.child.add(item_10_22);
        item_10_0.child.add(item_10_23);
        item_10_0.child.add(item_10_24);
        item_10_0.child.add(item_10_25);
        item_10_0.child.add(item_10_26);
        item_10_0.child.add(item_10_27);
        item_10_0.child.add(item_10_28);
        item_10_0.child.add(item_10_29);
        item_10_0.child.add(item_10_30);
        list.add(item_10_0);

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
