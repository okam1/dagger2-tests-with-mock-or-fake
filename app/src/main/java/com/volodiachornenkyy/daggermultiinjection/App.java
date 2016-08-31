package com.volodiachornenkyy.daggermultiinjection;

import android.app.Application;

import com.volodiachornenkyy.daggermultiinjection.di.DaggerMainComponent;
import com.volodiachornenkyy.daggermultiinjection.di.MainComponent;

/**
 * @author chornenkyy@gmail.com
 * @since 8/30/16
 */

public class App extends Application {

    private final MainComponent mainComponent = initComponent();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }

    protected MainComponent initComponent() {
        return DaggerMainComponent.create();
    }
}
