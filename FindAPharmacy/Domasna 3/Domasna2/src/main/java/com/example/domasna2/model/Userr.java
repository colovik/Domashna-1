package com.example.domasna2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Uusers")
public class Userr {

    @Id
    private String username;

    private String password;

    private String name;

    private String surname;

    private String telefon;

    private String pol;

    private String email;

    public Userr(String username, String password, String name, String surname, String telefon, String pol,String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.telefon = telefon;
        this.pol = pol;
        this.email=email;
    }

    public Userr() {
    }


}