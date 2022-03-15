package com.example.artcasper;

import android.os.Bundle;
import java.util.List;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class ArtKitActivity extends AppCompatActivity {
    TextView details, details2, details3;
    LinearLayout hidden, hidden2, hidden3;
    CardView cardView, cardview2, cardview3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_kit);

        details=findViewById(R.id.detail_basic);
        hidden=findViewById(R.id.hidden_layout);
        cardView=findViewById(R.id.base_cardview);
        details2=findViewById(R.id.detail_advance);
        hidden2=findViewById(R.id.hidden_layout2);
        cardview2=findViewById(R.id.base_cardview2);
        details3=findViewById(R.id.detail_premium);
        hidden3=findViewById(R.id.hidden_layout3);
        cardview3=findViewById(R.id.base_cardview3);


        details.setOnClickListener(view -> {
            if(hidden.getVisibility() == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                hidden.setVisibility(View.GONE);
                details.setTextColor(getResources().getColor(R.color.secondaryTextColor));
            }else{
                TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                hidden.setVisibility(View.VISIBLE);
                details.setTextColor(getResources().getColor(R.color.primaryDarkColor));
            }
        });
        details2.setOnClickListener(view -> {
            if(hidden2.getVisibility() == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cardview2,new AutoTransition());
                hidden2.setVisibility(View.GONE);
                details2.setTextColor(getResources().getColor(R.color.secondaryTextColor));
            }else{
                TransitionManager.beginDelayedTransition(cardview2,new AutoTransition());
                hidden2.setVisibility(View.VISIBLE);
                details2.setTextColor(getResources().getColor(R.color.primaryDarkColor));
            }
        });
        details3.setOnClickListener(view -> {
            if(hidden3.getVisibility() == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cardview3,new AutoTransition());
                hidden3.setVisibility(View.GONE);
                details3.setTextColor(getResources().getColor(R.color.secondaryTextColor));
            }else{
                TransitionManager.beginDelayedTransition(cardview3,new AutoTransition());
                hidden3.setVisibility(View.VISIBLE);
                details3.setTextColor(getResources().getColor(R.color.primaryDarkColor));
            }
        });


    }
}
