package com.denys.user.dto;

public record UserRegistrationDto(String firstName,
                                  String lastName,
                                  String email,
                                  String password) {
}
