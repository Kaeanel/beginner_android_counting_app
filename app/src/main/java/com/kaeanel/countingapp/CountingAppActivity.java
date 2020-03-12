package com.kaeanel.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountingAppActivity extends AppCompatActivity {
    private CounterManager counterManagerClass = new CounterManager();
    private TextView counterTextView;
    private Button addNumberButton;
    private Button subtractNumberButton;
    private Button restartCounterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        addNumberButton = findViewById(R.id.addNumberButton);
        subtractNumberButton = findViewById(R.id.substractNumberButton);
        restartCounterButton = findViewById(R.id.restartCounterButton);

        View.OnClickListener addNumberListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentCounterValue = counterTextView.getText().toString();
                String counter = counterManagerClass.addNumber(currentCounterValue);
                counterTextView.setText(counter);
            }
        };

        View.OnClickListener subtractNumberListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentCounterValue = counterTextView.getText().toString();
                String counter = counterManagerClass.subtractNumber(currentCounterValue);
                counterTextView.setText(counter);
            }
        };

        View.OnClickListener restartCounterListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String counter = counterManagerClass.restartCounter();
                counterTextView.setText(counter);
            }
        };

        addNumberButton.setOnClickListener(addNumberListener);
        subtractNumberButton.setOnClickListener(subtractNumberListener);
        restartCounterButton.setOnClickListener(restartCounterListener);
    }
}
