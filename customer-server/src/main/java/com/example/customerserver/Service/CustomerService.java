package com.example.customerserver.Service;

import com.example.customerserver.Customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> getAll();
    Customer getById(String id);
    void delete(String id);
}
