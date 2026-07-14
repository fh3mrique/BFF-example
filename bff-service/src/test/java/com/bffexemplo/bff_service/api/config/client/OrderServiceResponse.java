package com.bffexemplo.bff_service.api.config.client;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderServiceResponse {
    private Long id;
    private Long userId;
    private String product;
    private BigDecimal amount;
    private String status;
}
