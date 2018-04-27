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
        final Button button019 = (Button) findViewById(R.id.button019);
        final Button button020 = (Button) findViewById(R.id.button020);
        final Button button021 = (Button) findViewById(R.id.button021);
        final Button button022 = (Button) findViewById(R.id.button022);
        final Button button023 = (Button) findViewById(R.id.button023);
        final Button button024 = (Button) findViewById(R.id.button024);
        final Button button025 = (Button) findViewById(R.id.button025);
        final Button button026 = (Button) findViewById(R.id.button026);
        final Button button027 = (Button) findViewById(R.id.button027);
        final Button button028 = (Button) findViewById(R.id.button028);
        final Button button029 = (Button) findViewById(R.id.button029);
        final Button button030 = (Button) findViewById(R.id.button030);
        final Button button031 = (Button) findViewById(R.id.button031);
        final Button button032 = (Button) findViewById(R.id.button032);
        final Button button033 = (Button) findViewById(R.id.button033);
        final Button button034 = (Button) findViewById(R.id.button034);
        final Button button035 = (Button) findViewById(R.id.button035);
        final Button button036 = (Button) findViewById(R.id.button036);
        final Button button037 = (Button) findViewById(R.id.button037);
        final Button button038 = (Button) findViewById(R.id.button038);
        final Button button039 = (Button) findViewById(R.id.button039);
        final Button button040 = (Button) findViewById(R.id.button040);
        final Button button041 = (Button) findViewById(R.id.button041);
        final Button button042 = (Button) findViewById(R.id.button042);
        final Button button043 = (Button) findViewById(R.id.button043);
        final Button button044 = (Button) findViewById(R.id.button044);
        final Button button045 = (Button) findViewById(R.id.button045);
        final Button button046 = (Button) findViewById(R.id.button046);
        final Button button047 = (Button) findViewById(R.id.button047);
        final Button button048 = (Button) findViewById(R.id.button048);
        final Button button049 = (Button) findViewById(R.id.button049);
        final Button button050 = (Button) findViewById(R.id.button050);
        final Button button051 = (Button) findViewById(R.id.button051);
        final Button button052 = (Button) findViewById(R.id.button052);
        final Button button053 = (Button) findViewById(R.id.button053);
        final Button button054 = (Button) findViewById(R.id.button054);
        final Button button055 = (Button) findViewById(R.id.button055);
        final Button button056 = (Button) findViewById(R.id.button056);
        final Button button057 = (Button) findViewById(R.id.button057);
        final Button button058 = (Button) findViewById(R.id.button058);
        final Button button059 = (Button) findViewById(R.id.button059);
        final Button button060 = (Button) findViewById(R.id.button060);
        final Button button061 = (Button) findViewById(R.id.button061);
        final Button button062 = (Button) findViewById(R.id.button062);
        final Button button063 = (Button) findViewById(R.id.button063);
        final Button button064 = (Button) findViewById(R.id.button064);
        final Button button065 = (Button) findViewById(R.id.button065);
        final Button button066 = (Button) findViewById(R.id.button066);
        final Button button067 = (Button) findViewById(R.id.button067);
        final Button button068 = (Button) findViewById(R.id.button068);
        final Button button069 = (Button) findViewById(R.id.button069);
        final Button button070 = (Button) findViewById(R.id.button070);
        final Button button071 = (Button) findViewById(R.id.button071);
        final Button button072 = (Button) findViewById(R.id.button072);
        final Button button073 = (Button) findViewById(R.id.button073);
        final Button button074 = (Button) findViewById(R.id.button074);
        final Button button075 = (Button) findViewById(R.id.button075);
        final Button button076 = (Button) findViewById(R.id.button076);
        final Button button077 = (Button) findViewById(R.id.button077);





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
        button019.setTypeface(tf);
        button020.setTypeface(tf);
        button021.setTypeface(tf);
        button022.setTypeface(tf);
        button023.setTypeface(tf);
        button024.setTypeface(tf);
        button025.setTypeface(tf);
        button026.setTypeface(tf);
        button027.setTypeface(tf);
        button028.setTypeface(tf);
        button029.setTypeface(tf);
        button030.setTypeface(tf);
        button031.setTypeface(tf);
        button032.setTypeface(tf);
        button033.setTypeface(tf);
        button034.setTypeface(tf);
        button035.setTypeface(tf);
        button036.setTypeface(tf);
        button037.setTypeface(tf);
        button038.setTypeface(tf);
        button039.setTypeface(tf);
        button040.setTypeface(tf);
        button041.setTypeface(tf);
        button042.setTypeface(tf);
        button043.setTypeface(tf);
        button044.setTypeface(tf);
        button045.setTypeface(tf);
        button046.setTypeface(tf);
        button047.setTypeface(tf);
        button048.setTypeface(tf);
        button049.setTypeface(tf);
        button050.setTypeface(tf);
        button051.setTypeface(tf);
        button052.setTypeface(tf);
        button053.setTypeface(tf);
        button054.setTypeface(tf);
        button055.setTypeface(tf);
        button056.setTypeface(tf);
        button057.setTypeface(tf);
        button058.setTypeface(tf);
        button059.setTypeface(tf);
        button060.setTypeface(tf);
        button061.setTypeface(tf);
        button062.setTypeface(tf);
        button063.setTypeface(tf);
        button064.setTypeface(tf);
        button065.setTypeface(tf);
        button066.setTypeface(tf);
        button067.setTypeface(tf);
        button068.setTypeface(tf);
        button069.setTypeface(tf);
        button070.setTypeface(tf);
        button071.setTypeface(tf);
        button072.setTypeface(tf);
        button073.setTypeface(tf);
        button074.setTypeface(tf);
        button075.setTypeface(tf);
        button076.setTypeface(tf);
        button077.setTypeface(tf);

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

        button019.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button020.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button021.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button022.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button023.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });
        button024.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button025.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button026.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button027.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button028.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button029.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button030.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button031.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button032.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button033.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button034.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button035.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button036.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button037.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button038.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button039.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button040.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button041.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button042.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button043.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button044.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button045.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button046.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button047.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button048.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button049.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button050.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button051.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button052.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button053.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button054.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button055.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button056.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button057.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button058.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button059.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button060.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button061.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button062.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button063.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button064.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button065.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button066.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button067.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button068.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button069.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button070.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button071.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button072.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button073.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button074.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button075.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button076.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
            }
        });

        button077.setOnClickListener(new View.OnClickListener() {
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
