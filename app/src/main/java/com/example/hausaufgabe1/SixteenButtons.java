package com.example.hausaufgabe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class SixteenButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the ScrollView
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);

// Create a LinearLayout element
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

// Add Buttons
        Button button = new Button(this);
        button.setText("BUTTON 1");
        linearLayout.addView(button);

// Add the LinearLayout element to the ScrollView
        scrollView.addView(linearLayout);
    }

}

