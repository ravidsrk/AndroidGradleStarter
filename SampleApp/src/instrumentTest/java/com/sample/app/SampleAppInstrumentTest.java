package com.sample.app;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.squareup.spoon.Spoon;

public class SampleAppInstrumentTest extends ActivityInstrumentationTestCase2<FirstActivity> {
    private Solo solo;

    public SampleAppInstrumentTest() {
        super(FirstActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStartSecondActivity() throws Exception {
        final String fieldValue = "Droidcon Workshop";

        Spoon.screenshot(getActivity(), "initial_state");

        // Set a value into the text field
        solo.enterText((EditText) solo.getView(R.id.etResult), fieldValue);

        Spoon.screenshot(getActivity(), "before_button_clicked");
        // find button and click it
        solo.clickOnButton("Launch");
        // or solo.clickOnView(solo.getView(R.id.btnLaunch));

        // Wait 2 seconds for the start of the activity
        solo.waitForActivity(SecondActivity.class, 2000);
        solo.assertCurrentActivity("Should be second activity", SecondActivity.class);

        Spoon.screenshot(solo.getCurrentActivity(), "second_state");

        // Search for the textView
        TextView textView = (TextView) solo.getView(R.id.tvResult);

        // Validate the text on the TextView
        assertEquals("Text should be the field value", fieldValue,
                textView.getText().toString());
    }

    @Override
    public void tearDown() throws Exception {
        try {
            solo.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        getActivity().finish();
        super.tearDown();
    }
}
