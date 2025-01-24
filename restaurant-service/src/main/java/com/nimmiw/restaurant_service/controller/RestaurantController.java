package com.nimmiw.restaurant_service.controller;

import com.nimmiw.restaurant_service.model.Food;
import com.nimmiw.restaurant_service.model.Order;
import com.nimmiw.restaurant_service.model.Restaurant;
import com.nimmiw.restaurant_service.repository.FoodRepository;
import com.nimmiw.restaurant_service.repository.RestaurantRepository;
import com.nimmiw.restaurant_service.webclient.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private OrderClient orderClient;

    @GetMapping
    public List<Restaurant> getAll() {
        return restaurantRepository.getAll();
    }

    @GetMapping("/{restaurantId}/food")
    public List<Food> getAllFood(@PathVariable Long restaurantId) {
        return foodRepository.getAll()
                .stream()
                .filter(food -> food.getRestaurantId().equals(restaurantId))
                .toList();
    }

    @GetMapping("/{id}")
    public Restaurant get(@PathVariable Long id) {
        return restaurantRepository.getById(id);
    }

    @PostMapping
    public Restaurant add(@RequestBody Restaurant restaurant) {
        return restaurantRepository.add(restaurant);
    }

    @PostMapping("/food")
    public Food addFood(@RequestBody Food food) {
        return foodRepository.add(food);
    }

    @GetMapping("/{id}/orders")
    public List<Order> findAllRestaurantOrders(@PathVariable Long id) {
        return orderClient.getByRestaurantId(id);
    }

}
