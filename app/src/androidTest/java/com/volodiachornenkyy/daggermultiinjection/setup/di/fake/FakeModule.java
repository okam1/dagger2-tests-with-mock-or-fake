package com.volodiachornenkyy.daggermultiinjection.setup.di.fake;

import com.volodiachornenkyy.daggermultiinjection.business.FakeMessage;
import com.volodiachornenkyy.daggermultiinjection.business.Message;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeModule {

    @Provides
    public Message message() {
        return new FakeMessage();
    }
}