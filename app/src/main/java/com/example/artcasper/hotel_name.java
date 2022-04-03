package com.example.artcasper;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hotel_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_name);

        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.inside), 2000);
        animation.addFrame(getResources().getDrawable(R.drawable.zostel), 2000);
        animation.setOneShot(false);
        ImageView imageAnim =  (ImageView) findViewById(R.id.hotel_images);
        imageAnim.setBackgroundDrawable(animation);
        animation.start();

    }
}