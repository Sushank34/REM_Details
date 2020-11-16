package com.example.project_rem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.Button1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b1){
            Intent i=new Intent(this,Developers.class);
            startActivity(i);
        }
    }
}