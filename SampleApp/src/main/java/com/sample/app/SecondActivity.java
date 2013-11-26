package com.sample.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity{
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String result = getIntent().getStringExtra("result");
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvResult.setText(result);
    }
}