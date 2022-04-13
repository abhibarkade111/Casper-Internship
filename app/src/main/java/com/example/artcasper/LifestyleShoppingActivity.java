package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.artcasper.adapter.SubCategoryAdapter;
import com.example.artcasper.data.HomeData;

import java.util.ArrayList;

public class LifestyleShoppingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> source;
    ArrayList<HomeData> bra;
    ArrayList<HomeData> nightwear;
    ArrayList<HomeData> activewear;
    ArrayList<HomeData> panty;
    ArrayList<HomeData> shapewear;
    ArrayList<HomeData> swim;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.Adapter adapter;
    LinearLayoutManager HorizontalLayout;

    CardView pic1, pic2, pic3, pic4, pic5, pic6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle_shopping);

        pic1 = findViewById(R.id.picture1);
        pic2 = findViewById(R.id.picture2);
        pic3 = findViewById(R.id.picture3);
        pic4 = findViewById(R.id.picture4);
        pic5 = findViewById(R.id.picture5);
        pic6 = findViewById(R.id.picture6);

        AddItemsToRecyclerViewArrayList();

        RecyclerView recyclerView = findViewById(R.id.shopping_list);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        SubCategoryAdapter adapter = new SubCategoryAdapter(bra, getApplicationContext());
        recyclerView.setAdapter(adapter);

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BraItems1();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(bra, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NightwearItems2();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(nightwear, getApplicationContext());
                recyclerView.setAdapter(adapter);

            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivewearItems3();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(activewear, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantyItems4();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(panty, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapewearItems4();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(shapewear, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
        pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swimItems4();
                RecyclerView recyclerView = findViewById(R.id.shopping_list);
                GridLayoutManager linearLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                recyclerView.setLayoutManager(linearLayoutManager);
                SubCategoryAdapter adapter = new SubCategoryAdapter(swim, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }
        });
    }

    public void AddItemsToRecyclerViewArrayList() {
        // Adding items to ArrayList
        bra = new ArrayList<>();
        bra.add(new HomeData(R.drawable.tshirtbra, "T-shirt Bra"));
        bra.add(new HomeData(R.drawable.supersupportbra, "Super Supprt Bra"));
        bra.add(new HomeData(R.drawable.lacebra, "Lace Bra"));
        bra.add(new HomeData(R.drawable.pushupbra, "Push Up Bra"));
        bra.add(new HomeData(R.drawable.straplessbra, "Strapless Bra"));
        bra.add(new HomeData(R.drawable.minimiserbra, "Minimiser Bra"));
        bra.add(new HomeData(R.drawable.nursingbra, "Nursing Bra"));
        bra.add(new HomeData(R.drawable.bralettebra, "Bralette Bra"));
    }

    public void BraItems1() {
        // Adding items to ArrayList
        bra = new ArrayList<>();
        bra.add(new HomeData(R.drawable.tshirtbra, "T-shirt Bra"));
        bra.add(new HomeData(R.drawable.supersupportbra, "Super Supprt Bra"));
        bra.add(new HomeData(R.drawable.lacebra, "Lace Bra"));
        bra.add(new HomeData(R.drawable.pushupbra, "Push Up Bra"));
        bra.add(new HomeData(R.drawable.straplessbra, "Strapless Bra"));
        bra.add(new HomeData(R.drawable.minimiserbra, "Minimiser Bra"));
        bra.add(new HomeData(R.drawable.nursingbra, "Nursing Bra"));
        bra.add(new HomeData(R.drawable.bralettebra, "Bralette Bra"));

    }

    public void NightwearItems2() {
        // Adding items to ArrayList
        nightwear = new ArrayList<>();
        nightwear.add(new HomeData(R.drawable.nightwearset, "Nightwear Sets"));
        nightwear.add(new HomeData(R.drawable.sleepbottom, "Sleep Bottoms"));
        nightwear.add(new HomeData(R.drawable.nightdress, "Night dress & Gowns"));
        nightwear.add(new HomeData(R.drawable.camisoles, "Camisoles & Slips"));
        nightwear.add(new HomeData(R.drawable.sleeptop, "Sleep Tops & Shirts"));
        nightwear.add(new HomeData(R.drawable.loungeweartop, "Loungewear Top"));
        nightwear.add(new HomeData(R.drawable.loungewearbottom, "Loungewear Bottom"));
        nightwear.add(new HomeData(R.drawable.loungeweardress, "Loungewear Dress"));
        nightwear.add(new HomeData(R.drawable.hoodie, "Hoodie/Sweatshirts"));
    }

    public void ActivewearItems3() {
        // Adding items to ArrayList
        activewear = new ArrayList<>();
        activewear.add(new HomeData(R.drawable.tops, "Tops"));
        activewear.add(new HomeData(R.drawable.leggings, "Leggings"));
        activewear.add(new HomeData(R.drawable.sportsbra, "Sports Bra"));
        activewear.add(new HomeData(R.drawable.trackpants, "Pants & Track Pants"));
        activewear.add(new HomeData(R.drawable.capris, "Capris"));
        activewear.add(new HomeData(R.drawable.tanktop, "Tank Tops"));
        activewear.add(new HomeData(R.drawable.shorts, "Shorts"));
    }

    public void pantyItems4() {
        // Adding items to ArrayList
        panty = new ArrayList<>();
        panty.add(new HomeData(R.drawable.hipster, "Hipster"));
        panty.add(new HomeData(R.drawable.bikini, "Bikini"));
        panty.add(new HomeData(R.drawable.boyshorts, "Boyshorts"));
    }

    public void shapewearItems4() {
        // Adding items to ArrayList
        shapewear = new ArrayList<>();
        shapewear.add(new HomeData(R.drawable.petticoat, "Shaping Petticoat"));
        shapewear.add(new HomeData(R.drawable.bottomwear, "Shaping Bottomwear"));
        shapewear.add(new HomeData(R.drawable.camis_slip, "Shaping Camis & Slips"));
    }

    public void swimItems4() {
        // Adding items to ArrayList
        swim = new ArrayList<>();
        swim.add(new HomeData(R.drawable.swimsuit, "One Piece Swimsuit"));
        swim.add(new HomeData(R.drawable.coverups, "Cover-Ups"));
        swim.add(new HomeData(R.drawable.swimbottom, "Swim Bottom"));
        swim.add(new HomeData(R.drawable.swimtop, "Swim Top"));
        swim.add(new HomeData(R.drawable.twopieceswimsuit, "Two Piece Swimsuit"));
    }
}

