package com.example.customerserver.Customer;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    private  int id;
    private  String name;

    public Customer( int id,   String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}