package com.volodiachornenkyy.daggermultiinjection.di;

import com.volodiachornenkyy.daggermultiinjection.business.MainMessage;
import com.volodiachornenkyy.daggermultiinjection.business.Message;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public Message message() {
        return new MainMessage();
    }
}