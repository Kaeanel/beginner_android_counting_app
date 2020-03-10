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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        addNumberButton = findViewById(R.id.addNumberButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentCounterValue = counterTextView.getText().toString();
                String counter = counterManagerClass.addNumber(currentCounterValue);
                counterTextView.setText(counter);
            }
        };

        addNumberButton.setOnClickListener(listener);
    }
}
