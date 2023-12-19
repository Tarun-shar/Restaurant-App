package com.example.restaurantapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.Modules.Dash_Model_Class;
import com.example.restaurantapp.R;

import java.util.ArrayList;

public class DashItemAdapter extends RecyclerView.Adapter<DashItemAdapter.ViewHolder> {

    ArrayList<Dash_Model_Class> dataList;
    Context context;

    public DashItemAdapter(ArrayList<Dash_Model_Class> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_item_file,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.dash_name.setText(dataList.get(position).dash_name);
        holder.price.setText(String.valueOf(dataList.get(position).price));
        holder.number.setText(String.valueOf(dataList.get(position).number));

        holder.dash_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataList.get(position).dash_name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView dash_name;
        TextView price;
        TextView number;
        CardView dash_card_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dash_name = itemView.findViewById(R.id.dash_name);
            price = itemView.findViewById(R.id.price);
            number = itemView.findViewById(R.id.number);
            dash_card_view = itemView.findViewById(R.id.dash_card_view);

        }
    }
}
