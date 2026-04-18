package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.auth.AuthResponse;
import com.spring_ai.lovable.dto.auth.LoginRequest;
import com.spring_ai.lovable.dto.auth.SignupRequest;
import com.spring_ai.lovable.service.AuthService;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
