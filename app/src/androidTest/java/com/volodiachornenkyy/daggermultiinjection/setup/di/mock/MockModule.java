package com.volodiachornenkyy.daggermultiinjection.setup.di.mock;

import com.volodiachornenkyy.daggermultiinjection.business.MainMessage;
import com.volodiachornenkyy.daggermultiinjection.business.Message;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module
public class MockModule {

    @Provides
    @Singleton
    public Message message() {
        return mock(MainMessage.class);
    }
}