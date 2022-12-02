package com.example.d3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView name,sur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        name=findViewById(R.id.txt_name);
        sur=findViewById(R.id.txt_sur);

        String Name=getIntent().getStringExtra("name");
        String surname=getIntent().getStringExtra("sur");


        name.setText(""+Name);
        sur.setText(""+surname);


    }
}