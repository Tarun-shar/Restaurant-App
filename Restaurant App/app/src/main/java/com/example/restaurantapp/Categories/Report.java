package com.example.restaurantapp.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import com.example.restaurantapp.Adapter.ReportItemAdapter;
import com.example.restaurantapp.Modules.Report_Model_Class;
import com.example.restaurantapp.databinding.ActivityReportBinding;

import java.util.ArrayList;

public class Report extends AppCompatActivity {

    ReportItemAdapter adapterObj;
    ArrayList<Report_Model_Class> dataList;

    ActivityReportBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.Toolbar);
        getSupportActionBar().setTitle("Back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = new ArrayList<>();

        dataList.add(new Report_Model_Class(1,"Total Sale",356));
        dataList.add(new Report_Model_Class(2,"DineIn Sale",456));
        dataList.add(new Report_Model_Class(3,"Tax Sale",534));

        adapterObj = new ReportItemAdapter(dataList,this);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        binding.recyclerView.setAdapter(adapterObj);

    }

    //    back Press
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}