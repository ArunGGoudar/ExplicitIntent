package com.example.arun.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etname;
    Button btsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.etName);
        btsubmit=findViewById(R.id.btSubmit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(etname.getText().toString().isEmpty())
            {
                Toast.makeText(MainActivity.this,"Please enter the name",Toast.LENGTH_SHORT).show();
            }
            else
            {
                String name = etname.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this,com.example.arun.explicitintent.Activity2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }

        }
    });

    }
}
