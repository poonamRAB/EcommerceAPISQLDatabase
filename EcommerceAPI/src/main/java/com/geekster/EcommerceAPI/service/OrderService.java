package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public String createOrder(Order order) {
        orderRepo.save(order);
        return "your order is placed successfully!!";
    }

    public Order getById(Long orderId) {
        return orderRepo.findById(orderId).get();
    }
}
