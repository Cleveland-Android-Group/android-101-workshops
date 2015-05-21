package com.daveshah.geoquiz;

import android.test.ActivityInstrumentationTestCase2;
import android.test.FlakyTest;

public class DeviceUsageTests extends ActivityInstrumentationTestCase2<QuizActivity> {

    private DeviceManipulator deviceManipulator;

    public DeviceUsageTests() {
        super(QuizActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        deviceManipulator = new DeviceManipulator(getInstrumentation(), getActivity(), 2);
    }

    @FlakyTest(tolerance = 1)
    public void testThatTheQuestionsAreRetainedWhenTheDeviceIsRotated() {
        deviceManipulator.waitForTheActivity(QuizActivity.class);

        deviceManipulator.rotateToPortrait();

        deviceManipulator.clickOnButtonWithText("next");

        String initialQuestion = deviceManipulator.getTextFromViewWithId(R.id.question_text_view);

        deviceManipulator.rotateToLandscape();

        String questionAfterRotation = deviceManipulator.getTextFromViewWithId(R.id.question_text_view);

        assertEquals("Expected the question to stay the same after device rotation", initialQuestion, questionAfterRotation);
    }

    @Override
    protected void tearDown() throws Exception {
        deviceManipulator.tearDown();
        super.tearDown();
    }
}
