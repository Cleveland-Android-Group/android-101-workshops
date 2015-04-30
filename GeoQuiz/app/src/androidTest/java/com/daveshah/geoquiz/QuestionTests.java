package com.daveshah.geoquiz;

import android.test.AndroidTestCase;

import java.util.List;

public class QuestionTests extends AndroidTestCase {

    public void testThatItProvides6Questions() {
        QuestionBank questionBank = new QuestionBank(getContext());

        List<TrueFalse> questions = questionBank.getAllQuestions();

        assertEquals(6, questions.size());
    }
}
