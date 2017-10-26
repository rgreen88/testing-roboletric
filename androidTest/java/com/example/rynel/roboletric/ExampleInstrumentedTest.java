package com.example.rynel.roboletric;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.rynel.testing", appContext.getPackageName());
    }

    int first, second, result;

    @Before
    public void setup() {

        first = 10;
        second = 20;
        result = 30;

    }

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void addition_isCorrect() {

        //add value to the first edittext
        onView(withId(R.id.etFirstNumber))
                .perform(typeText(String.valueOf(first)),
                        ViewActions.closeSoftKeyboard());

        //add value to the second edittext
        onView(withId(R.id.etSecondNumber))
                .perform(typeText(String.valueOf(second)),
                        ViewActions.closeSoftKeyboard());
    }

    @Test
    public void test_intent(){

        //add value to first edit tect
        onView(withId(R.id.etFirstNumber))
                .perform(typeText(String.valueOf(first)), ViewActions.closeSoftKeyboard());

        //add value to second edit tect
        onView(withId(R.id.etSecondNumber))
                .perform(typeText(String.valueOf(second)), ViewActions.closeSoftKeyboard());

        //add value to btn text
//        onView(withId(R.id.btnSendResult))
//                .perform(typeText(String.valueOf(first)), ViewActions.closeSoftKeyboard());


    }


}
