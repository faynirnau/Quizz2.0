package com.example.quizz20.model;

import java.util.List;

public class Question {
    private final String question;
    private final List<String> reponses;
    private final int indexReponse;

    public Question(String question, List<String> reponses, int indexReponse) {
        this.question = question;
        this.reponses = reponses;
        this.indexReponse = indexReponse;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getReponses() {
        return reponses;
    }

    public int getIndexReponse() {
        return indexReponse;
    }
}
