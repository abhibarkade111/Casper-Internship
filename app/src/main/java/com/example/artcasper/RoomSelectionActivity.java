package com.example.artcasper;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.RoomAdapter;
import com.example.artcasper.RoomData;

import java.util.ArrayList;

public class RoomSelectionActivity extends AppCompatActivity {
    ArrayList<RoomData> roomData=new ArrayList<>();
    TextView covidbutton, propertybutton, cancellationbutton;
    TextView covidHiddenButton, proppertyHiddenButton, cancellationHiddenBUtton;
    TextView startdate,enddate;
    String start,end;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
        Intent intent=getIntent();
        start=intent.getStringExtra("start_date");
        end=intent.getStringExtra("end_date");

        covidbutton=findViewById(R.id.covid_policy);
        propertybutton=findViewById(R.id.proprty_policy);
        cancellationbutton=findViewById(R.id.cancellation_policy);
        covidHiddenButton=findViewById(R.id.covid_policy_hidden);
        proppertyHiddenButton=findViewById(R.id.property_policy_hidden);
        cancellationHiddenBUtton=findViewById(R.id.cancellation_policy_hidden);
        startdate=findViewById(R.id.start_date_selected);
        enddate=findViewById(R.id.end_date_selected);

        startdate.setText(start);
        enddate.setText(end);

        covidbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(covidHiddenButton.getVisibility()==View.VISIBLE){
//                    TransitionManager.beginDelayedTransition(covidbutto,new AutoTransition());
                    covidHiddenButton.setVisibility(View.GONE);
                    covidbutton.setTextColor(getResources().getColor(R.color.black));
                }else{
                    covidHiddenButton.setVisibility(View.VISIBLE);
                    covidbutton.setTextColor(getResources().getColor(R.color.primaryDarkColor));
                }
            }
        });
        propertybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(proppertyHiddenButton.getVisibility()==View.VISIBLE){
                    proppertyHiddenButton.setVisibility(View.GONE);
                    propertybutton.setTextColor(getResources().getColor(R.color.black));
                }else{
                    proppertyHiddenButton.setVisibility(View.VISIBLE);
                    propertybutton.setTextColor(getResources().getColor(R.color.primaryDarkColor));
                }
            }
        });
        cancellationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cancellationHiddenBUtton.getVisibility()==View.VISIBLE){

                    cancellationHiddenBUtton.setVisibility(View.GONE);
                    cancellationbutton.setTextColor(getResources().getColor(R.color.black));
                }else{
                    cancellationHiddenBUtton.setVisibility(View.VISIBLE);
                    cancellationbutton.setTextColor(getResources().getColor(R.color.primaryDarkColor));
                }
            }
        });
        RecyclerView recyclerView = findViewById(R.id.room_recycler_view);
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        String[] strings={"Deluxe Twin Bed Private Room (ensuite)","8 Bed Mixed Dorm (Shared Washroom","Deluxe Private Room (ensuite)","10 Bed Mixed Dorm (Shared Washroom)"};
        RoomAdapter adapter=new RoomAdapter(strings);
        recyclerView.setAdapter(adapter);

    }
    public void AddRoomTypeToRecyclerViewArrayList()
    {
        roomData.add(new RoomData("Deluxe Twin Bed Private Room (ensuite)","Deluxe Twin Bed Private Room (ensuite) with 2 single bed"));
        roomData.add(new RoomData("8 Bed Mixed Dorm (Shared Washroom)","A bed in 8 Bed Mixed Dorm (Shared Washroom)"));
        roomData.add(new RoomData("Deluxe Private Room (ensuite)","A Deluxe Private Room (ensuite) with Double Bed"));
        roomData.add(new RoomData("10 Bed Mixed Dorm (Shared Washroom)","A bed in 10 Bed Mixed Dorm (Shared Washroom)"));
    }
}
