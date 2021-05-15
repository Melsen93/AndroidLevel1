package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_two);
        //Атрибут EMS используется для определения значения ширины TextView
        // в единицах измерения EM. При этом EM это единица измерения в Typography (Типография),
        // его значением является ширина буквы "M"
        setContentView(R.layout.activity_three);

    }
}