package com.daveshah.geoquiz;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {

    private Context context;

    public QuestionBank(Context context) {
        this.context = context;
    }

    public List<TrueFalse> getAllQuestions() {
        return Arrays.asList(
                new TrueFalse(context.getString(R.string.question_oceans), true),
                new TrueFalse(context.getString(R.string.question_mideast), false),
                new TrueFalse(context.getString(R.string.question_java), true),
                new TrueFalse(context.getString(R.string.question_monkey), false),
                new TrueFalse(context.getString(R.string.question_quest), true),
                new TrueFalse(context.getString(R.string.question_assyria), false)
        );
    }
}
