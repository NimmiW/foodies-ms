package com.nimmiw.order_service.model;

public class Order {
    private Long orderId;
    private Long customerId;
    private Long restaurantId;
    private Long foodId;

    public Order() {
    }

    public Order(Long orderId, Long restaurantId, Long foodId, Long customerId) {
        this.foodId = foodId;
        this.restaurantId = restaurantId;
        this.customerId = customerId;
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
}
