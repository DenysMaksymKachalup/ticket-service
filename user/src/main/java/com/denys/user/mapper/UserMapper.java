package com.denys.user.mapper;

import com.denys.user.dto.UserDto;
import com.denys.user.dto.UserRegistrationDto;
import com.denys.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toModel(UserRegistrationDto userRegistrationDto);

    UserDto toDto(User user);
}