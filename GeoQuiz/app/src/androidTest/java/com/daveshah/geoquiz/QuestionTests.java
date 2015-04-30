package com.daveshah.geoquiz;

import android.test.AndroidTestCase;

public class QuestionTests extends AndroidTestCase {

    public void testThatItProvides6Questions() {
        QuestionBank questionBank = new QuestionBank(getContext());

        int questionCount = questionBank.getQuestionCount();

        assertEquals(6, questionCount);
    }

    public void testThatItCanObtainAQuestionByItsIndex() {
        QuestionBank questionBank = new QuestionBank(getContext());

        TrueFalse trueFalseQuestion = questionBank.questionNumber(0);

        assertNotNull(trueFalseQuestion);
    }

    public void testThatNumbersStartWith0() {
        QuestionBank questionBank = new QuestionBank(getContext());

        TrueFalse trueFalseQuestion = questionBank.questionNumber(-1);

        assertNull(trueFalseQuestion);
    }
}
