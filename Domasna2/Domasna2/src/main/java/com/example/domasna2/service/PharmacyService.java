package com.example.domasna2.service;

import com.example.domasna2.model.Pharmacy;
import com.example.domasna2.dataholder.Dataholder;

import java.util.List;

public interface PharmacyService {

    List<Pharmacy> findallpharmacies();
    public List<Pharmacy> findbyID(String id);
}
