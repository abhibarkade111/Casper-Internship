package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CategoryPrivate extends AppCompatActivity {
    TextView privateToilet, private7star, private5star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_private);
        getSupportActionBar().hide();
        privateToilet = findViewById(R.id.findNearToiletPrivate1);
        private5star = findViewById(R.id.findNearToiletPrivate2);
        private7star = findViewById(R.id.findNearToiletPrivate3);
        privateToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryPrivate.this, FindNearToilet.class));
            }
        });
        private5star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryPrivate.this, FindNearToilet.class));
            }
        });
        private7star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryPrivate.this, FindNearToilet.class));
            }
        });
    }
}