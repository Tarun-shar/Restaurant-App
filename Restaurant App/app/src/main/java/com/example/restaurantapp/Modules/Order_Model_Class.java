package com.example.restaurantapp.Modules;

public class Order_Model_Class {
    public int id;
    public String order_name, table_name, order_time;
    public int order_price;

    public Order_Model_Class(int id, String order_name, String table_name, String order_time, int order_price) {
        this.id = id;
        this.order_name = order_name;
        this.table_name = table_name;
        this.order_time = order_time;
        this.order_price = order_price;
    }
}
