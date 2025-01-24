package com.nimmiw.order_service.repository;

import com.nimmiw.order_service.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public Order add(Order order) {
        orders.add(order);
        return order;
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order getById(Long id) {
        return orders.stream()
                .filter(order -> order.getOrderId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Order> getByRestaurantId(Long id) {
        return orders.stream()
                .filter(order -> order.getRestaurantId().equals(id))
                .toList();
    }
}
