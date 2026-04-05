package com.spring_ai.lovable.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
