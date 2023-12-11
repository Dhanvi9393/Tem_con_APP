package com.example.mytemp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText E;
    TextView T;
    Button b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E = findViewById(R.id.editTextNumberDecimal);
        T = findViewById(R.id.textView2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(E.getText().toString());
                double fc;
                 fc = 0.555*(temp-32);
                T.setText(String.valueOf(fc));
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double temp = Double.parseDouble(E.getText().toString());
               double cf;
               cf = (1.8*temp) + 32;
               T.setText(String.valueOf(cf));
           }
       });


        if(!(E.getText().toString().equals("")));
        {
            Toast.makeText(MainActivity.this, "Please enter Temp", Toast.LENGTH_LONG).show();
        }
    }
}