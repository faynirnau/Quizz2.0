package com.example.quizz20.controller;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.quizz20.R;

public class QuestionActivity extends AppCompatActivity {

    Button boutonA;
    Button boutonB;
    Button boutonC;
    Button boutonD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        boutonA = findViewById(R.id.reponseA);
        boutonB = findViewById(R.id.reponseB);
        boutonC = findViewById(R.id.reponseC);
        boutonD = findViewById(R.id.reponseD);
    }
}