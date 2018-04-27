package com.example.luyin.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {
    /*Intent intent0 = getIntent();*/
    /*String num = intent0.getStringExtra(SelectActivity.EXTRA_MESSAGE);*/
    int index = 0;
    String[][] colors = new String[][] {
            { "暗玉紫", "Anyuzi" ,"#5c2223", },
            { "牡丹粉红", "Mudanfenhong", "#eea2a4", },
            { "艳红", "Yanhong", "#ed5a65", },
            { "玉红", "Yuhong", "#c04851", },
            { "高粱红", "Gaolianghong", "#c02c38", },
            { "满江红", "Manjianghong", "#a7535a", },

            { "合欢红", "Hehuanhong", "#f0a1a8", },
            {"品蓝","Pinlan","#2B73AF"},
            {"景泰蓝","Jingtailan","#2775B6"},
            {"飞燕草蓝","Feiyancaolan","#0F59A4"},
            {"柏林蓝","Bolinlan","#126BAE"},
            {"星蓝","Xinglan","#93B5CF"},
            {"搪瓷蓝","Tangcilan","#11659A"},
            {"羽扇豆蓝","Yushandoulan","#619AC3"},
            { "蝶黄", "Diehuang","#E2D849"},
            { "橄榄绿", "Ganlanlv", "#5E5314"},
            { "栀子黄", "Zhizihuang", "#ebb10b"},
            { "香蕉黄", "Xiangjiaohuang", "#e4bf11" },
            { "硫华黄", "Liuhuahuang", "#f2ce2b" },
            { "燕羽灰", "Yanyuhui", "#685e48" },

            {"松霜绿","Songshuanglv","#84a78d"},
            {"玉髓绿","yusuilv","#41b349"},
            {"孔雀绿","kongquelv","#229453"},
            {"深海绿","shenghailv","#1a3b32"},
            {"飞泉绿","feiquanlv","#497568"},
            {"清水蓝","qingshuilan","#93d5dc"},
            {"甸子蓝","dianzilan","#10aec2"},
            {"晚波蓝","wanbolan","#648e93"},
            {"蔚蓝","weilan","#29b7cb"},
            {"鸢尾蓝","yuanweilan","#158bb8"},
            {"涧石蓝","jianshilan","#66a9c9"},
            {"牵牛花蓝","qianniuhualan","#1177b0"},
            {"美蝶绿","meidielv","#12aa9c"},
            { "葡萄酱紫", "putaojingzi", "f26b1f" },
            { "猪肝紫", "zhuganzi", "541e24" },
            { "酱紫", "jingzi", "4d1018" },
            { "李紫", "lizi", "2b1216" },
            { "金鱼紫", "jinyuzi", "500a16" },
            { "石竹紫", "shizuzi", "63071c" },
            { "淡曙红", "danshuhong", "ee2746" },
            { "烟红", "yanhong", "894e54" },
            { "鹅冠红", "eguanhong", "d11a2d" },
            { "唐菖蒲红", "tangchangpuhong", "de1c31" },
            { "草茉莉红", "caomolihong", "ef475d" },
            { "殷红", "yanhong", "82111f" },
            { "淡茜红", "danqianhong", "e77c8e" },
            { "月季红", "yuejihong", "ce5777" },
            { "姜红", "jianghong", "eeb8c3" },
            { "吊钟花红", "diaozhonghuahong", "2d0c13" },
            { "夹竹桃红", "jiazhutaohong", "eb507e" },
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        /*final View view = this.getWindow().getDecorView();*/
        /*final Button button1 = (Button) findViewById(R.id.button1);*/

        String fontPath = "fonts/abc.ttf";
        final TextView txt1 = (TextView) findViewById(R.id.colorName);
        final TextView txt2 = (TextView) findViewById(R.id.color);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        txt1.setTypeface(tf);
        /*button1.setTypeface(tf);*/

        /*button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                layout.setBackgroundColor(Color.parseColor(colors[0][2]));
                txt1.setText(colors[0][0]);
                txt2.setText(colors[0][1]);
            }
        });*/



        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }
        });

        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*setContentView(R.layout.color2);*/
                for (int i = 0; i < colors.length; i++) {
                    if (index == i) {
                        layout.setBackgroundColor(Color.parseColor(colors[index][2]));
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        index++;
                        break;
                    }
                }
                /**view.setBackgroundColor(Color.RED);*/
                /**layout1.setBackgroundColor(Color.RED);*/
            }
        });

        if (SelectActivity.getIsSent()) {
            int num = SelectActivity.getNumber();
            layout.setBackgroundColor(Color.parseColor(colors[num][2]));
            txt1.setText(colors[num][0]);
            txt2.setText(colors[num][1]);
            SelectActivity.resetIsSent();
        }

    }
}


        /**TextView txt2 = (TextView) findViewById(R.id.colorName2);*/
        /*txt2.setTypeface(tf);*/

        /**txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main);

            }
        });*/
