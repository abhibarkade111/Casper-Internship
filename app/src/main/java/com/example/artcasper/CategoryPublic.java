package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CategoryPublic extends AppCompatActivity {
    TextView findNearToilet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_public);
        getSupportActionBar().hide();
        findNearToilet = findViewById(R.id.findNearToiletPublic);
        findNearToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryPublic.this, FindNearToilet.class));
            }
        });
    }
}