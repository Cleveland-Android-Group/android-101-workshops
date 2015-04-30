package com.daveshah.geoquiz;

import android.test.AndroidTestCase;

public class QuestionTests extends AndroidTestCase {

    public void testThatItProvides6Questions() {
        QuestionBank questionBank = new QuestionBank(getContext());

        int questionCount = questionBank.getQuestionCount();

        assertEquals(6, questionCount);
    }

    public void testThatItCanObtainAQuestionByItsNumber() {
        QuestionBank questionBank = new QuestionBank(getContext());

        TrueFalse trueFalseQuestion = questionBank.questionNumber(1);

        assertNotNull(trueFalseQuestion);
    }

    public void testThatNumbersStartWith1() {
        QuestionBank questionBank = new QuestionBank(getContext());

        TrueFalse trueFalseQuestion = questionBank.questionNumber(0);

        assertNull(trueFalseQuestion);
    }
}
