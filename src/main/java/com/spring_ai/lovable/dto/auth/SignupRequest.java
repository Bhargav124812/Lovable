package com.spring_ai.lovable.dto.auth;

public record SignupRequest(
        String email,
        String username,
        String password
) {
}
