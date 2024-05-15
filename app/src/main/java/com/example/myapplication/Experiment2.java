package com.example.myapplication;

import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Experiment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment2);

        final EditText editTextWeight = findViewById(R.id.editTextWeight);
        final EditText editTextHeight = findViewById(R.id.editTextHeight);
        final Button buttonCalculate = findViewById(R.id.buttonCalculate);
        final TextView textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = editTextWeight.getText().toString();
                String heightStr = editTextHeight.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    float weight = Float.parseFloat(weightStr);
                    float height = Float.parseFloat(heightStr);
                    float bmi = calculateBMI(weight, height);
                    String result = String.format("Your BMI is %.2f", bmi);
                    textViewResult.setText(result);
                } else {
                    textViewResult.setText("Please enter weight and height.");
                }
            }
        });
    }

    private float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }
}