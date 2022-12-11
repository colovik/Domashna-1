package com.example.domasna2.service;

import com.example.domasna2.model.Pharmacy;
import com.example.domasna2.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImplementation  implements PharmacyService{
    private final PharmacyRepository pharmacyRepository;

    public PharmacyServiceImplementation(PharmacyRepository pharmacyRepository){
        this.pharmacyRepository = pharmacyRepository;
    }
    @Override
    public List<Pharmacy> findallpharmacies() {
        return pharmacyRepository.findallPharmacies();
    }

    @Override
    public List<Pharmacy> findbyID(String id) {
        return pharmacyRepository.findbyID(id);
    }
}
