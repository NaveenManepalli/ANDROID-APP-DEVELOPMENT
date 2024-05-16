package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Experiment4 extends AppCompatActivity {
    private EditText editTextInput;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment4);

        editTextInput = findViewById(R.id.editTextInput);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertKmToMiles(View view) {
        try {
            double kilometers = Double.parseDouble(editTextInput.getText().toString());
            double miles = kilometers * 0.621371;
            textViewResult.setText(kilometers + " kilometers is equal to " + miles + " miles.");
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input. Please enter a valid number.");
        }
    }

    public void convertKgToPounds(View view) {
        try {
            double kilograms = Double.parseDouble(editTextInput.getText().toString());
            double pounds = kilograms * 2.20462;
            textViewResult.setText(kilograms + " kilograms is equal to " + pounds + " pounds.");
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input. Please enter a valid number.");
        }
    }
}
