package com.example.domasna2.dataholder;

import com.example.domasna2.model.Pharmacy;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Dataholder {
    public static List<Pharmacy> pharmacies = new ArrayList<>();
    @PostConstruct
    public void baza(){
        pharmacies.add(new Pharmacy("Zegin Skopje","Zegin","Skopje "));
        pharmacies.add(new Pharmacy("Zegin Bitola","Zegin","Bitola "));
        pharmacies.add(new Pharmacy("Eurofarm Krusevo","Eurofarm","Krusevo "));
        pharmacies.add(new Pharmacy("Zegin Ohrid","Zegin","Ohrid "));
        pharmacies.add(new Pharmacy("Eurofarm Bitola","Eurofarm","Bitola "));
        pharmacies.add(new Pharmacy("Zegin Trubarevo","Eurofarm","Skopje"));
        pharmacies.add(new Pharmacy("Eurofarm Kumanovo","Eurofarm","Kumanovo "));
    }

}
