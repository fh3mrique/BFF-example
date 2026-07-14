package com.bffexemplo.user_service.api.controller;

import com.bffexemplo.user_service.domian.exception.UserNotFoundException;
import com.bffexemplo.user_service.domian.model.User;
import com.bffexemplo.user_service.domian.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/{id}")
    public UserResponse user(@PathVariable Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return UserResponse.fromEntity(user);
    }




}
