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
import com.example.restaurantapp.Modules.Report_Model_Class;
import com.example.restaurantapp.R;

import java.util.ArrayList;

public class ReportItemAdapter extends RecyclerView.Adapter<ReportItemAdapter.ViewHolder> {

    ArrayList<Report_Model_Class> dataList;
    Context context;

    public ReportItemAdapter(ArrayList<Report_Model_Class> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ReportItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_item_file,parent,false);
        return new ReportItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportItemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.report_name.setText(dataList.get(position).report_name);
        holder.report_number.setText(String.valueOf(dataList.get(position).report_number));

        holder.report_card_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataList.get(position).report_name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView report_name, report_number;
        CardView report_card_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            report_name = itemView.findViewById(R.id.report_name);
            report_number = itemView.findViewById(R.id.report_number);
            report_card_view = itemView.findViewById(R.id.report_card_view);

        }
    }
}
