package com.example.restaurantapp.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.restaurantapp.Adapter.KotItemAdapter;
import com.example.restaurantapp.Modules.Kot_Model_Class;
import com.example.restaurantapp.databinding.ActivityKtoBinding;

import java.util.ArrayList;

public class KOT extends AppCompatActivity {

    KotItemAdapter adapterObj;
    ArrayList<Kot_Model_Class> dataList;
    ActivityKtoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKtoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.Toolbar);
        getSupportActionBar().setTitle("Back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = new ArrayList<>();

        dataList.add(new Kot_Model_Class(1,"DineIn","Table 1","02:20 PM","Burger"));
        dataList.add(new Kot_Model_Class(2,"DineIn","Table 2","02:45 PM","Onion Pizza"));
        dataList.add(new Kot_Model_Class(3,"DineIn","Table 3","03:14 PM","Chilli Potato"));
        dataList.add(new Kot_Model_Class(4,"DineIn","Table 4","04:00 PM","Noodles"));
        dataList.add(new Kot_Model_Class(5,"DineIn","Table 5","04:56 PM","Sandwich"));

        adapterObj = new KotItemAdapter(dataList,this);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        binding.recyclerView.setAdapter(adapterObj);

    }

    //    back Press
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}