package com.amigoz.zanag;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class firstpage extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    TextView alif,bey,show,c;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_firstpage);
        StausbarColor.status(firstpage.this, R.color.cardview_light_background);
        alif = (TextView) findViewById(R.id.a);
        bey = (TextView) findViewById(R.id.b);
        show = (TextView) findViewById(R.id.manu);
        c=(TextView) findViewById(R.id.a3);
        c.setOnClickListener(this);
        alif.setOnClickListener(this);
        bey.setOnClickListener(this);


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View view) {

        String s1=alif.getText().toString();
        if (view.getId() == R.id.a) {
            Intent next=new Intent(firstpage.this,QuizActivity.class);
            next.putExtra("value",s1);
            startActivity(next);



        }  String S=bey.getText().toString();









        }

    }

