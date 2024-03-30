package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.model.OrderDto;
import com.ecommerce.orderservice.model.OrderServiceRequest;
import com.ecommerce.orderservice.service.OrderService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
public class Controller {
 @Autowired
 private OrderService orderService;


 @PutMapping("/placeOrder")
 public ResponseEntity<OrderServiceRequest> placeOrder(@RequestBody OrderServiceRequest orderDto){

     orderService.placeOrder(orderDto);


    return null;
 }


}
