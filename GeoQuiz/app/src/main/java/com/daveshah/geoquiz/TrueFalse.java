package com.daveshah.geoquiz;

public class TrueFalse {

    private String question;
    private final boolean answer;

    public TrueFalse(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
