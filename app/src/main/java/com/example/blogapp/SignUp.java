package com.example.blogapp;

import android.content.Intent;
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

public class SignUp extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    AppCompatButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1=(EditText) findViewById(R.id.uid);
        e2=(EditText) findViewById(R.id.cid);
        e3=(EditText) findViewById(R.id.pid);
        e4=(EditText) findViewById(R.id.conid);
        rb1=(AppCompatButton) findViewById(R.id.rid);
        rb2=(AppCompatButton) findViewById(R.id.bmid);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getuname=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getuname+" "+"Registered",Toast.LENGTH_SHORT).show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}