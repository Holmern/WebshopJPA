package com.example.webshopjpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    private int id;
    private String name;

    public Company() {}

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
