package com.spring_ai.lovable.service;


import com.spring_ai.lovable.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
