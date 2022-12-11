package com.example.domasna2.repository;

import com.example.domasna2.dataholder.Dataholder;
import com.example.domasna2.model.Pharmacy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PharmacyRepository {
    public List<Pharmacy> findallPharmacies(){
        return Dataholder.pharmacies;
    }

    public List<Pharmacy> findbyID(String id){
        List<Pharmacy> chosen = new ArrayList<>();
        for (int i = 0; i<Dataholder.pharmacies.size();i++){
            if (Dataholder.pharmacies.get(i).getId().equals(id)){
                chosen.add(Dataholder.pharmacies.get(i));
            }
        }
        return chosen;
    }
}
