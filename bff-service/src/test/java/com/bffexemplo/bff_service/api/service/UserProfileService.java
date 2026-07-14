package com.bffexemplo.bff_service.api.service;

import com.bffexemplo.bff_service.api.config.client.OrderServiceResponse;
import com.bffexemplo.bff_service.api.config.client.order.OrderServiceClient;

import com.bffexemplo.bff_service.api.config.client.UserServiceResponse;
import com.bffexemplo.bff_service.api.config.client.order.UserServiceClient;
import com.bffexemplo.bff_service.api.controller.UserProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserServiceClient userServiceClient;
    private final OrderServiceClient orderServiceClient;

    public UserProfileResponse getProfile(Long id) {
        UserServiceResponse user = userServiceClient.findById(id);
        List<OrderServiceResponse> orders = orderServiceClient.findByUserId(id);

        return UserProfileResponse.of(user, orders);
    }
}
