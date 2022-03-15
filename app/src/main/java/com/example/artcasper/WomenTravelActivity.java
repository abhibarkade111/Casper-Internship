package com.example.artcasper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class WomenTravelActivity extends AppCompatActivity {
    CardView bookButton, artkitbutton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        bookButton=findViewById(R.id.booking_button);
        artkitbutton=findViewById(R.id.art_kit_button);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TravelActivity.class);
                startActivity(intent);
            }
        });
        artkitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ArtKitActivity.class);
                startActivity(intent);
            }
        });

    }
}
