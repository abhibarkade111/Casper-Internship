package com.example.artcasper;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sharlene.artapp.adapter.TravelAdapter;

import java.util.ArrayList;

public class TravelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> source;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.Adapter adapter;
    LinearLayoutManager HorizontalLayout;
    View ChildView;
    int RecyclerViewItemPosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_booking);

        recyclerView = (RecyclerView) findViewById(R.id.city_recycler);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        AddItemsToRecyclerViewArrayList();
        adapter = new TravelAdapter(source);
        HorizontalLayout
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView.setAdapter(adapter);
    }
    // Function to add items in RecyclerView.
    public void AddItemsToRecyclerViewArrayList()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("Mumbai");
        source.add("Pune");
        source.add("Chennai");
        source.add("Delhi");
        source.add("Bengaluru");
        source.add("Kolkata");
        source.add("Jaipur");
    }


}
