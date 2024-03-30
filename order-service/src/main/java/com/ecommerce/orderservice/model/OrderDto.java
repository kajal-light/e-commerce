package com.ecommerce.orderservice.model;

import jakarta.persistence.Column;

import java.util.List;

public class OrderDto {


    private List<Integer> productId;

    private List<Double> amount;

    private Double totalAmount;

    private String userId;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
