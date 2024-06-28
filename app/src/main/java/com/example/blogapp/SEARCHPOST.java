package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SEARCHPOST extends AppCompatActivity {
    EditText se1;
    AppCompatButton sbt1,sbt2,sbt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_searchpost);

        se1=(EditText) findViewById(R.id.tid);
        sbt1=(AppCompatButton) findViewById(R.id.searchid);
        sbt2=(AppCompatButton) findViewById(R.id.backmenuid);
        sbt3=(AppCompatButton) findViewById(R.id.logid);
        sbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("logapp",MODE_PRIVATE);
                SharedPreferences.Editor editor= preferences.edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        sbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        });
        sbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gettitle=se1.getText().toString();
                Toast.makeText(getApplicationContext(),gettitle+" "+"searched",Toast.LENGTH_SHORT).show();
            }
        });
    }
}