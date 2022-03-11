package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout publicMain,privateMain,upload_location, safe_school, lead_campus;
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