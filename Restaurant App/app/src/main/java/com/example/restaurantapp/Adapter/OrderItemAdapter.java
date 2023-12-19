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
import com.example.restaurantapp.Modules.Order_Model_Class;
import com.example.restaurantapp.R;

import java.util.ArrayList;

public class OrderItemAdapter extends RecyclerView.Adapter<OrderItemAdapter.ViewHolder> {

    ArrayList<Order_Model_Class> dataList;
    Context context;

    public OrderItemAdapter(ArrayList<Order_Model_Class> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public OrderItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_file,parent,false);
        return new OrderItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderItemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.order_id.setText(String.valueOf(dataList.get(position).id));
        holder.order_name.setText(dataList.get(position).order_name);
        holder.table_name.setText(dataList.get(position).table_name);
        holder.order_time.setText(dataList.get(position).order_time);
        holder.order_price.setText(String.valueOf(dataList.get(position).order_price));

        holder.order_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataList.get(position).table_name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView order_id,order_name,table_name,order_time,order_price;
        CardView order_card_view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            order_id = itemView.findViewById(R.id.order_id);
            order_name = itemView.findViewById(R.id.order_name);
            table_name = itemView.findViewById(R.id.table_name);
            order_time = itemView.findViewById(R.id.order_time);
            order_price = itemView.findViewById(R.id.order_price);

            order_card_view = itemView.findViewById(R.id.order_card_view);

        }
    }
}
