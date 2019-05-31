package com.sandra.kauserhina.gpacalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2,b3,b4,b5,b6,b7,b8;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.bt1);
        b2 = (Button)findViewById(R.id.bt2);
        b3 = (Button)findViewById(R.id.bt3);
        b4 = (Button)findViewById(R.id.bt4);
        b5 = (Button)findViewById(R.id.bt5);
        b6 = (Button)findViewById(R.id.bt6);
        b7 = (Button)findViewById(R.id.bt7);
        b8 = (Button)findViewById(R.id.bt8);
        sharedPreferences = getSharedPreferences("Data",MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 1";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                //Toast.makeText(MainActivity.this,"semester"+sem,Toast.LENGTH_SHORT).show();
                startingActivity();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 2";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 3";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 4";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 5";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 6";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 7";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sem = "Semester = 8";
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Semester",sem);
                editor.commit();
                startingActivity();
            }
        });
    }
    public void startingActivity(){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
