package com.example.domasna2.service;
import com.example.domasna2.model.Apteka;
import com.example.domasna2.dataholder.Dataholder;

import java.util.List;

public interface AptekaService  {
    List<Apteka> findallPharmacy();
    public List<Apteka> findbyC(String id);
    public Apteka findbyId(Long id);


}