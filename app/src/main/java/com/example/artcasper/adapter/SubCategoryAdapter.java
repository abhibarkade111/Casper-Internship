package com.example.artcasper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artcasper.R;
import com.example.artcasper.data.HomeData;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>{
    private List<HomeData> data;
    Context context;
    public SubCategoryAdapter(List<HomeData> list, Context context){
        this.data=list;
        this.context=context;
    }
    @NonNull
    @Override
    public SubCategoryAdapter.SubCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_list_card,parent,false);

        return new SubCategoryAdapter.SubCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryAdapter.SubCategoryViewHolder holder, int position) {
        HomeData homeData = data.get(position);
        holder.text.setText(homeData.getName());
        holder.image.setImageDrawable(context.getResources().getDrawable(homeData.imageId));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SubCategoryViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;

        public SubCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.category_name);
            image=itemView.findViewById(R.id.picture);
        }
    }
}