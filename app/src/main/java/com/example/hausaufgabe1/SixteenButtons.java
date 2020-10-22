package com.example.hausaufgabe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class SixteenButtons extends AppCompatActivity {

    public int btnAmount = 16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Add Buttons
        LinearLayout mainView = (LinearLayout) findViewById(R.id.sixteenLayout);
        for (int i = 0; i< btnAmount; i++){
            Button button = new Button (this);
            button.setText("BUTTON " + (i+1));
            button.setId(i);
            //button.setOnClickListener((View.OnClickListener) this);
            mainView.addView(button);
        }
    }
}