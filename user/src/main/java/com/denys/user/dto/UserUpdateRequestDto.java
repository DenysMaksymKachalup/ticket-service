package com.denys.user.dto;

import org.hibernate.validator.constraints.Length;

public record UserUpdateRequestDto(
        @Length(max = 20) String firstName,
        @Length(max = 20) String lastName) {
}
