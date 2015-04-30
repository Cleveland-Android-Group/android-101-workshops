package com.daveshah.geoquiz;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {

    private final Context context;
    private final List<TrueFalse> questions;

    public QuestionBank(Context context) {
        this.context = context;
        this.questions = Arrays.asList(
                new TrueFalse(context.getString(R.string.question_oceans), true),
                new TrueFalse(context.getString(R.string.question_mideast), false),
                new TrueFalse(context.getString(R.string.question_java), true),
                new TrueFalse(context.getString(R.string.question_monkey), false),
                new TrueFalse(context.getString(R.string.question_quest), true),
                new TrueFalse(context.getString(R.string.question_assyria), false)
        );
    }

    public TrueFalse questionNumber(int i) {
        try {
            return questions.get(i);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }

    }

    public int getQuestionCount() {
        return questions.size();
    }
}
