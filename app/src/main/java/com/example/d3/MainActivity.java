package com.example.d3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,sur;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=findViewById(R.id.name);
        sur=findViewById(R.id.sur);
        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Name=name.getText().toString();
                String surname=sur.getText().toString();


                Intent intent=new Intent(MainActivity.this,second.class);
                intent.putExtra("name",Name);
                intent.putExtra("sur",surname);
                startActivity(intent);

            }
        });
    }
}