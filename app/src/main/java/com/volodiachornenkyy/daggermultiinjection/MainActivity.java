package com.volodiachornenkyy.daggermultiinjection;

import android.os.Bundle;
import android.widget.TextView;

import com.volodiachornenkyy.daggermultiinjection.business.Message;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app.getMainComponent().inject(this);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(message.get());
    }
}
