package com.example.activity_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
       //Intent intent = new Intent(this, SecondActivity.class);
       //String message = mMessageEditText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivityForResult(intent, TEXT_REQUEST);
    }
}