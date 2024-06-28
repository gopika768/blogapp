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

public class ADDPOST extends AppCompatActivity {
    EditText ade1,ade2,ade3;
    AppCompatButton btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addpost);
        ade1=(EditText) findViewById(R.id.tid);
        ade2=(EditText) findViewById(R.id.disid);
        ade3=(EditText) findViewById(R.id.pid);
        btn1=(AppCompatButton) findViewById(R.id.postid);
        btn2=(AppCompatButton) findViewById(R.id.backmenuid);
        btn3=(AppCompatButton) findViewById(R.id.logid);
        btn3.setOnClickListener(new View.OnClickListener() {
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getpost=ade1.getText().toString();
                Toast.makeText(getApplicationContext(),getpost+" "+"POSTED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}