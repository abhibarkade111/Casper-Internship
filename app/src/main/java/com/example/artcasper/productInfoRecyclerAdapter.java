package com.example.artcasper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productInfoRecyclerAdapter extends RecyclerView.Adapter<productInfoRecyclerAdapter.ViewHolder> {
        private ArrayList<product> productinfoArrayList;
        private Context context;

        public productInfoRecyclerAdapter(ArrayList<product> productinfoArrayList, Context context) {
            this.productinfoArrayList = productinfoArrayList;
            this.context = context;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem = layoutInflater.inflate(R.layout.products, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            product vhinfo = productinfoArrayList.get(position);
            holder.txtvhno.setText(vhinfo.prodname);
            holder.txtFrom.setText(vhinfo.company);
            holder.txtTo.setText(vhinfo.price);
            holder.containerInfo.setOnClickListener(new View.OnClickListener() {
//            String vhno = vhinfo.getVhno();
//            String fromlocation = vhinfo.getFromlocation();
//            String tolocation = vhinfo.getTolocation();

                @Override
                public void onClick(View v) {
                }
            });
        }

        @Override
        public int getItemCount() {
            return productinfoArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView txtvhno;
            public TextView txtFrom, txtTo;
            public ImageView vhimg;
            public LinearLayout containerInfo;

            public ViewHolder(View itemView) {
                super(itemView);
                this.txtvhno = (TextView) itemView.findViewById(R.id.txtvhno);
                this.txtFrom = (TextView) itemView.findViewById(R.id.txtFrom);
                this.txtTo = itemView.findViewById(R.id.txtTo);
                this.vhimg = itemView.findViewById(R.id.vhimg);
                containerInfo = (LinearLayout) itemView.findViewById(R.id.containerInfo);
            }
        }
    }




