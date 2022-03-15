package com.example.artcasper.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.artcasper.R;

public class therapistAdapter extends RecyclerView.Adapter<therapistAdapter.therapistViewholder> {

    private String[] data;
    public therapistAdapter(String[] data){
        this.data=data;
    }
   public  class therapistViewholder extends RecyclerView.ViewHolder{
        ImageView imgview;
        TextView textitle, domaintext;
       public therapistViewholder(@NonNull View itemView) {
           super(itemView);
           imgview=itemView.findViewById(R.id.therapist_logo);
           textitle =itemView.findViewById(R.id.therapist_name);
           domaintext=itemView.findViewById(R.id.therapist_domain);
       }
   }

    @NonNull
    @Override
    public therapistViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.therapist_list,parent,false);
        return new therapistViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull therapistViewholder holder, int position) {
        String title = data[position];
        holder.textitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
