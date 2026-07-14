package com.bffexemplo.order_service.api.controller;

import com.bffexemplo.order_service.api.model.OrderResponse;
import com.bffexemplo.order_service.domain.model.Order;
import com.bffexemplo.order_service.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping
    public List<OrderResponse> orders(@RequestParam Long userId) {
        List<Order> orders = orderRepository.findByUserId(userId);

        return orders.stream()
                .map(OrderResponse::fromEntity)
                .toList();
    }
}
