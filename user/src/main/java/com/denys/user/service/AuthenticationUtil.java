package com.denys.user.service;

import com.denys.user.model.User;
import com.denys.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthenticationUtil {
    private static UserRepository userRepository;

    public static User getUserFromAuthentication(Authentication authentication) {
        String name = authentication.getName();
        return userRepository
                .findByEmail(name)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
