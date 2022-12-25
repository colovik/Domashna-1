package com.example.domasna2.repository.JPA;

import com.example.domasna2.model.Apteka;
import com.example.domasna2.model.Mapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<Mapp,Long> {


}
