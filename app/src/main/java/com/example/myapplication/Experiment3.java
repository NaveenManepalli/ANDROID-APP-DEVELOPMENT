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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Experiment3 extends AppCompatActivity {
    private EditText editTextAmount;
    private RadioGroup radioGroupType;
    private TextView textViewResult;
    private double weeklyExpense = 0.0;
    private double weeklyIncome = 0.0;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment3);
        editTextAmount = findViewById(R.id.editTextAmount);
        radioGroupType = findViewById(R.id.radioGroupType);
        textViewResult = findViewById(R.id.textViewResult);
    }
    public void onAddButtonClick(View view) {
        double amount;
        try {
            amount = Double.parseDouble(editTextAmount.getText().toString());
        } catch (NumberFormatException e) {
            amount = 0.0;
        }

        RadioButton radioButton =
                findViewById(radioGroupType.getCheckedRadioButtonId());
        String type = radioButton.getText().toString();
        if (type.equals("Expense")) {
            weeklyExpense += amount;
        } else {
            weeklyIncome += amount;
        }
        updateResultText();
    }

    private void updateResultText() {
        String resultText = "Weekly Expense: $" + weeklyExpense + "\nWeekly Income: $"
                + weeklyIncome;
        textViewResult.setText(resultText);
    }
}
