package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.artcasper.activities.VehicleActivity;

public class MainActivity2 extends AppCompatActivity {

    ConstraintLayout art,vehicle,bagearn,travel,meet,more,wallet,rewards,sos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        art=findViewById(R.id.art_main);
        vehicle=findViewById(R.id.vehicle_main);
        bagearn=findViewById(R.id.bag_earn);
        travel=findViewById(R.id.travel);
        wallet=findViewById(R.id.wallet);
        rewards=findViewById(R.id.rewards);
        sos=findViewById(R.id.sos_report);
        meet=findViewById(R.id.meet_aid);


        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,WomenTravelActivity.class));
            }
        });
        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, VehicleActivity.class));
            }
        });

        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,SOSelectionActivity.class));
            }
        });

        meet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,TherapistActivity.class));
            }
        });

        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,Rewards_Scratch.class));
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,Online_payment.class));
            }
        });
    }
}