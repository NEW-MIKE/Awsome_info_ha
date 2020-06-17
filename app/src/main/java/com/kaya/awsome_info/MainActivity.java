package com.kaya.awsome_info;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kaya.awsome_info.tree.TreeAdapter;
import com.kaya.awsome_info.tree.TreeItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KaelLi on 2018/11/22.
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTree = findViewById(R.id.rvTree);
        TreeAdapter treeAdapter = new TreeAdapter(this, initList());
        rvTree.setLayoutManager(new LinearLayoutManager(this));
        rvTree.setAdapter(treeAdapter);
    }


    private List<TreeItem> initList() {
        List<TreeItem> list = new ArrayList<>();

        TreeItem item_0_0 = new TreeItem();
        item_0_0.title = "HR";
        item_0_0.child = new ArrayList<>();

        TreeItem item_1_0 = new TreeItem();

        item_1_0.title = "三茅HR";
        item_1_0.uri = "https://www.hrloo.com/rz";
       // item_1_0.child = new ArrayList<>();
        TreeItem item_2_0 = new TreeItem();
        item_2_0.title = "HR沙龙";
        item_2_0.uri = "http://www.hrsalonchina.com";
        TreeItem item_2_1 = new TreeItem();
        item_2_1.title = "HR GO";
        item_2_1.uri = "http://www.hrgo.cn/article/index";
        TreeItem item_2_2 = new TreeItem();
        item_2_2.title = "商业新知";
        item_2_2.uri = "https://acc.shangyexinzhi.com";
        TreeItem item_2_3 = new TreeItem();
        item_2_3.title = "36KR";
        item_2_3.uri = "https://36kr.com";
        TreeItem item_02_3 = new TreeItem();
        item_02_3.title = "HROOT";
        item_02_3.uri = "http://mobile.hroot.com";
        TreeItem item_12_3 = new TreeItem();
        item_12_3.title = "中国人力资源网";
        item_12_3.uri = "http://www.hr.com.cn";
        TreeItem item_22_3 = new TreeItem();
        item_22_3.title = "中国人力资源开发网";
        item_22_3.uri = "http://m.chinahrd.net";
        TreeItem item_32_3 = new TreeItem();
        item_32_3.title = "MOOC中国";
        item_32_3.uri = "https://www.mooc.cn";
        TreeItem item_42_3 = new TreeItem();
        item_42_3.title = "中国大学MOOC";
        item_42_3.uri = "https://www.icourse163.org/course/1201ZNUFE022-1002536016?utm_campaign=share&utm_medium=androidShare&utm_source=#/info";
        TreeItem item_52_3 = new TreeItem();
        item_52_3.title = "世界经理人";
        item_52_3.uri = "http://m.ceconlinebbs.com";
        TreeItem item_62_3 = new TreeItem();
        item_62_3.title = "人人都是产品经理";
        item_62_3.uri = "http://www.woshipm.com";


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
        item_0_0.child.add(item_1_0);

        list.add(item_0_0);


        TreeItem item_0_1 = new TreeItem();
        item_0_1.title = "技术管理";
        item_0_1.child = new ArrayList<>();

        TreeItem item_1_2 = new TreeItem();
        item_1_2.uri = "https://www.wanandroid.com/";
        item_1_2.title = "玩安卓";
       // item_1_2.child = new ArrayList<>();
        TreeItem item_2_5 = new TreeItem();
        item_2_5.title = "IT 之家";
        item_2_5.uri = "https://www.ithome.com";

        TreeItem item_2_6 = new TreeItem();
        item_2_6.title = "tool";
        item_2_6.uri = "https://tool.lu/nav/";
        TreeItem item_2_60 = new TreeItem();
        item_2_60.title = "好奇心日咳咳咳报";
        item_2_60.uri = "http://www.qdaily.com";
        TreeItem item_2_61 = new TreeItem();
        item_2_61.title = "某柠檬";
        item_2_61.uri = "https://www.moulem.com";
        TreeItem item_2_62 = new TreeItem();
        item_2_62.title = "gitnavi";
        item_2_62.uri = "http://www.gitnavi.com";
        TreeItem item_2_63 = new TreeItem();
        item_2_63.title = "gitnavi——hanzhy";
        item_2_63.uri = "http://www.gitnavi.com/u/hanzhy";
        TreeItem item_2_64 = new TreeItem();
        item_2_64.title = "gitnavi-andi";
        item_2_64.uri = "http://www.gitnavi.com/u/AndyDufresne";
        TreeItem item_2_65 = new TreeItem();
        item_2_65.title = "download";
        item_2_65.uri = "http://www.github.com/NEW-MIKE/";
        TreeItem item_2_7 = new TreeItem();
        item_2_7.title = "OSCHINA";
        item_2_7.uri = "https://www.oschina.net";
        item_0_1.child.add(item_2_5);
        item_0_1.child.add(item_2_6);
        item_0_1.child.add(item_2_60);
        item_0_1.child.add(item_2_61);
        item_0_1.child.add(item_2_62);
        item_0_1.child.add(item_2_63);
        item_0_1.child.add(item_2_64);
        item_0_1.child.add(item_2_65);
        item_0_1.child.add(item_2_7);
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
}
