package com.lotaproject.controllers;

import com.lotaproject.dto.CreateOrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody CreateOrderRequest request){
        return "Order Placed Successfully";
    }
}
