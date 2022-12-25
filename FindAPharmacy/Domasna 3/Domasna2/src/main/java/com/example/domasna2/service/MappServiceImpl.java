package com.example.domasna2.service;
import com.example.domasna2.repository.JPA.MapRepository;
import com.example.domasna2.model.Mapp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MappServiceImpl implements MapService {

    private final MapRepository mapRepository;

    public MappServiceImpl(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }


    @Override
    public List<Mapp> findall() {
        return  this.mapRepository.findAll();
    }
}
