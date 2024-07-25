package com.denys.user.service;

import com.denys.user.dto.UserDto;
import com.denys.user.dto.UserRegistrationDto;
import com.denys.user.dto.UserUpdateRequestDto;
import com.denys.user.model.User;
import org.springframework.security.core.Authentication;

public interface UserService {
    UserDto register(UserRegistrationDto userRegistrationDto);
    UserDto update(UserUpdateRequestDto userUpdateDto, Authentication authentication);
}
