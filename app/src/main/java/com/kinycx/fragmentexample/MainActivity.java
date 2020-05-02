package com.kinycx.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch sw = findViewById(R.id.switchFragment);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.fragment_container, secondFragment);
                    fragmentTransaction.commit();

                }else{

                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    FirstFragment firstFragment = new FirstFragment();
                    fragmentTransaction.replace(R.id.fragment_container, firstFragment);
                    fragmentTransaction.commit();
                }
            }
        });
    }
}
