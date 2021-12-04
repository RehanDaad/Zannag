package com.amigoz.zanag;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class QuizActivity extends AppCompatActivity implements View.OnClickListener {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    TextView show;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        StausbarColor.status(QuizActivity.this , R.color.purple_500);
        show=(TextView) findViewById(R.id.manu);
        Intent next=getIntent();
        String S1=next.getStringExtra("value");
        show.setText(S1);

    }


    @Override
    public void onClick(View view) {




        }

    }
