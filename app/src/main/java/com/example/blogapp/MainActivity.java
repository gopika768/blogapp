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

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences=getSharedPreferences("logapp",MODE_PRIVATE);
        String username=preferences.getString("user",null);
        if(username!=null)
        {
            Intent i=new Intent(getApplicationContext(),menu.class);
            startActivity(i);
        }
        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.sinid);
        b2=(AppCompatButton) findViewById(R.id.supid);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getname=e1.getText().toString();
                String getpass=e2.getText().toString();
                if(getname.equals("admin") && getpass.equals("12345"))
                {
                    SharedPreferences preferences=getSharedPreferences("logapp",MODE_PRIVATE);
                    SharedPreferences.Editor editor= preferences.edit();
                    editor.putString("user","admin");
                    editor.apply();
                    Intent i=new Intent(getApplicationContext(),menu.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}