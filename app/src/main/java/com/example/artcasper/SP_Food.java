package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.artcasper.adapter.SubCategoryAdapter;
import com.example.artcasper.data.HomeData;

import java.util.ArrayList;

public class SP_Food extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> source;
    ArrayList<HomeData> baby;
    ArrayList<HomeData> pregnancy;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.Adapter adapter;
    LinearLayoutManager HorizontalLayout;

    CardView pic1, pic2, pic3, pic4, pic5, pic6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_food);
        pic1 = findViewById(R.id.picture1);
        pic2 = findViewById(R.id.picture2);

        TextView tv=findViewById(R.id.textscroll);
        tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tv.setSelected(true);

        AddItemsToRecyclerViewArrayList();

        RecyclerView recyclerView = findViewById(R.id.shopping_list);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        SubCategoryAdapter adapter = new SubCategoryAdapter(baby, getApplicationContext());
        recyclerView.setAdapter(adapter);

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                babyItems1();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(baby, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pregnancyItems2();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(pregnancy, getApplicationContext());
                recyclerView.setAdapter(adapter);

            }
        });

    }

    public void AddItemsToRecyclerViewArrayList() {
        // Adding items to ArrayList
        baby = new ArrayList<>();
        baby.add(new HomeData(R.drawable.bf1, "COMBO"));
        baby.add(new HomeData(R.drawable.bf2, "Weight Gain"));
        baby.add(new HomeData(R.drawable.bf3, "Immunity Booster"));
        baby.add(new HomeData(R.drawable.bf4, "Fruits Cereal Combo"));
        baby.add(new HomeData(R.drawable.bf5, "Coconut rice kheer"));
    }

    public void babyItems1() {
        // Adding items to ArrayList
        baby = new ArrayList<>();
        baby.add(new HomeData(R.drawable.bf1, "IRON-Calcium-Protein COMBO"));
        baby.add(new HomeData(R.drawable.bf2, "Weight Gain"));
        baby.add(new HomeData(R.drawable.bf3, "Immunity Booster"));
        baby.add(new HomeData(R.drawable.bf4, "Fruits Cereal Combo"));
        baby.add(new HomeData(R.drawable.bf5, "Coconut rice kheer"));

    }

    public void pregnancyItems2() {
        pregnancy = new ArrayList<>();
        pregnancy.add(new HomeData(R.drawable.pr1, "Top 100 food"));
        pregnancy.add(new HomeData(R.drawable.pr2, "Foxtail millet"));
        pregnancy.add(new HomeData(R.drawable.pr3, "Seasm seeds"));
        pregnancy.add(new HomeData(R.drawable.pr4, "Iron shakti"));
    }

}

