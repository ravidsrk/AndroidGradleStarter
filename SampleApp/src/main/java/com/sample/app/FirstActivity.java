package com.sample.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends ActionBarActivity {

    EditText etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        etResult = (EditText) findViewById(R.id.etResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }

    public void onLaunch(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("result", etResult.getText().toString());
        startActivity(i);
    }
}
