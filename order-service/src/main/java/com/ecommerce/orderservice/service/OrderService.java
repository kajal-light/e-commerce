package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.model.OrderDto;
import com.ecommerce.orderservice.model.OrderServiceRequest;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {
    void placeOrder(OrderServiceRequest orderDto);
}
