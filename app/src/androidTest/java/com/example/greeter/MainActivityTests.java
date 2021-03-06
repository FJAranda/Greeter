package com.example.greeter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by usuario on 9/11/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTests {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testGreet(){
        onView(withId(R.id.greetEditText)).perform(typeText("Javi"), closeSoftKeyboard());
        onView(withText("Greet")).perform(click());
        onView(withId(R.id.messageTextView)).check(matches(withText("Hello, Javi!")));
    }
}
