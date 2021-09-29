package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView OurText;
    Button TheButton;
    Button TheButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the variables to the Layout file
        OurText = findViewById(R.id.textView);
        TheButton = findViewById(R.id.button);

        //Setting the OnClick Listener
        TheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // What we want to display when button is clicked
                OurText.setText("The Button was Clicked!");
            }
        });
        //setting the variables to the Layout file
        TheButton2 = findViewById(R.id.button2);

        //Setting the OnClick Listener
        TheButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                OurText.setTextColor(Color.rgb(200,0,0));
            }
        });
    }
}