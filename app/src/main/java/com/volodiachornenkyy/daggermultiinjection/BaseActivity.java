package com.volodiachornenkyy.daggermultiinjection;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author chornenkyy@gmail.com
 * @since 8/30/16
 */

public class BaseActivity extends AppCompatActivity {

    protected App app;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        app = (App) getApplication();
    }
}
