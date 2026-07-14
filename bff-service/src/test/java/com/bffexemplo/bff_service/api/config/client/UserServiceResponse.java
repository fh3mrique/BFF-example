package com.bffexemplo.bff_service.api.config.client;

import lombok.Data;

@Data
public class UserServiceResponse {
    private Long id;
    private String name;
    private String email;
}
