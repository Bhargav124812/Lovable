package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.auth.UserProfileResponse;
import com.spring_ai.lovable.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
