package com.lotaproject.service;

import com.lotaproject.dto.CreateOrderRequest;

public interface OrderService {
    public void placeOrder(CreateOrderRequest request);
}
