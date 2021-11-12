package com.example.zadanie2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String spinnerText= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstButton = findViewById(R.id.button);
        CheckBox firstCheckBox = findViewById(R.id.checkBox);
        CheckBox secondCheckBox = findViewById(R.id.checkBox2);
        Switch switch1 = findViewById(R.id.switch1);
        EditText editText = findViewById(R.id.editText);
        Spinner spinner =(Spinner) findViewById(R.id.spinner);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("checkbox1",firstCheckBox.isChecked());
                intent.putExtra("checkbox2",secondCheckBox.isChecked());
                intent.putExtra("spinner", spinner.getSelectedItem().toString());
                intent.putExtra("text", editText.getText().toString());
                intent.putExtra("switch", switch1.isChecked());
                startActivity(intent);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        spinnerText = adapterView.getItemAtPosition(i).toString();
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

