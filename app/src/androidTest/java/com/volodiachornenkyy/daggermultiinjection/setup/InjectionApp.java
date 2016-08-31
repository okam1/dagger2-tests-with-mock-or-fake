package com.volodiachornenkyy.daggermultiinjection.setup;

import com.volodiachornenkyy.daggermultiinjection.App;
import com.volodiachornenkyy.daggermultiinjection.di.MainComponent;
import com.volodiachornenkyy.daggermultiinjection.setup.di.fake.DaggerFakeComponent;
import com.volodiachornenkyy.daggermultiinjection.setup.di.mock.DaggerMockComponent;

public class InjectionApp extends App {

    @Override
    protected MainComponent initComponent() {
//        return DaggerFakeComponent.create();
        return DaggerMockComponent.create();
    }
}
