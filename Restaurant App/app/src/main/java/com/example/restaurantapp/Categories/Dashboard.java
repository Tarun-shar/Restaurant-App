package com.example.restaurantapp.Categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import android.os.Bundle;
import com.example.restaurantapp.Adapter.DashItemAdapter;
import com.example.restaurantapp.Modules.Dash_Model_Class;
import com.example.restaurantapp.databinding.ActivityDashboardBinding;
import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    DashItemAdapter adapterObj;
    ArrayList<Dash_Model_Class> dataList;

    ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.Toolbar);
        getSupportActionBar().setTitle("Back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = new ArrayList<>();

        dataList.add(new Dash_Model_Class(1,259,3789276,"Dine-In"));
        dataList.add(new Dash_Model_Class(2,512,7839465,"Delivery"));
        dataList.add(new Dash_Model_Class(3,278,4657893,"Takeaway"));
        dataList.add(new Dash_Model_Class(4,105,4748573,"Total Order"));
        dataList.add(new Dash_Model_Class(5,789,3456422,"Tax"));
        dataList.add(new Dash_Model_Class(6,123,5432234,"Discount"));


        adapterObj = new DashItemAdapter(dataList,this);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        binding.recyclerView.setAdapter(adapterObj);

    }

//    back Press
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}