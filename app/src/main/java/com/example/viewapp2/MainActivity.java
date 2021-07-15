package com.example.viewapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // загрузка интерфейса из файла activity_main.xml
        setContentView(R.layout.second_layout);

        // получаем элемент textView
        TextView textView = findViewById(R.id.header);

        // переустанавливаем у него текст
        textView.setText("Java best code in world");
    }
}