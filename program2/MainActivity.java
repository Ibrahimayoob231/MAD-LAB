package com.example.activtylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","oncreate invoked");
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("lifecycle", "onStart invoked ");

    }
    protected void onResume()
    {
        super.onResume();
        Log.d("lifecycle", "onResume: ");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("lifecycle", "onPause: ");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("lifecycle", "onStop: ");

    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("lifecycle", "onRestart: ");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy: ");
    }
}