package com.example.restaurantapp.Modules;

public class Kot_Model_Class {
    public int kto_id;
    public String kto_name, table_name, kto_time, kto_menu;

    public Kot_Model_Class(int kto_id, String kto_name, String table_name, String kto_time, String kto_menu) {
        this.kto_id = kto_id;
        this.kto_name = kto_name;
        this.table_name = table_name;
        this.kto_time = kto_time;
        this.kto_menu = kto_menu;
    }
}

