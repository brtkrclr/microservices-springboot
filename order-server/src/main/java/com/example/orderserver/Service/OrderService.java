package com.example.orderserver.Service;

import com.example.orderserver.Order.Order;
import com.example.orderserver.Repository.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderBuild{
    private OrderRepo orderRepo;

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
