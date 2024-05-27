package com.example.notemania;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class logintestUI {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testwithoutinputs()
    {
        Espresso.onView(ViewMatchers.withId(R.id.login)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithoutemail()
    {
        Espresso.onView(ViewMatchers.withId(R.id.loginemail)).perform(ViewActions.typeText(""));
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithoutpass()
    {
        Espresso.onView(ViewMatchers.withId(R.id.loginpassword)).perform(ViewActions.typeText(""));
        Espresso.onView(ViewMatchers.withText("All fields are required"));
    }
    @Test
    public void testwithallinputs()
    {
        Espresso.onView(ViewMatchers.withId(R.id.loginemail)).perform(ViewActions.typeText("test@gmail.com"));
        Espresso.onView(ViewMatchers.withId(R.id.loginpassword)).perform(ViewActions.typeText("test"));
        Espresso.onView(ViewMatchers.withText("Logged In"));
    }



}
