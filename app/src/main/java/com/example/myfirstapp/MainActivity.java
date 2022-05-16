package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Почему я использовал TableLayout при создании макета калькулятора?
    //1)Удобство.Калькулятор - по сути таблица из строк(TableRow) в которые мы можем добавить кнопки(элементы).
    //2)Простота. В этом типе контейнера фиксированное количество колонок, оно определяется по самой длинной строке.
    // Ширина колонки определяется по самому длинному элементу. Таким образом составить шаблон с кнопками калькулятора не составляет труда.
    //3)Можно использовать гравитацию
}