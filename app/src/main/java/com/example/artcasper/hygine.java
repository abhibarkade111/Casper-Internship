package com.example.artcasper;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.adapter.SubCategoryAdapter;
import com.example.artcasper.data.HomeData;

import java.util.ArrayList;

public class hygine extends AppCompatActivity {
    AlertDialog.Builder builder;
    LinearLayoutManager HorizontalLayout;
    LinearLayout pic1, pic2, pic3, pic4,pic5, pic6, pic7, pic8,pic9,pic10;
    ArrayList<com.example.artcasper.product> productinfoArrayList;
    ArrayList<HomeData> period;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hygine);

        pic1 = findViewById(R.id.prod1);
        pic2 = findViewById(R.id.prod2);
        pic3 = findViewById(R.id.prod3);
        pic4 = findViewById(R.id.prod4);
        pic5 = findViewById(R.id.prod5);
        pic6 = findViewById(R.id.prod6);
        pic7 = findViewById(R.id.prod7);
        pic8 = findViewById(R.id.prod8);
        pic9 = findViewById(R.id.prod9);
        pic10 = findViewById(R.id.prod10);


        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periodItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shaveItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);

            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periodItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);

            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shaveItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periodItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);

            }
        });
        pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shaveItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periodItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shaveItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                periodItems1();
                RecyclerView recyclerView = findViewById(R.id.prod);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(period, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
    }
    private ArrayList<product> initprod1(){
        ArrayList<product> list=new ArrayList<>();

        list.add(new product("3428","Seisomat","SOUTHWEST"));
        list.add(new product("3428","Seisomat","SOUTHWEST"));
        list.add(new product("3428","Seisomat","SOUTHWEST"));
        return list;
    }
    private ArrayList<product> initprod2(){
        ArrayList<product> list=new ArrayList<>();

        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        return list;
    }
    private ArrayList<product> initprod3(){
        ArrayList<product> list=new ArrayList<>();

        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        return list;
    }
    private ArrayList<product> initprod4(){
        ArrayList<product> list=new ArrayList<>();

        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        return list;
    }
    private ArrayList<product> initprod5(){
        ArrayList<product> list=new ArrayList<>();

        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        list.add(new product("3999","PEE SAFE","Toilet Seat Sanitizer 300 ml (Mint)"));
        return list;
    }
    public void periodItems1(){
        // Adding items to ArrayList
        period = new ArrayList<>();
        period.add(new HomeData(R.drawable.mensuralcup, "Reusable menstrual cup - L"));
        period.add(new HomeData(R.drawable.mensuralcup,"Reusable menstrual cup - M"));
        period.add(new HomeData(R.drawable.mensuralcup,"Reusable menstrual cup - S"));
        period.add(new HomeData(R.drawable.mensuralcup,"Reusable menstrual cup - L"));
        period.add(new HomeData(R.drawable.mensuralcup,"Reusable menstrual cup - M"));
        period.add(new HomeData(R.drawable.mensuralcup,"Reusable menstrual cup - S"));
    }
    public void shaveItems1(){
        // Adding items to ArrayList
        period = new ArrayList<>();
        period.add(new HomeData(R.drawable.shavinggroming, "Body Razors Kit"));
        period.add(new HomeData(R.drawable.shavinggroming,"Vitamin E Pad Equipped Body Razor"));
        period.add(new HomeData(R.drawable.shavinggroming,"Face Razor"));
        period.add(new HomeData(R.drawable.shavinggroming,"Body Razor Duo"));
        period.add(new HomeData(R.drawable.shavinggroming,"Complete Hair Removal Pack"));
        period.add(new HomeData(R.drawable.shavinggroming,"Advanced Nano Coated Face Razor"));
    }


}