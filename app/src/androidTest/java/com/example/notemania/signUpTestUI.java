package com.example.notemania;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class signUpTestUI {

    @Rule
    public ActivityScenarioRule<signup> activityScenarioRule = new ActivityScenarioRule<>(signup.class);

    @Test
    public void testwithoutinput()
    {
        Espresso.onView(ViewMatchers.withId(R.id.signup)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithoutemail()
    {
        Espresso.onView(ViewMatchers.withId(R.id.signupemail)).perform(ViewActions.typeText(""));
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithoutpass()
    {
        Espresso.onView(ViewMatchers.withId(R.id.signuppassword)).perform(ViewActions.typeText(""));
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithallinputs()
    {
        Espresso.onView(ViewMatchers.withId(R.id.signupemail)).perform(ViewActions.typeText("test@gmail.com"));
        Espresso.onView(ViewMatchers.withId(R.id.signuppassword)).perform(ViewActions.typeText("test"));
        Espresso.onView(ViewMatchers.withText("Registration Successful"));
    }
}