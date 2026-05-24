package com.spring_ai.lovable.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
