package com.volodiachornenkyy.daggermultiinjection.business;

/**
 * @author chornenkyy@gmail.com
 * @since 8/30/16
 */

public class MainMessage implements Message {
    @Override
    public String get() {
        return "main";
    }
}
