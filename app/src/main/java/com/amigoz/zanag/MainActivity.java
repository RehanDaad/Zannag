package com.amigoz.zanag;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        Button start, quiz;

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        protected void onCreate (Bundle savedInstanceState){
            StausbarColor.status(MainActivity.this, R.color.cardview_light_background);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            start = (Button) findViewById(R.id.strbtn);
            quiz = (Button) findViewById(R.id.testbtn);

            start.setOnClickListener(this);
            quiz.setOnClickListener(this);


        }


        @Override
        public void onClick (View view){
            if (view.getId() == R.id.strbtn) {

                Intent intent = new Intent(MainActivity.this, firstpage.class);

            }



    }
}



