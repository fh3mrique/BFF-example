package com.bffexemplo.order_service.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "tb_order")
@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String product;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
