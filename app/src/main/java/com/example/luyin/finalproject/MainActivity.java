package com.example.luyin.finalproject;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.like.LikeButton;
import com.like.OnLikeListener;

import java.lang.reflect.Array;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {


    /*Intent intent0 = getIntent();*/
    /*String num = intent0.getStringExtra(SelectActivity.EXTRA_MESSAGE);*/
    int r,g,b;
    int index = 0;
    static boolean isUp;
    final static int[] Liked = new int[101];
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
            {"蛙绿","walv","#45B787"},
            {"铜绿","Tonglv","#2BAE85"},
            {"荷叶绿","heyelv","#1a6840"},
            {"粉绿","fenlv","#83cbac"},
            {"麦苗绿","maimiaolv","#55bb8a"},
            {"玉簪绿","yuzanlv","#a4cab6"},
            {"寇梢绿","koushaolv","#5dbe8a"},
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
            { "葡萄酱紫", "putaojingzi", "#5a1216" },
            { "猪肝紫", "zhuganzi", "#541e24" },
            { "酱紫", "jiangzi", "#4d1018" },
            { "李紫", "lizi", "#2b1216" },
            { "金鱼紫", "jinyuzi", "#500a16" },
            { "石竹紫", "shizuzi", "#63071c" },
            { "淡曙红", "danshuhong","#ee2746" },
            { "烟红", "yanhong", "#894e54" },
            { "鹅冠红", "eguanhong", "#d11a2d" },
            { "唐菖蒲红", "tangchangpuhong", "#de1c31" },
            { "草茉莉红", "caomolihong", "#ef475d" },
            { "殷红", "yanhong", "#82111f" },
            { "淡茜红", "danqianhong", "#e77c8e" },
            { "月季红", "yuejihong", "#ce5777" },
            { "姜红", "jianghong", "#eeb8c3" },
            { "吊钟花红", "diaozhonghuahong", "#2d0c13" },
            { "夹竹桃红", "jiazhutaohong", "#eb507e" },
            {"夜灰","yehui","#847c74"},
            {"淡银灰","danyinhui","#c1b2a3"},
            {"玛瑙灰","manaohui","#cfccc9"},
            {"鹤灰","hehui","#4a4035"},
            {"淡米粉","danmifen","#fbeee2"},
            {"海鸥灰","haiouhui","#9a8878"},
            {"松鼠灰","songshuhui","#4f4032"},
            {"银灰","yinhui","#918072"},
            {"驼色","tuose","#66462a"},
            {"雁灰","yanhui","#80766e"},
            {"藕荷","ouhe","#edc3ae"},
            {"中灰驼","zhonghuituo","#603d30"},
            {"瓦灰","wahui","#867e76"},
            {"淡松烟","dansongyan","#4d4030"},
            {"猴毛灰","houmaohui","#97844c"},
            {"茶褐","chahe","#5d3d21"},
            {"古铜褐","gutonghe","#5c3719"},
            {"槟榔棕","binglangzong","#c1651a"},
            {"鹿皮褐","lupihe","#d99156"},
            {"玫瑰粉","meiguifen","#f8b37f"},
            {"铁棕","tiezong","#d85916"},
            {"酱棕","jiangzong","#5a1f1b"},
            {"玫瑰灰","meiguihui","#4b2e2b"},
            {"安安蓝","ananlan","#3170a7"},
            {"鸽蓝","gelan","#1c2938"},
            {"鲸鱼灰","jingyuhui","#475164"},
            {"钢青","gangqing","#142334"},
            {"山梗紫","shangengzi","#61649f"},
            {"牛角灰","niujiaohui","#2d2e36"},
            {"满天星紫","mantianxingzi","#2e317c"},
            {"胆矾蓝","danfanlan","#0f95b0"},
            {"蜻蜓蓝","qingtinglan","#3b818c"},
            {"蓝绿","lanlv","#12a182"},
            {"甘蓝绿","ganlanlv","#1f2623"},
            {"花青","huaqing","#2376b7"},
            {"萝兰紫","luolanzi","#c09eaf"},
            {"魏紫","weizi","#7e1671"},
            {"风信紫","fengxinzi","#c8adc4"},
            {"桔梗紫","jiegengzi","#813c85"},
            {"藤萝紫","tengluozi","#8076a3"},
            {"槿紫","jinzi","#806d9e"},
            {"晶石紫","jingshizi","#1f2040"},
            {"蕈紫","xunzi","#815c94"},
            {"芥花紫","jiehuazi","#983680"},
};


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Intent svc=new Intent(this, BackGroundSoundService.class);
        startService(svc);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //set content view AFTER ABOVE sequence (to avoid crash)
        // Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        /*final View view = this.getWindow().getDecorView();*/
        /*final Button button1 = (Button) findViewById(R.id.button1);*/

        String fontPath = "fonts/abc.ttf";
        final ProgressBar red = findViewById(R.id.red);
        final ProgressBar green = findViewById(R.id.green);
        final ProgressBar blue = findViewById(R.id.blue);
        final TextView txt1 = (TextView) findViewById(R.id.colorName);
        final TextView txt2 = (TextView) findViewById(R.id.color);
        final TextView hex = findViewById(R.id.hex);
        final TextView red_value = findViewById(R.id.red_value);
        final TextView green_value = findViewById(R.id.green_value);
        final TextView blue_value = findViewById(R.id.blue_value);
        final LikeButton likeButton = findViewById(R.id.star_button);
        final RadioButton radioButton = findViewById(R.id.radioButton);

        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
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
        final View myView = findViewById(R.id.my_view);

        // initialize as invisible (could also do in xml)
        myView.setVisibility(View.INVISIBLE);
        isUp = false;

        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
                finish();
            }
        });

        layout.setOnTouchListener(new OnSlideTouchListener() {
            @Override
            public boolean onSlideUp() {
                if (!isUp) {
                    slideUp(myView);
                }
                isUp = true;
                return true;
            }

            public boolean onSlideDown() {
                if (isUp) {
                    slideDown(myView);
                }
                isUp = false;
                return true;
            }

            public boolean onSlideLeft() {
                int oldIndex = index;
                if (index < 1) {
                    return true;
                }
                index--;
                if (index == 101) {
                    index = 0;
                }

                if (Liked[index] == 1) {
                    likeButton.setLiked(true);
                } else {
                    likeButton.setLiked(false);
                }

                int colorFrom = Color.parseColor(colors[oldIndex][2]);
                int colorTo = Color.parseColor(colors[index][2]);
                ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(1000); // milliseconds
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        layout.setBackgroundColor((int) animator.getAnimatedValue());

                    }

                });
                colorAnimation.start();

