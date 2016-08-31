package com.volodiachornenkyy.daggermultiinjection.setup.di.mock;

import com.volodiachornenkyy.daggermultiinjection.ExampleInstrumentedTest;
import com.volodiachornenkyy.daggermultiinjection.business.Message;
import com.volodiachornenkyy.daggermultiinjection.di.MainComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MockModule.class)
public interface MockComponent extends MainComponent {
    Message message();

    void inject(ExampleInstrumentedTest exampleInstrumentedTest);
}