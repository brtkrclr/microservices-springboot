package com.example.orderserver.Service;

import com.example.orderserver.Order.Order;
import com.example.orderserver.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {

    private OrderRepo orderRepo;

    @Autowired
    public  OrderServiceImplementation(OrderRepo orderRepo){
        this.orderRepo=orderRepo;
    }
    @Override
    public Order save(Order order) {
        orderRepo.save(order);
        return order;
    }

    @Override
    public Order getById(String id) {
        return orderRepo.findById(id).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public void delete(String id) {
        orderRepo.deleteById(id);
    }
}
