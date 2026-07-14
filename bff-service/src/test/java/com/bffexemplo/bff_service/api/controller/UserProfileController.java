package com.bffexemplo.bff_service.api.controller;

import com.bffexemplo.bff_service.api.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profile")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @GetMapping("/{id}")
    public UserProfileResponse profile(@PathVariable Long id) {
        return userProfileService.getProfile(id);
    }
}