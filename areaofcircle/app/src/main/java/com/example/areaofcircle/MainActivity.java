package com.example.areaofcircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRadius;
    private TextView textViewArea;
    private TextView textViewCircumference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRadius = findViewById(R.id.editTextRadius);
        textViewArea = findViewById(R.id.textViewArea);
        textViewCircumference = findViewById(R.id.textViewCircumference);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAndDisplay();
            }
        });
    }

    private void calculateAndDisplay() {
        String radiusText = editTextRadius.getText().toString().trim();

        if (!radiusText.isEmpty()) {
            double radius = Double.parseDouble(radiusText);
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            textViewArea.setText("Area: " + area);
            textViewCircumference.setText("Circumference: " + circumference);
        } else {
            // Handle invalid input (e.g., empty input)
            textViewArea.setText("Area: ");
            textViewCircumference.setText("Circumference: ");
        }
    }
}