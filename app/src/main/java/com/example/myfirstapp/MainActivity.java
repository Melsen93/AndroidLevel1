package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int argOne = Integer.parseInt(editText1.getText().toString());
                    int argTwo = Integer.parseInt(editText2.getText().toString());

                    textView.setText(Integer.toString(argOne + argTwo));
                }catch (NumberFormatException e) {
                    textView.setText("Введите два числа");
                }}
        });
    }
}
