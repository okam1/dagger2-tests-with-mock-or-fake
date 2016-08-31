package com.volodiachornenkyy.daggermultiinjection.di;

import com.volodiachornenkyy.daggermultiinjection.MainActivity;
import com.volodiachornenkyy.daggermultiinjection.business.Message;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {
    Message message();

    void inject(MainActivity mainActivity);
}