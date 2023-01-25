package com.lotaproject.service;

import com.lotaproject.dto.CreateOrderRequest;
import com.lotaproject.dto.OrderItemDto;
import com.lotaproject.model.Order;
import com.lotaproject.model.OrderItem;
import com.lotaproject.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    @Override
    public void placeOrder(CreateOrderRequest createOrderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItem> orderItems = createOrderRequest.getOrderItemDto()
                .stream()
                .map(orderItemDto -> mapToDto(orderItemDto)).toList();

        order.setOrderItems(orderItems);

        orderRepository.save(order);
    }

    private OrderItem mapToDto(OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem();
        orderItem.setPrice(orderItemDto.getPrice());
        orderItem.setQuantity(orderItemDto.getQuantity());
        orderItem.setSkuCode(orderItemDto.getSkuCode());

        return orderItem;

    }
}
