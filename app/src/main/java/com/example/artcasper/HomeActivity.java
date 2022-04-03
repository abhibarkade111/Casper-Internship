package com.example.artcasper;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.afdhal_fa.imageslider.ImageSlider;
//import com.afdhal_fa.imageslider.model.SlideUIModel;
import com.example.artcasper.adapter.HomeAdapter;
import com.example.artcasper.adapter.ReviewAdapter;

import java.util.ArrayList;
import java.util.Calendar;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener,DatePickerDialog.OnDateSetListener {
    RecyclerView recyclerView;
    ArrayList<String> source;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.Adapter adapter;
    LinearLayoutManager HorizontalLayout;
    EditText startDateButton, endDateButton;
    Button booknowButton;
    public String start,end;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Spinner spinner=findViewById(R.id.spinner_destination);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> arrayAdapter= ArrayAdapter.createFromResource(this,R.array.Destination, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        booknowButton=findViewById(R.id.book_now);
        booknowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /*Intent intent = new Intent(getApplicationContext(),RoomSelectionActivity.class);
                intent.putExtra("start_date",start);
                intent.putExtra("end_date",end);
                startActivity(intent);*/
                Intent i=new Intent(HomeActivity.this,Hotels.class);
                startActivity(i);

            }
        });

        startDateButton=findViewById(R.id.start_date);
        endDateButton=findViewById(R.id.end_date);

        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog1();
                start=startDateButton.getText().toString();
            }
        });
        endDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog2();
                end=endDateButton.getText().toString();
            }
        });
//        ArrayList<SlideUIModel> imageList = new ArrayList< SlideUIModel >();
//        imageList.add(new SlideUIModel("https://s.id/Ccoeo","Blackpink"));
//        imageList.add(new SlideUIModel("https://s.id/CcouZ","Blackpink"));
//        imageList.add(new SlideUIModel("https://bit.ly/3fLJf72", "The population of elephants is decreasing in the world."));
//
//        ImageSlider imageSlide = null;
//        imageSlide.setImageList(imageList);

        recyclerView = (RecyclerView) findViewById(R.id.city_recycler);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        AddItemsToRecyclerViewArrayList();
        adapter = new HomeAdapter(source);
        HorizontalLayout
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView.setAdapter(adapter);


        recyclerView = (RecyclerView) findViewById(R.id.city_recycler2);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        AddItemsToRecyclerViewArrayList();
        adapter = new HomeAdapter(source);
        HorizontalLayout
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView.setAdapter(adapter);

        recyclerView = (RecyclerView) findViewById(R.id.city_recycler3);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        AddItemsToRecyclerViewArrayList();
        adapter = new ReviewAdapter(source);
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
    private void showDatePickerDialog1(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this::onDateSet1, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    private void showDatePickerDialog2(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this::onDateSet2, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    public void onDateSet1(DatePicker datePicker, int year, int month, int day) {
        String date= day+"/"+month+"/"+year;
        startDateButton.setText(date);
    }
    public void onDateSet2(DatePicker datePicker, int year, int month, int day) {
        String date= day+"/"+month+"/"+year;
        endDateButton.setText(date);
    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
