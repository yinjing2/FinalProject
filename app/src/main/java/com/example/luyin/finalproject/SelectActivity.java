package com.example.luyin.finalproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
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
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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

        final Button button078 = (Button) findViewById(R.id.button078);
        final Button button079 = (Button) findViewById(R.id.button079);
        final Button button080 = (Button) findViewById(R.id.button080);
        final Button button081 = (Button) findViewById(R.id.button081);
        final Button button082 = (Button) findViewById(R.id.button082);
        final Button button083 = (Button) findViewById(R.id.button083);
        final Button button084 = (Button) findViewById(R.id.button084);
        final Button button085 = (Button) findViewById(R.id.button085);
        final Button button086 = (Button) findViewById(R.id.button086);
        final Button button087 = (Button) findViewById(R.id.button087);
        final Button button088 = (Button) findViewById(R.id.button088);
        final Button button089 = (Button) findViewById(R.id.button089);
        final Button button090 = (Button) findViewById(R.id.button090);
        final Button button091 = (Button) findViewById(R.id.button091);
        final Button button092 = (Button) findViewById(R.id.button092);
        final Button button093 = (Button) findViewById(R.id.button093);
        final Button button094 = (Button) findViewById(R.id.button094);
        final Button button095 = (Button) findViewById(R.id.button095);
        final Button button096 = (Button) findViewById(R.id.button096);
        final Button button097 = (Button) findViewById(R.id.button097);
        final Button button098 = (Button) findViewById(R.id.button098);
        final Button button099 = (Button) findViewById(R.id.button099);
        final Button button100 = (Button) findViewById(R.id.button100);





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
        button078.setTypeface(tf);
        button079.setTypeface(tf);
        button080.setTypeface(tf);
        button081.setTypeface(tf);
        button082.setTypeface(tf);
        button083.setTypeface(tf);
        button084.setTypeface(tf);
        button085.setTypeface(tf);
        button086.setTypeface(tf);
        button087.setTypeface(tf);
        button088.setTypeface(tf);
        button089.setTypeface(tf);
        button090.setTypeface(tf);
        button091.setTypeface(tf);
        button092.setTypeface(tf);
        button093.setTypeface(tf);
        button094.setTypeface(tf);
        button095.setTypeface(tf);
        button096.setTypeface(tf);
        button097.setTypeface(tf);
        button098.setTypeface(tf);
        button099.setTypeface(tf);
        button100.setTypeface(tf);

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
                finish();
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

                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
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
                finish();
            }
        });

        button078.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button079.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button080.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button081.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button082.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button083.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button084.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button085.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button086.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button087.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button088.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button089.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button090.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button091.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button092.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button093.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button094.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button095.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button096.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button097.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button098.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button099.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });

        button100.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                String buttonId = v.getResources().getResourceName(v.getId());
                String num = buttonId.substring(40);
                startActivity(intent);
                isSent = true;
                number = Integer.parseInt(num);
                finish();
            }
        });
    }
}


