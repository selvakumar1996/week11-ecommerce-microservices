package com.ecommerce.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

   @GetMapping("/order")
public String order() {
    String response = restTemplate.getForObject(
            "http://localhost:8080/test",   // 
            String.class
    );
    return "Order placed! -> " + response;
}
}