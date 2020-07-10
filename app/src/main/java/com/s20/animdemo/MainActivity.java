package com.s20.animdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable bats;

    ImageView imageView;
    public void anim(View v) {

        Log.d("TAG", "fade: ");


//        imageView.animate().alpha(0).setDuration(2000);
//        imageView.animate().translationXBy(-1500).setDuration(2000);
//        imageView.animate().translationYBy(-1500).setDuration(2000);
//        imageView.animate().rotation(180).setDuration(2000);

        imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);


        /*bats = (AnimationDrawable) imageView.getBackground();
        // animate animation drawables
        bats.start();*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.anim);
    }
}
