package com.nimmiw.restaurant_service.repository;

import com.nimmiw.restaurant_service.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepository {
    private List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant add(Restaurant order) {
        restaurants.add(order);
        return order;
    }

    public List<Restaurant> getAll() {
        return restaurants;
    }

    public Restaurant getById(Long id) {
        return restaurants.stream()
                .filter(order -> order.getRestaurantId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
