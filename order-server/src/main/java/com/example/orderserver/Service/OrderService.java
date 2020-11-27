package com.example.orderserver.Service;

import com.example.orderserver.Order.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);
    List<Order> getAll();
    Order getById(String id);
    void delete(String id);
}
