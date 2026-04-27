package com.spring_ai.lovable.dto.auth;

public record LoginRequest(
        String username,
        String password
) {
}
