package com.ks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Log.d("LifeActivity","onCreate....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeActivity","onStart....");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeActivity","onResume....");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeActivity","onPause....");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeActivity","onStop....");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeActivity","onRestart....");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeActivity","onDestroy....");

    }
}
