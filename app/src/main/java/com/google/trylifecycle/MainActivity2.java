package com.google.trylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    String scope = "MainActivity2";
    ImageView ivAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.v(scope,"masuk onCreate");
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        ivAlbum = findViewById(R.id.ivAlbum);

        try{
            Picasso.get().load(Uri.parse("http://i.imgur.com/DvpvklR.png")).into(ivAlbum);
//            Glide.with(this).load("http://goo.gl/gEgYUd").into(ivAlbum);
        }catch(Exception e){
            Log.v("picasso", e.getLocalizedMessage());
        }

//        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(ivAlbum);
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
}