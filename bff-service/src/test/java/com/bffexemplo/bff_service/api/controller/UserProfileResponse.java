package com.bffexemplo.bff_service.api.controller;

import com.bffexemplo.bff_service.api.config.client.OrderServiceResponse;
import com.bffexemplo.bff_service.api.config.client.UserServiceResponse;
import lombok.Data;

import java.util.List;

@Data
public class UserProfileResponse {

    private Long id;
    private String name;
    private String email;
    private List<OrderServiceResponse> orders;

    public static UserProfileResponse of(UserServiceResponse user, List<OrderServiceResponse> orders) {
        UserProfileResponse response = new UserProfileResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setOrders(orders);
        return response;
    }
}