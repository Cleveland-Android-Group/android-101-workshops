package com.daveshah.geoquiz;

import android.app.Activity;
import android.app.Instrumentation;
import android.widget.TextView;

import com.robotium.solo.Solo;

import java.util.concurrent.TimeUnit;

/**
 * Created by daveshah on 5/20/15.
 */
public class DeviceManipulator {

    private final Solo device;
    private int durationToSleepInMilliseconds;

    public DeviceManipulator(Instrumentation instrumentation, Activity activity,int secondsBetweenActions) {
        this.durationToSleepInMilliseconds = secondsBetweenActions * 1000;
        this.device = new Solo(instrumentation,activity);
    }

    public void waitForTheActivity(Class<? extends Activity> quizActivityClass) {
        this.device.waitForActivity(quizActivityClass);

    }

    public void clickOnButtonWithText(String next) {
        this.device.clickOnButton(next);
        device.sleep(durationToSleepInMilliseconds);
    }

    public String getTextFromViewWithId(int id) {
        TextView questionView = (TextView) device.getView(id);
        return questionView.getText().toString();
    }

    public void rotateToLandscape() {
        device.setActivityOrientation(Solo.LANDSCAPE);
        device.sleep(durationToSleepInMilliseconds);
    }

    public void rotateToPortrait() {
        device.setActivityOrientation(Solo.PORTRAIT);
        device.sleep(durationToSleepInMilliseconds);
    }

    public void tearDown() {
        device.finishOpenedActivities();
    }
}
