package com.example.edu.myactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "States";
    final String ACTIVITY = "MainActivity:";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,ACTIVITY+"onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,ACTIVITY+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,ACTIVITY+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,ACTIVITY+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,ACTIVITY+"onDestroy");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
