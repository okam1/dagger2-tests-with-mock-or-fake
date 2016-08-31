package com.volodiachornenkyy.daggermultiinjection;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.volodiachornenkyy.daggermultiinjection.business.Message;
import com.volodiachornenkyy.daggermultiinjection.setup.InjectionApp;
import com.volodiachornenkyy.daggermultiinjection.setup.di.mock.MockComponent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import javax.inject.Inject;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Inject
    Message message;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, false);

    @Before
    public void before() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        InjectionApp app
                = (InjectionApp) instrumentation.getTargetContext().getApplicationContext();
        MockComponent component = (MockComponent) app.getMainComponent();
        component.inject(this);
    }


    @Test
    public void useAppContext() {

        System.out.println();

        Mockito.when(message.get()).thenReturn("mock");

        activityTestRule.launchActivity(new Intent());

        Espresso.onView(ViewMatchers.withId(R.id.text))
                .check(ViewAssertions.matches(ViewMatchers.withText("mock")));
    }
}
