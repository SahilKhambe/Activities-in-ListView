package com.example.activitiesinlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        String[] values = new String[]{"Activity 1", "Activity 2", "Activity 3", "Activity 4", "Activity 5", "Activity 6", "Activity 7", "Activity 8", "Activity 9", "Activity 10", "Activity 11", "Activity 12", "Activity 13", "Activity 14", "Activity 15", "Activity 16"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(MainActivity.this, Activity3.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(MainActivity.this, Activity4.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(MainActivity.this, Activity5.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(MainActivity.this, Activity6.class);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(MainActivity.this, Activity7.class);
                    startActivity(intent);
                }
                if(position == 6){
                    Intent intent = new Intent(MainActivity.this, Activity8.class);
                    startActivity(intent);
                }
                if(position == 7){
                    Intent intent = new Intent(MainActivity.this, Activity9.class);
                    startActivity(intent);
                }
                if(position == 8){
                    Intent intent = new Intent(MainActivity.this, Activity10.class);
                    startActivity(intent);
                }
                if(position == 9){
                    Intent intent = new Intent(MainActivity.this, Activity11.class);
                    startActivity(intent);
                }
                if(position == 10){
                    Intent intent = new Intent(MainActivity.this, Activity12.class);
                    startActivity(intent);
                }
                if(position == 11){
                    Intent intent = new Intent(MainActivity.this, Activity13.class);
                    startActivity(intent);
                }
                if(position == 12){
                    Intent intent = new Intent(MainActivity.this, Activity14.class);
                    startActivity(intent);
                }
                if(position == 13){
                    Intent intent = new Intent(MainActivity.this, Activity15.class);
                    startActivity(intent);
                }
                if(position == 14){
                    Intent intent = new Intent(MainActivity.this, Activity16.class);
                    startActivity(intent);
                }
                if(position == 15){
                    Intent intent = new Intent(MainActivity.this, Activity17.class);
                    startActivity(intent);
                }
            }
        });

    }
}