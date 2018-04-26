package com.example.luyin.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {
    private static boolean isSent = false;
    private static int number;
    /*public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";*/
    public static void resetIsSent() {
        isSent = false;
    }
    public static int getNumber() {
        return number;
    }
    public static boolean getIsSent() {
        return isSent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        final Button button000 = (Button) findViewById(R.id.button000);
        final Button button001 = (Button) findViewById(R.id.button001);
        final Button button002 = (Button) findViewById(R.id.button002);
        final Button button003 = (Button) findViewById(R.id.button003);
        final Button button004 = (Button) findViewById(R.id.button004);
        final Button button005 = (Button) findViewById(R.id.button005);
        final Button button006 = (Button) findViewById(R.id.button006);
        final Button button007 = (Button) findViewById(R.id.button007);
        final Button button008 = (Button) findViewById(R.id.button008);
        final Button button009 = (Button) findViewById(R.id.button009);
        final Button button010 = (Button) findViewById(R.id.button010);
        final Button button011 = (Button) findViewById(R.id.button011);
        final Button button012 = (Button) findViewById(R.id.button012);
        final Button button013 = (Button) findViewById(R.id.button013);
        final Button button014 = (Button) findViewById(R.id.button014);
        final Button button015 = (Button) findViewById(R.id.button015);
        final Button button016 = (Button) findViewById(R.id.button016);
        final Button button017 = (Button) findViewById(R.id.button017);
        final Button button018 = (Button) findViewById(R.id.button018);



        String fontPath = "fonts/abc.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        button000.setTypeface(tf);
        button001.setTypeface(tf);
        button002.setTypeface(tf);
        button003.setTypeface(tf);
        button004.setTypeface(tf);
        button005.setTypeface(tf);
        button006.setTypeface(tf);
        button007.setTypeface(tf);
        button008.setTypeface(tf);
        button009.setTypeface(tf);
        button010.setTypeface(tf);
        button011.setTypeface(tf);
        button012.setTypeface(tf);
        button013.setTypeface(tf);
        button014.setTypeface(tf);
        button015.setTypeface(tf);
        button016.setTypeface(tf);
        button017.setTypeface(tf);
        button018.setTypeface(tf);

        button000.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                /*button000.setText(num);*/
                /*intent2.putExtra(EXTRA_MESSAGE, num);*/
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button001.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button002.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button003.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button004.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button005.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button006.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button007.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button008.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button009.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button010.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button011.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button012.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button013.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button014.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button015.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button016.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button017.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button018.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

    }
}
