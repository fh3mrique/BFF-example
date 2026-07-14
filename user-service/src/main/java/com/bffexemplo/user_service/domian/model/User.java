package com.bffexemplo.user_service.domian.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
