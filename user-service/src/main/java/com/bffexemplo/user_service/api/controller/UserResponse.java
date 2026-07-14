package com.bffexemplo.user_service.api.controller;

import com.bffexemplo.user_service.domian.model.User;
import lombok.Data;

@Data
public class UserResponse {

    private Long id;
    private String name;
    private String email;

    public static UserResponse fromEntity(User entity) {
        UserResponse response = new UserResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setEmail(entity.getEmail());
        return response;
    }
}
