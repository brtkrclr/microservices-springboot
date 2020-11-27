package com.example.customerserver.Service;

import com.example.customerserver.Customer.Customer;
import com.example.customerserver.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImplementation(CustomerRepo customerRepo){

        this.customerRepo=customerRepo;
    }

    @Override
    public Customer save(Customer customer) {
        customerRepo.save(customer);
        return customer;
    }

    @Override
    public Customer getById(String id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAll() {

        return (List<Customer>) customerRepo.findAll();
    }

    @Override
    public void delete(String id) {

        customerRepo.deleteById(id);
    }
}
