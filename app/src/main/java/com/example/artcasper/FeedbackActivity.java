package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class FeedbackActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ratingBar = findViewById(R.id.rating_bar);
        submit= findViewById(R.id.sub_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                if(rating>3){
                ThankYouDialog thankYouDialog = new ThankYouDialog();
                thankYouDialog.show(getSupportFragmentManager(), "thank_you_dialog");}
                else{
                    startActivity(new Intent(FeedbackActivity.this, FeedbackFormActivity.class));
                }
            }
        });

    }
}