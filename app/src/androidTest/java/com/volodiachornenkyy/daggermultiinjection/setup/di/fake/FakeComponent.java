package com.volodiachornenkyy.daggermultiinjection.setup.di.fake;

import com.volodiachornenkyy.daggermultiinjection.ExampleInstrumentedTest;
import com.volodiachornenkyy.daggermultiinjection.business.Message;
import com.volodiachornenkyy.daggermultiinjection.di.MainComponent;
import com.volodiachornenkyy.daggermultiinjection.setup.di.mock.MockModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MockModule.class)
public interface FakeComponent extends MainComponent {
    Message message();

    void inject(ExampleInstrumentedTest exampleInstrumentedTest);
}