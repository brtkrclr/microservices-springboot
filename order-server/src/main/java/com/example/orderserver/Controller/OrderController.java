package com.example.orderserver.Controller;

import com.example.orderserver.Order.Order;
import com.example.orderserver.Repository.OrderRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class OrderController {
    private final Logger LOG=(Logger) LoggerFactory.getLogger(getClass());


    private final List<Order> orders = Arrays.asList(
            new Order(1, 1, "Product A"),
            new Order(2, 1, "Product B"),
            new Order(3, 2, "Product C"),
            new Order(4, 1, "Product D"),
            new Order(5, 2, "Product E"));

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Order> getAllOrders() {
        LOG.info("Getting all orders...");
        return orders;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Order getOrderById(@PathVariable int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Order getOrderByCustomerId(@PathVariable int id) {
        return orders.stream()
                .filter(order -> order.getId() == order.getCustomerId())
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public List<Order> deleteOrders(@PathVariable int id){
        orders.remove(getOrderById(id));
        return orders;
    }




}
