package com.oop;

import java.util.ArrayList;

public class Data extends Print {
    private String name;
    private final int id;

    public Data(String name,final int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void print(String name) {
        System.out.println("Name :"+this.name+", ID: "+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
