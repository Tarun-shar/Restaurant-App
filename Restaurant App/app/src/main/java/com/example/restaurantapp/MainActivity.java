package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.restaurantapp.Adapter.ItemAdapter;
import com.example.restaurantapp.Modules.DataModel;
import com.example.restaurantapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ItemAdapter adapterObj;
    ArrayList<DataModel> dataList;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        getSupportActionBar().setTitle("Welcome");

        dataList = new ArrayList<>();

        dataList.add(new DataModel(1,"DashBoard"));
        dataList.add(new DataModel(2,"Order"));
        dataList.add(new DataModel(3,"KOT"));
        dataList.add(new DataModel(4,"Report"));

        adapterObj = new ItemAdapter(dataList,this);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        binding.recyclerView.setAdapter(adapterObj);

    }
}