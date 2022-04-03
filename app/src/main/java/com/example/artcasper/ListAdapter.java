package com.example.artcasper;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HotelListHolder> {
    private String[] data;
    public ListAdapter(String[] data){
        this.data=data;
    }

    @NonNull
    @Override
    public HotelListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_hotel,parent,false);
        return new HotelListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelListHolder holder, int position) {
        String title=data[position];
        holder.t1.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class HotelListHolder extends RecyclerView.ViewHolder{
        TextView t1;
        ImageView i1;
        Button btn;
        public HotelListHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.hotel_name);
            i1=itemView.findViewById(R.id.hotel_images);
            btn=itemView.findViewById(R.id.hotel_view);

            AnimationDrawable animation = new AnimationDrawable();
            animation.addFrame(i1.getResources().getDrawable(R.drawable.inside), 2000);
            animation.addFrame(i1.getResources().getDrawable(R.drawable.zostel), 2000);
            animation.setOneShot(false);
            i1.setBackgroundDrawable(animation);
            animation.start();

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(),RoomSelectionActivity.class);
                    v.getContext().startActivity(i);
                }
            });
        }
    }
}
