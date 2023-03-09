package com.example.quizz20.controller;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.quizz20.R;

public class MainActivity extends AppCompatActivity {
    private TextView nomAppTextView;
    private EditText nomJoueurEditText;
    private Button boutonStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomAppTextView = findViewById(R.id.nomAppTextView);
        nomJoueurEditText = findViewById(R.id.nomJoueurEditText);
        boutonStart = findViewById(R.id.StartButton);
        boutonStart.setEnabled(false);
        nomJoueurEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // This is where we'll check the user input
                boutonStart.setEnabled(!s.toString().isEmpty());
            }
        });
        boutonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}