package com.nimmiw.restaurant_service.repository;

import com.nimmiw.restaurant_service.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {
    List<Food> foods = new ArrayList<>();

    public List<Food> getAll() {
        return foods;
    }

    public Food add(Food food) {
        foods.add(food);
        return food;
    }

    public Food findById(Long id) {
        return foods.stream()
                .filter(food -> food.getFoodId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Food> findByRestaurant(Long id) {
        return foods.stream()
                .filter(food -> food.getRestaurantId().equals(id))
                .toList();
    }
}
