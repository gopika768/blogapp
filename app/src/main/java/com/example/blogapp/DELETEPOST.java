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

public class DELETEPOST extends AppCompatActivity {
    EditText de1;
    AppCompatButton dbt1,dbt2,dbt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_deletepost);
        de1=(EditText) findViewById(R.id.tid);
        dbt1=(AppCompatButton) findViewById(R.id.deleteid);
        dbt2=(AppCompatButton) findViewById(R.id.backmenuid);
        dbt3=(AppCompatButton) findViewById(R.id.logid);
        dbt3.setOnClickListener(new View.OnClickListener() {
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
        dbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        });
        dbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gettitle=de1.getText().toString();
                Toast.makeText(getApplicationContext(),gettitle+" "+"deleted",Toast.LENGTH_SHORT).show();
            }
        });
    }
}