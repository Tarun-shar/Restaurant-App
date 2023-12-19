package com.example.restaurantapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.Categories.Dashboard;
import com.example.restaurantapp.Categories.KOT;
import com.example.restaurantapp.Categories.Order;
import com.example.restaurantapp.Categories.Report;
import com.example.restaurantapp.Modules.DataModel;
import com.example.restaurantapp.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    ArrayList<DataModel> dataList;
    Context context;

    public ItemAdapter(ArrayList<DataModel> list,  Context context){

        this.dataList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_file,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(dataList.get(position).name);

        //    Events
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = dataList.get(position).id;
                switch (id){
                    case 1:{
                        Intent intent = new Intent(context, Dashboard.class);
                        context.startActivity(intent);
                        break;
                    }
                    case 2:{
                        Intent intent = new Intent(context, Order.class);
                        context.startActivity(intent);
                        break;
                    }
                    case 3:{
                        Intent intent = new Intent(context, KOT.class);
                        context.startActivity(intent);
                        break;
                    }
                    case 4:{
                        Intent intent = new Intent(context, Report.class);
                        context.startActivity(intent);
                        break;
                    }
                }

            }
        });
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.card_view);
        }
    };
}
