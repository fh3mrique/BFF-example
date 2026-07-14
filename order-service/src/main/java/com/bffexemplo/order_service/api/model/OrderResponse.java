package com.bffexemplo.order_service.api.model;

import com.bffexemplo.order_service.domain.model.Order;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponse {

    private Long id;
    private Long userId;
    private String product;
    private BigDecimal amount;
    private String status;

    public static OrderResponse fromEntity(Order entity) {
        OrderResponse response = new OrderResponse();
        response.setId(entity.getId());
        response.setUserId(entity.getUserId());
        response.setProduct(entity.getProduct());
        response.setAmount(entity.getAmount());
        response.setStatus(entity.getStatus().name());
        return response;
    }
}
