package com.denys.user.service;

import com.denys.user.dto.UserDto;
import com.denys.user.dto.UserRegistrationDto;
import com.denys.user.dto.UserUpdateRequestDto;
import com.denys.user.mapper.UserMapper;
import com.denys.user.model.User;
import com.denys.user.model.enumeration.RoleName;
import com.denys.user.repository.RoleRepository;
import com.denys.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public UserDto register(UserRegistrationDto userRegistrationDto) {
        if (checkExistUser(userRegistrationDto.email())) {
            throw new RuntimeException("User with email: " + userRegistrationDto.email() + " exist");
        }
        User user = userMapper.toModel(userRegistrationDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleRepository.findByName(RoleName.ROLE_USER));
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public UserDto update(UserUpdateRequestDto userUpdateDto, Authentication authentication) {
        User user = AuthenticationUtil.getUserFromAuthentication(authentication);
        user.setFirstName(userUpdateDto.firstName());
        user.setLastName(userUpdateDto.lastName());
        return userMapper.toDto(userRepository.save(user));
    }

    private boolean checkExistUser(String email) {
        return userRepository.existsByEmail(email);
    }
}
