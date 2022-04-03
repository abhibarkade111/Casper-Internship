package com.example.artcasper;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class CustomerRegisteration extends AppCompatActivity {
    ExpandableTextView etxt1,etxt2,etxt3;
    Button b1,b2,b3;
    Dialog d1,d2,d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_register);

        d1 = new Dialog(this);
        b1 = findViewById(R.id.covid);
        b2 = findViewById(R.id.property);
        b3 = findViewById(R.id.cancellation);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                covid();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                property();
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancellation();
            }
        });
    }
        private void covid() {
            d1.setContentView(R.layout.covid_dialog);
            d1.show();
        }
        private void property() {
            d1.setContentView(R.layout.property_dialog);
            d1.show();
        }
        private void cancellation() {
            d1.setContentView(R.layout.cancellation_policy);
            d1.show();
        }
}