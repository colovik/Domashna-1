package com.example.domasna2.model;

import lombok.Data;

@Data
public class Pharmacy {
    String id;
    String name;
    String location;

    public Pharmacy(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Pharmacy(){

    }
}

