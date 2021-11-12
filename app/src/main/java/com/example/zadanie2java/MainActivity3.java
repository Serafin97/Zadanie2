package com.example.zadanie2java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    List<String> data = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onStart()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onRestart()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onResume()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onPause()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onStop()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onDestroy()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Date date = new Date();
        date.getTime();
        data.add(date.toString() + "onDestroy()");

        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

    }

}