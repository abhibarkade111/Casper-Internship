package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout publicMain,privateMain,upload_location, safe_school, lead_campus;
    TextView HomeUseName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        publicMain = findViewById(R.id.publicMain);
        privateMain = findViewById(R.id.privateMain);
        upload_location = findViewById(R.id.upload_location);
        safe_school  =findViewById(R.id.safe_school);
        lead_campus  =findViewById(R.id.lead_campus);
        HomeUseName = findViewById(R.id.homeUserName);
        SharedPreferences preferences = getSharedPreferences("ART",MODE_PRIVATE);
        String UserName = preferences.getString("UserName","User");
        HomeUseName.setText(UserName);
        publicMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CategoryPublic.class));
            }
        });
        privateMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CategoryPrivate.class));
            }
        });
        upload_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,UploadLocationActivity.class));
            }
        });
        safe_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SafeSchoolProgramActivity.class));
            }
        });
        lead_campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LeadCampusProgramActivity.class));
            }
        });
    }
}