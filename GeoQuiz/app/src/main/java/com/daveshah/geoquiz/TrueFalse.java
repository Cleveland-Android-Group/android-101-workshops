package com.daveshah.geoquiz;

public class TrueFalse {

    private final int questionResourceId;
    private final boolean answer;

    public TrueFalse(int questionResourceId, boolean answer) {
        this.questionResourceId = questionResourceId;
        this.answer = answer;
    }

    public int getQuestionResourceId() {
        return questionResourceId;
    }

    public boolean getAnswer() {
        return answer;
    }
}
