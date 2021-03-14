package com.example.myapp_rr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bHi, bBye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bHi=(Button)findViewById(R.id.b_hi);
        bBye=(Button)findViewById(R.id.b_bye);

        bHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewHiRaki = (TextView) findViewById(R.id.text_hi_raki);
                textViewHiRaki.setText("Hi Raki!");
            }
        });

        bBye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewHiRaki = (TextView) findViewById(R.id.text_hi_raki);
                textViewHiRaki.setText("Bye Raki!");
            }
        });
    }
}