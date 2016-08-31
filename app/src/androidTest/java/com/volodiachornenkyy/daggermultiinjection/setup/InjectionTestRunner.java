package com.volodiachornenkyy.daggermultiinjection.setup;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

public class InjectionTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(
            ClassLoader cl, String className, Context context)
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {
        return super.newApplication(
                cl, InjectionApp.class.getName(), context);
    }
}