package com.example.artcasper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SOSelectionActivity extends AppCompatActivity {
    ImageButton SOSButton, EmergencyButton, ReportButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_aid);
        SOSButton = findViewById(R.id.sos_but);
        EmergencyButton = findViewById(R.id.emergency);
        ReportButton = findViewById(R.id.complaint);

        SOSButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SOSActivity.class);
                startActivity(intent);
            }
        });

        EmergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),EmergencyContactActivity.class);
                startActivity(intent);
            }
        });

        ReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ComplaintSelectionActivity.class);
                startActivity(intent);
            }
        });
//        therapistButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(getApplicationContext(),TherapistActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}