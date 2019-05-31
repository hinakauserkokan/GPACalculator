package com.sandra.kauserhina.gpacalculator;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        sharedPreferences = getSharedPreferences("Data",MODE_PRIVATE);
        String s =sharedPreferences.getString("Semester","");
        //Toast.makeText(Main2Activity.this,s,Toast.LENGTH_SHORT).show();
        if(s.equals("Semester = 1")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_one sem_one = new semester_one();
            fragmentTransaction.add(R.id.fragment_container,sem_one,null);
            fragmentTransaction.commit();
        }else if(s.equals("Semester = 2")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_two sem_two = new semester_two();
            fragmentTransaction.add(R.id.fragment_container,sem_two,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 3")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_three sem_three =  new semester_three();
            fragmentTransaction.add(R.id.fragment_container,sem_three,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 4")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_four sem_four =  new semester_four();
            fragmentTransaction.add(R.id.fragment_container,sem_four,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 5")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_five sem_five =  new semester_five();
            fragmentTransaction.add(R.id.fragment_container,sem_five,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 6")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_six sem_six = new semester_six();
            fragmentTransaction.add(R.id.fragment_container,sem_six,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 7")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_seven sem_seven = new semester_seven();
            fragmentTransaction.add(R.id.fragment_container,sem_seven,null);
            fragmentTransaction.commit();
        }
        else if(s.equals("Semester = 8")){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            semester_eight sem_eight = new semester_eight();
            fragmentTransaction.add(R.id.fragment_container,sem_eight,null);
            fragmentTransaction.commit();
        }
    }
}
