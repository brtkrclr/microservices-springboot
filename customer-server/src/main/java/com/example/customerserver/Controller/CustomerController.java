package com.example.customerserver.Controller;


import com.example.customerserver.Customer.Customer;
import com.example.customerserver.Repository.CustomerRepo;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/")
public class CustomerController {
    private final Logger LOG = (Logger) LoggerFactory.getLogger(getClass());

    private List<Customer> customers = Arrays.asList(
            new Customer(1, "Joe Bloggs"),
            new Customer(2, "Jane Doe"),
            new Customer(3, "Bilbo Baggins"));


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        LOG.info("Getting all customers...");
        return customers;
    }




    /*p

    @GetMapping


    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }*/

}