package com.example.artcasper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ComplaintSelectionActivity extends AppCompatActivity {
    CardView policeButton, instituteButton, domesticVoilenceButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_option);
        policeButton=findViewById(R.id.police_button);
        instituteButton=findViewById(R.id.institution_button);
        domesticVoilenceButton=findViewById(R.id.domestic_violence_button);

        policeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ComplaintReportActivity.class);
                startActivity(intent);
            }
        });
        instituteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),InstituteComplaintActivity.class);
                startActivity(intent);
            }
        });
        domesticVoilenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ComplaintReportActivity.class);
                startActivity(intent);
            }
        });
    }
}
