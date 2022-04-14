package com.example.artcasper;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hygine extends AppCompatActivity {
    AlertDialog.Builder builder;
    LinearLayoutManager HorizontalLayout;
    LinearLayout pic1, pic2, pic3, pic4,pic5, pic6, pic7, pic8,pic9,pic10;
    ArrayList<com.example.artcasper.product> productinfoArrayList;
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
                ArrayList<product> productinfoArrayList = new ArrayList<>();
                builder = new AlertDialog.Builder(hygine.this);
                //    private DBHelper dbHelper;
                productinfoArrayList = initprod1();
                productInfoRecyclerAdapter productArrayList = new productInfoRecyclerAdapter(productinfoArrayList, hygine.this);
                RecyclerView recyclerView = findViewById(R.id.prod);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hygine.this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(productArrayList);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<product> productinfoArrayList = new ArrayList<>();
                builder = new AlertDialog.Builder(hygine.this);
                //    private DBHelper dbHelper;
                productinfoArrayList = initprod2();
                productInfoRecyclerAdapter productArrayList = new productInfoRecyclerAdapter(productinfoArrayList, hygine.this);
                RecyclerView recyclerView = findViewById(R.id.prod);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hygine.this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(productArrayList);

            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<product> productinfoArrayList = new ArrayList<>();
                builder = new AlertDialog.Builder(hygine.this);
                //    private DBHelper dbHelper;
                productinfoArrayList = initprod3();
                productInfoRecyclerAdapter productArrayList = new productInfoRecyclerAdapter(productinfoArrayList, hygine.this);
                RecyclerView recyclerView = findViewById(R.id.prod);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hygine.this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(productArrayList);

            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<product> productinfoArrayList = new ArrayList<>();
                builder = new AlertDialog.Builder(hygine.this);
                //    private DBHelper dbHelper;
                productinfoArrayList = initprod4();
                productInfoRecyclerAdapter productArrayList = new productInfoRecyclerAdapter(productinfoArrayList, hygine.this);
                RecyclerView recyclerView = findViewById(R.id.prod);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hygine.this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(productArrayList);

            }
        });
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<product> productinfoArrayList = new ArrayList<>();
                builder = new AlertDialog.Builder(hygine.this);
                //    private DBHelper dbHelper;
                productinfoArrayList = initprod5();
                productInfoRecyclerAdapter productArrayList = new productInfoRecyclerAdapter(productinfoArrayList, hygine.this);
                RecyclerView recyclerView = findViewById(R.id.prod);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(hygine.this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(productArrayList);

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


}