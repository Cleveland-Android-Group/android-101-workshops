package com.daveshah.geoquiz;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class TrueFalseQuestionsStore {

    private final List<TrueFalseQuestion> questionList;

    public TrueFalseQuestionsStore(Context context) {
        this.questionList = Arrays.asList(
                new TrueFalseQuestion(context.getString(R.string.question_oceans), true),
                new TrueFalseQuestion(context.getString(R.string.question_mideast), false),
                new TrueFalseQuestion(context.getString(R.string.question_java), true),
                new TrueFalseQuestion(context.getString(R.string.question_monkey), false),
                new TrueFalseQuestion(context.getString(R.string.question_quest), true),
                new TrueFalseQuestion(context.getString(R.string.question_assyria), false)
        );
    }

    public int getTotalNumberOfQuestions() {
        return questionList.size();
    }

    public TrueFalseQuestion getQuestionNumber(int i) {
        int index = i % questionList.size();
        return questionList.get(abs(index));
    }
}
