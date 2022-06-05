package com.google.trylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String scope = "MainActivity";
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(scope,"masuk onCreate");

        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(scope,"masuk onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(scope,"masuk onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(scope,"masuk onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(scope,"masuk onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(scope,"masuk onDestroy");
    }

    @Override
    public void onClick(View view) {
        Intent niat = new Intent(this,MainActivity2.class);
        startActivity(niat);
    }
}