package com.bffexemplo.bff_service.api.config.client.order;

import com.bffexemplo.bff_service.api.config.client.OrderServiceResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class OrderServiceClient {

    private final RestClient orderServiceRestClient;

    public OrderServiceClient(@Qualifier("orderServiceClient") RestClient orderServiceRestClient) {
        this.orderServiceRestClient = orderServiceRestClient;
    }

    public List<OrderServiceResponse> findByUserId(Long userId) {
        return orderServiceRestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/orders")
                        .queryParam("userId", userId)
                        .build())
                .retrieve()
                .body(new ParameterizedTypeReference<List<OrderServiceResponse>>() {});
    }
}