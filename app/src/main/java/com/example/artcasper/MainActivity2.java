package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.artcasper.activities.VehicleActivity;

public class MainActivity2 extends AppCompatActivity {

    ImageView profile;
    ConstraintLayout art,travel,hygine,health,shopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        art=findViewById(R.id.art_main);
        travel=findViewById(R.id.sqp_main);
        hygine=findViewById(R.id.sqh_main);
        health= findViewById(R.id.sqhealth_main);
        shopping=findViewById(R.id.sql_main);

        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        hygine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        profile=findViewById(R.id.userProfilePic);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,Profile.class));
            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,HomeActivity.class));
            }
        });
    }
}