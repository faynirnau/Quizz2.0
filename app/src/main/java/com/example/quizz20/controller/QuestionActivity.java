package com.example.quizz20.controller;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.quizz20.R;
import com.example.quizz20.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    Button boutonA;
    Button boutonB;
    Button boutonC;
    Button boutonD;
    List<Question> questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        boutonA = findViewById(R.id.reponseA);
        boutonB = findViewById(R.id.reponseB);
        boutonC = findViewById(R.id.reponseC);
        boutonD = findViewById(R.id.reponseD);
        questions = generateurDeQuestion();
    }

    private List<Question> generateurDeQuestion(){
        Question question1 = new Question("Quelle est la couleur du cheval blanc d'Henri IV ?", Arrays.asList("Rouge", "Brun", "Blanc", "La réponse D"), 3);
        Question question2 = new Question("Quel est ce Pokemon ?", Arrays.asList("Racaillou", "Bulbizar", "Pikachu","Roucool"), 2);
        Question question3 = new Question("Comment s'appel le meilleur ami des developpeurs ?",Arrays.asList("ChatGPT", "Elon Musk", "Oussama Ammar", "StackOverflow"), 0);
        Question question4 = new Question("Céréale avant ou après le lait ?", Arrays.asList("avant", "après", "Je met du yaourt", "pas de lait, a sec !!!"), 3);
        return Arrays.asList(question1, question2, question3, question4);
    }
}