//                layout.setBackgroundColor(Color.parseColor(colors[index][2]));

                Animation anim1 = new AlphaAnimation(1.0f, 0.0f);
                final Animation anim2 = new AlphaAnimation(0.0f, 1.0f);

                anim1.setDuration(500L);
                anim1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        red_value.setText(Integer.toString(r));
                        green_value.setText(Integer.toString(g));
                        blue_value.setText(Integer.toString(b));
                        red.setProgress(r*100/256);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);
                        txt1.startAnimation(anim2);
                        txt2.startAnimation(anim2);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                anim2.setDuration(500L);
                anim2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        red_value.setText(Integer.toString(r));
                        green_value.setText(Integer.toString(g));
                        blue_value.setText(Integer.toString(b));
                        red.setProgress(r*100/256);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                txt1.startAnimation(anim1);
                txt2.startAnimation(anim1);
//                txt1.setText(colors[index][0]);
//                txt2.setText(colors[index][1]);
                /**view.setBackgroundColor(Color.RED);*/
                /**layout1.setBackgroundColor(Color.RED);*/
                return true;
            }

            public boolean onSlideRight() {
                int oldIndex = index;
                index++;
                if (index == 101) {
                    index = 0;
                }

                if (Liked[index] == 1) {
                    likeButton.setLiked(true);
                } else {
                    likeButton.setLiked(false);
                }

                int colorFrom = Color.parseColor(colors[oldIndex][2]);
                int colorTo = Color.parseColor(colors[index][2]);
                ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(1000); // milliseconds
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        layout.setBackgroundColor((int) animator.getAnimatedValue());

                    }

                });
                colorAnimation.start();

//                layout.setBackgroundColor(Color.parseColor(colors[index][2]));

                Animation anim1 = new AlphaAnimation(1.0f, 0.0f);
                final Animation anim2 = new AlphaAnimation(0.0f, 1.0f);

                anim1.setDuration(500L);
                anim1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);
                        red_value.setText(Integer.toString(r));
                        green_value.setText(Integer.toString(g));
                        blue_value.setText(Integer.toString(b));
                        red.setProgress(r*100/256);
                        txt1.startAnimation(anim2);
                        txt2.startAnimation(anim2);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                anim2.setDuration(500L);
                anim2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);
                        red_value.setText(Integer.toString(r));
                        green_value.setText(Integer.toString(g));
                        blue_value.setText(Integer.toString(b));
                        red.setProgress(r*100/256);

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                txt1.startAnimation(anim1);
                txt2.startAnimation(anim1);
