package com.example.customerserver.Service;

import com.example.customerserver.Customer.Customer;
import com.example.customerserver.Repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerBuild{
    private CustomerRepo customerRepo;

    @Override
    public Customer getById(String id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public void delete(String id) {
        customerRepo.deleteById(id);
    }
}
