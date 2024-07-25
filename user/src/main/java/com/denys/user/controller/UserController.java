package com.denys.user.controller;

import com.denys.user.dto.UserDto;
import com.denys.user.dto.UserRegistrationDto;
import com.denys.user.dto.UserUpdateRequestDto;
import com.denys.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public UserDto register(@RequestBody UserRegistrationDto userRegistrationDto) {
        return userService.register(userRegistrationDto);
    }

    @PutMapping
    public UserDto update(@RequestBody UserUpdateRequestDto userUpdateRequestDto, Authentication authentication) {
        return userService.update(userUpdateRequestDto,authentication);
    }
}
