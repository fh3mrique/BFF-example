package com.bffexemplo.bff_service.api.config.client.order;

import com.bffexemplo.bff_service.api.config.client.UserServiceResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserServiceClient {

    private final RestClient userServiceRestClient;

    public UserServiceClient(@Qualifier("userServiceClient") RestClient userServiceRestClient) {
        this.userServiceRestClient = userServiceRestClient;
    }

    public UserServiceResponse findById(Long id) {
        return userServiceRestClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .body(UserServiceResponse.class);
    }
}