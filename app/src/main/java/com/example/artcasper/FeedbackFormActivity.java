package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedbackFormActivity extends AppCompatActivity {

    Button submit_feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_form);
        submit_feedback = findViewById(R.id.submit_feedback);
        submit_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThankYouDialog thankYouDialog = new ThankYouDialog();
                thankYouDialog.show(getSupportFragmentManager(), "thank_you_dialog");
            }
        });
    }
}