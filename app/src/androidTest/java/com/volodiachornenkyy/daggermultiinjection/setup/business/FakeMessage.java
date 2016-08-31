package com.volodiachornenkyy.daggermultiinjection.business;

public class FakeMessage implements Message {
    @Override
    public String get() {
        return "fake";
    }
}
