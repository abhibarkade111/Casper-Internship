package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class    Online_payment extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment);
        l1=findViewById(R.id.scan);
        l2=findViewById(R.id.mobile_recharge);
        l3=findViewById(R.id.dth_recharge);
        l4=findViewById(R.id.light_bill);
        l5=findViewById(R.id.home_rent);
        l6=findViewById(R.id.cable_recharge);
        l7=findViewById(R.id.water_bill);
        l8=findViewById(R.id.piped_gas);
        l9=findViewById(R.id.gas_bill);

        l10=findViewById(R.id.donate);
        l11=findViewById(R.id.education);
        l12=findViewById(R.id.fasttag);

        l13=findViewById(R.id.health_insurance);
        l14=findViewById(R.id.bike_insurance);
        l15=findViewById(R.id.car_insurance);


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Online_payment.this,Scan.class);
                startActivity(i);
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/mobileRecharge?ref_=apay_deskhome_MobileRecharge"));
                startActivity(i);
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/dth?ref_=apay_deskhome_DTH"));
                startActivity(i);
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/electricity?ref_=apay_deskhome_Electricity"));
                startActivity(i);
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Online_payment.this,Rent.class);
                startActivity(i);
            }
        });


        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/cable_tv?ref_=apay_deskhome_CableTV"));
                startActivity(i);
            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/water?ref_=apay_deskhome_Water"));
                startActivity(i);
            }
        });


        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/gas?ref_=apay_deskhome_PipedGas"));
                startActivity(i);
            }
        });

        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/lpg?ref_=apay_deskhome_LPG"));
                startActivity(i);
            }
        });

        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/b?node=26163663031&ref_=apay_deskhome_Covid"));
                startActivity(i);
            }
        });

        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/education_fee?ref_=apay_deskhome_EducationFees"));
                startActivity(i);
            }
        });

        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/fastag?ref_=apay_deskhome_Amazon%20Pay%20ICICI%20Fastag"));
                startActivity(i);
            }
        });

        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/hfc/bill/insurance?ref_=apay_deskhome_Insurance"));
                startActivity(i);

            }
        });


        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/auto-insurance/bike?ref_=apay_deskhome_BikeInsurance"));
                startActivity(i);
            }
        });

        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/auto-insurance/car?ref_=apay_deskhome_CarInsurance"));
                startActivity(i);
            }
        });

    }
}