package com.example.artcasper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Hotels extends AppCompatActivity {

    RecyclerView rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);


        rec=findViewById(R.id.recycler);
        rec.setLayoutManager(new LinearLayoutManager(this));
        String[] name={"Zostel","Hotel"};
        rec.setAdapter(new ListAdapter(name));
    }
}