package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    //creating order
    @PostMapping("orders")
    public String createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    //geting order by Id

    @GetMapping("order/{orderId}")
    public Order getById(@PathVariable Long orderId){
        return orderService.getById(orderId);
    }
}