//                txt1.setText(colors[index][0]);
//                txt2.setText(colors[index][1]);
                /**view.setBackgroundColor(Color.RED);*/
                /**layout1.setBackgroundColor(Color.RED);*/
                return true;
            }

            @Override
            public boolean onClick() {
                int oldIndex = index;
                index++;
                if (index == 101) {
                    index = 0;
                }

                if (Liked[index] == 1) {
                    likeButton.setLiked(true);
                } else {
                    likeButton.setLiked(false);
                }

                int colorFrom = Color.parseColor(colors[oldIndex][2]);
                int colorTo = Color.parseColor(colors[index][2]);
                ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(1000); // milliseconds
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        layout.setBackgroundColor((int) animator.getAnimatedValue());

                    }

                });
                colorAnimation.start();

//                layout.setBackgroundColor(Color.parseColor(colors[index][2]));

                Animation anim1 = new AlphaAnimation(1.0f, 0.0f);
                final Animation anim2 = new AlphaAnimation(0.0f, 1.0f);

                anim1.setDuration(500L);
                anim1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);
                        red.setProgress(r*100/256);
                        txt1.startAnimation(anim2);
                        txt2.startAnimation(anim2);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                anim2.setDuration(500L);
                anim2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        txt1.setText(colors[index][0]);
                        txt2.setText(colors[index][1]);
                        hex.setText((colors[index][2]).toUpperCase());
                        r = Integer.parseInt(colors[index][2].substring(1,3), 16);
                        g = Integer.parseInt(colors[index][2].substring(3,5), 16);
                        b = Integer.parseInt(colors[index][2].substring(5,7), 16);
                        green.setProgress(g*100/256);
                        blue.setProgress(r*100/256);
                        red_value.setText(Integer.toString(r));
                        green_value.setText(Integer.toString(g));
                        blue_value.setText(Integer.toString(b));
                        red.setProgress(r*100/256);

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                txt1.startAnimation(anim1);
                txt2.startAnimation(anim1);
//                txt1.setText(colors[index][0]);
//                txt2.setText(colors[index][1]);
                /**view.setBackgroundColor(Color.RED);*/
                /**layout1.setBackgroundColor(Color.RED);*/
                return true;
            }

            }
        );


        likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                Liked[index] = 1;
//                txt2.setText(Arrays.toString(Liked));
//                txt1.setText(Integer.toString(index) + Integer.toString(Liked[index]));
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                Liked[index] = 0;
//                txt2.setText(Arrays.toString(Liked));
//                txt1.setText(Integer.toString(index) + Integer.toString(Liked[index]));
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               BackGroundSoundService.Pause();
                radioButton.setChecked(BackGroundSoundService.isOn);
            }
        });





        if (SelectActivity.getIsSent()) {
            int num = SelectActivity.getNumber();
            index = num;
            layout.setBackgroundColor(Color.parseColor(colors[num][2]));
            txt1.setText(colors[num][0]);
            txt2.setText(colors[num][1]);
            if (Liked[index] == 1) {
                likeButton.setLiked(true);
            } else {
                likeButton.setLiked(false);
            }
//            txt1.setText(Integer.toString(index) + Integer.toString(Liked[index]));
//            txt2.setText(Arrays.toString(Liked));
            hex.setText((colors[index][2]).toUpperCase());
            r = Integer.parseInt(colors[index][2].substring(1,3), 16);
            g = Integer.parseInt(colors[index][2].substring(3,5), 16);
            b = Integer.parseInt(colors[index][2].substring(5,7), 16);
            green.setProgress(g*100/256);
            blue.setProgress(r*100/256);
            red_value.setText(Integer.toString(r));
            green_value.setText(Integer.toString(g));
            blue_value.setText(Integer.toString(b));
            red.setProgress(r*100/256);
            if (Liked[index] == 1) {
                likeButton.setLiked(true);
            } else {
                likeButton.setLiked(false);
            }
            SelectActivity.resetIsSent();
        }



    }

    private void slideUp(View view) {
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                view.getHeight(),  // fromYDelta
                0);                // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    private void slideDown(View view) {
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                view.getHeight()); // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }
}


        /**TextView txt2 = (TextView) findViewById(R.id.colorName2);*/
        /*txt2.setTypeface(tf);*/

        /**txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main);

            }
        });*/
