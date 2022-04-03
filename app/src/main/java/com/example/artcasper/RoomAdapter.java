package com.example.artcasper;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private String[] data;
    public RoomAdapter(String[] datalist){
        this.data=datalist;
    }
    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.room_card,parent,false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        holder.getTextView().setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RoomViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        Button btn;
        public RoomViewHolder(@NonNull View itemview){
            super(itemview);
            textView= itemview.findViewById(R.id.room_type);
            btn=itemview.findViewById(R.id.book_room);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(), cust_register.class);
                    v.getContext().startActivity(i);
                }
            });
        }
        public TextView getTextView(){
            return textView;
        }
    }
}