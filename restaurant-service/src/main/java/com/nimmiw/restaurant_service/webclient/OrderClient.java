package com.nimmiw.restaurant_service.webclient;

import com.nimmiw.restaurant_service.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface OrderClient {

    @GetExchange("order/restaurant/{restaurantId}")
    public List<Order> getByRestaurantId(@PathVariable Long restaurantId);
}
