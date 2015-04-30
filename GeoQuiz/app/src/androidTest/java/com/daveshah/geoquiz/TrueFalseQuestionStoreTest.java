package com.daveshah.geoquiz;

import android.test.AndroidTestCase;

public class TrueFalseQuestionStoreTest extends AndroidTestCase {


    public void testThatItProvides6Questions() {

        TrueFalseQuestionsStore trueFalseQuestionsStore = new TrueFalseQuestionsStore(getContext());

        int questionCount = trueFalseQuestionsStore.getTotalNumberOfQuestions();

        assertEquals("Expected the store to provide 6 questions", 6, questionCount);
    }

    public void testThatICanGetALegitimateQuestionBackFromTheQuestionStore() {

        TrueFalseQuestionsStore trueFalseQuestionsStore = new TrueFalseQuestionsStore(getContext());

        TrueFalseQuestion question = trueFalseQuestionsStore.getQuestionNumber(0);

        assertNotNull(question);
        assertFalse(question.getQuestion().isEmpty());
    }

    public void testThatItExceedsTheUpperBounds() {

        TrueFalseQuestionsStore trueFalseQuestionsStore = new TrueFalseQuestionsStore(getContext());

        TrueFalseQuestion question = trueFalseQuestionsStore.getQuestionNumber(-100);

        assertNotNull(question);
    }


}
