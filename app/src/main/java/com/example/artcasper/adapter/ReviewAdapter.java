package com.example.artcasper.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.R;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {
    private List<String> data;
    public ReviewAdapter(List<String> list){
        this.data=list;
    }
    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.review_card,parent,false);

        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        holder.text.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.rating);
            image=itemView.findViewById(R.id.city_image);
        }
    }
}
