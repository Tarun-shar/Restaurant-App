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

import com.example.restaurantapp.Modules.Kot_Model_Class;
import com.example.restaurantapp.R;

import java.util.ArrayList;

public class KotItemAdapter extends RecyclerView.Adapter<KotItemAdapter.ViewHolder> {

        ArrayList<Kot_Model_Class> dataList;
        Context context;

        public KotItemAdapter(ArrayList<Kot_Model_Class> dataList, Context context) {
            this.dataList = dataList;
            this.context = context;
        }

        @NonNull
        @Override
        public KotItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kto_item_file,parent,false);
        return new KotItemAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull KotItemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.kot_id.setText(String.valueOf(dataList.get(position).kto_id));
        holder.kot_name.setText(dataList.get(position).kto_name);
        holder.table_name.setText(dataList.get(position).table_name);
        holder.kot_time.setText(dataList.get(position).kto_time);
        holder.kot_menu.setText(dataList.get(position).kto_menu);

        holder.kto_card_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataList.get(position).kto_menu, Toast.LENGTH_SHORT).show();
            }
        });

        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }
        static class ViewHolder extends RecyclerView.ViewHolder{
            TextView kot_id, kot_name,table_name, kot_time, kot_menu;
            CardView kto_card_view;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                kot_id = itemView.findViewById(R.id.kto_id);
                kot_name = itemView.findViewById(R.id.kto_name);
                table_name = itemView.findViewById(R.id.table_name);
                kot_time = itemView.findViewById(R.id.kto_time);
                kot_menu = itemView.findViewById(R.id.kto_menu);
                kto_card_view = itemView.findViewById(R.id.kto_card_view);

            }
        }
}
