package com.lotaproject.controllers;

import com.lotaproject.dto.CreateOrderRequest;
import com.lotaproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String placeOrder(@RequestBody CreateOrderRequest request){
        orderService.placeOrder(request);
        return "Order Placed Successfully";
    }
}
