package com.example.orderserver.Service;

import com.example.orderserver.Order.Order;

import java.util.List;

public interface OrderBuild {

    List<Order> getAll();
    Order getById(String id);
    void delete(String id);
}
