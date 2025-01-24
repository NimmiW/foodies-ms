package com.nimmiw.order_service.controller;

import com.nimmiw.order_service.model.Order;
import com.nimmiw.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order add(@RequestBody Order order){
        orderRepository.add(order);
        return order;
    }

    @GetMapping
    public List<Order> getALL(){
        return orderRepository.getAll();
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId){
        return orderRepository.getById(orderId);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<Order> getByRestaurantId(@PathVariable Long restaurantId){
        return orderRepository.getByRestaurantId(restaurantId);
    }





}
