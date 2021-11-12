package com.example.zadanie2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        Button previousButton = findViewById(R.id.button2);
        Button nextButton = findViewById(R.id.button3);
        TextView textview1 = findViewById(R.id.textView5);
        TextView textview2 = findViewById(R.id.textView6);
        TextView textview3 = findViewById(R.id.textView7);
        TextView textview4 = findViewById(R.id.textView8);

        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        if(intent.getBooleanExtra("checkbox1", false)){
            textview1.setText("Zaznaczono checkbox 1");
        } else {
            textview1.setText("Nie zaznaczono checkbox 1");
        }

        if(intent.getBooleanExtra("checkbox2", false) == true){
            textview2.setText("Zaznaczono checkbox 2");
        } else {
            textview2.setText("Nie zaznaczono checkbox 2");
        }

        textview3.setText(intent.getStringExtra("spinner"));

        textview4.setText(intent.getStringExtra("text"));

        if(intent.getBooleanExtra("switch", false)){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#EB4B92"));
        }
    }
}