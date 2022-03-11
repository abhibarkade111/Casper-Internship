package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LeadCampusProgramActivity extends AppCompatActivity {

    ImageView qr_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead_campus_program);
        qr_button  =findViewById(R.id.qr_button_campus);
        qr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LeadCampusProgramActivity.this, ScanQrCodeActivity.class));
            }
        });
    }
}