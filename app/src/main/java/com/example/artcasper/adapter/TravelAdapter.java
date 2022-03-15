package com.sharlene.artapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.R;

import java.util.List;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder> {

    private List<String> data;
    public TravelAdapter(List<String> list){
        this.data=list;
    }
    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.city_card_list,parent,false);

        return new TravelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        holder.text.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TravelViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;

        public TravelViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.city);
            image=itemView.findViewById(R.id.city_image);
        }
    }

}
