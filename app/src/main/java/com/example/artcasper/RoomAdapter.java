package com.example.artcasper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private List<RoomData> data;
    public RoomAdapter(List<RoomData> datalist){
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
        RoomData roomData = data.get(position);
        holder.textView.setText(roomData.getRoomType());
        holder.textView2.setText(roomData.getRoomDetail());
    }

    @Override
    public int getItemCount() {
        return data == null? 0:data.size();
    }

    public class RoomViewHolder extends RecyclerView.ViewHolder{
        TextView textView, textView2;
        Button btn;
        public RoomViewHolder(@NonNull View itemview){
            super(itemview);
            textView= itemview.findViewById(R.id.room_type);
            textView2=itemview.findViewById(R.id.room_type_detail);
            btn=itemview.findViewById(R.id.room_book_);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(), CustomerRegisteration.class);
                    v.getContext().startActivity(i);
                }
            });
        }
        public TextView getTextView(){
            return textView;
        }
    }
}