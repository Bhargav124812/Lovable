package com.spring_ai.lovable.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse userProfileResponse

){

}
