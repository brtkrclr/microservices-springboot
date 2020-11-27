package com.example.orderserver.Controller;

import com.example.orderserver.Order.Order;
import com.example.orderserver.Repository.OrderRepo;
import com.example.orderserver.Service.OrderService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Order> getAllCustomers() {
        return orderService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order getOrderById(@PathVariable String id) {
        return orderService.getById(id);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        orderService.delete(id);
        return id + " is Deleted";
    }


}
