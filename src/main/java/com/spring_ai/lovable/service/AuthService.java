package com.spring_ai.lovable.service;


import com.spring_ai.lovable.dto.auth.AuthResponse;
import com.spring_ai.lovable.dto.auth.LoginRequest;
import com.spring_ai.lovable.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
