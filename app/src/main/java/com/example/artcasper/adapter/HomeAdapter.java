package com.example.artcasper.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.Hotels;
import com.example.artcasper.R;
import com.example.artcasper.data.HomeData;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
    private List<HomeData> data;
    Context context;
    public HomeAdapter(List<HomeData> list,Context context){
        this.data=list;
        this.context=context;
    }
    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.city_card_list,parent,false);

        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        HomeData hdata = data.get(position);
        holder.text.setText(hdata.getName());

        holder.image.setImageDrawable(context.getResources().getDrawable(hdata.imageId));
    }

    @Override
    public int getItemCount() {
        return data == null? 0:data.size();
//
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;
        CardView cardView;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.city);
            image=itemView.findViewById(R.id.city_image);
            cardView=itemView.findViewById(R.id.destination_card);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(view.getContext(), Hotels.class);
                    view.getContext().startActivity(intent);
                }
            });

        }
    }
}
