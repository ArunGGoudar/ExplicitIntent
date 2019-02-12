package com.example.arun.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView= findViewById(R.id.tvresult);

        String name = getIntent().getStringExtra("name");
        textView.setText("Welcome come "+name);
    }
}
