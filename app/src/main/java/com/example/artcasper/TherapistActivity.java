package com.example.artcasper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.artcasper.adapter.therapistAdapter;

public class TherapistActivity extends AppCompatActivity {
    Button book;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapist);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Therapist_Category, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        RecyclerView therapistList = findViewById(R.id.recycler_view);
        therapistList.setLayoutManager(new LinearLayoutManager(this));
        String[] strings={"Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name","Therapist Name"};
        therapistList.setAdapter(new therapistAdapter(strings));
//        int divider = MaterialDividerItemDecoration(this, LinearLayoutManager.VERTICAL /*or LinearLayoutManager.HORIZONTAL*/);
//        recyclerView.addItemDecoration(divider);

        book = findViewById(R.id.bookButton);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BookTherapistActivity.class);
//                intent.putExtras(Intent.getIntent(spinnerValue));
                startActivity(intent);
            }
        });
    }
}
