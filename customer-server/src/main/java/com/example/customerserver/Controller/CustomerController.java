package com.example.customerserver.Controller;
import com.example.customerserver.Customer.Customer;
import com.example.customerserver.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Customer createUser(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable String id) {
        return customerService.getById(id);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        customerService.delete(id);
        return id + " is Deleted";
    }
}