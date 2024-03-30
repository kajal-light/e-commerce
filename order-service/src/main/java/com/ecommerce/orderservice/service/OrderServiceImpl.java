package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.dto.OrderRepository;
import com.ecommerce.orderservice.model.OrderDto;
import com.ecommerce.orderservice.model.OrderServiceRequest;
import com.ecommerce.orderservice.model.OrderServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public void placeOrder(OrderServiceRequest orderServiceRequest) {
        if(orderServiceRequest.getUserId().isBlank()){

            //
        }
        RestTemplate restTemplate = new RestTemplate();
        String url="http://localhost:8080/product-service/fetchStock";

        restTemplate.put(url,orderServiceRequest.getProductId());

       List<OrderServiceResponse> response= restTemplate.postForObject(url,orderServiceRequest.getProductId(),OrderServiceResponse.class);


    }
}
