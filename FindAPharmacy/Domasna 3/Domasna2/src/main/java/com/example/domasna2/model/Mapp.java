package com.example.domasna2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mapp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    float lon;
    float lat;
    String name;

    public Mapp(Long id, float lon, float lat,String name) {
        this.name=name;
        this.lon = lon;
        this.lat = lat;
    }

    public Mapp() {
    }
}