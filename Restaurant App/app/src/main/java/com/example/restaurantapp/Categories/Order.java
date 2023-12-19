package com.example.restaurantapp.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import com.example.restaurantapp.Adapter.OrderItemAdapter;
import com.example.restaurantapp.Modules.Order_Model_Class;
import com.example.restaurantapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class Order extends AppCompatActivity {

    OrderItemAdapter adapterObj;
    ArrayList<Order_Model_Class> dataList;

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.Toolbar);
        getSupportActionBar().setTitle("Back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = new ArrayList<>();

        dataList.add(new Order_Model_Class(1,"DineIn","Table 1","04:30 PM",850));
        dataList.add(new Order_Model_Class(2,"DineIn","Table 2","04:35 PM",950));
        dataList.add(new Order_Model_Class(3,"DineIn","Table 3","05:30 PM",230));
        dataList.add(new Order_Model_Class(4,"DineIn","Table 4","05:56 PM",1024));
        dataList.add(new Order_Model_Class(5,"DineIn","Table 5","06:00 PM",512));
        dataList.add(new Order_Model_Class(6,"DineIn","Table 6","06:30 PM",1524));

        adapterObj = new OrderItemAdapter(dataList,this);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        binding.recyclerView.setAdapter(adapterObj);

    }

    //    back Press
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}