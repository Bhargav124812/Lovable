package com.spring_ai.lovable.controller;


import com.spring_ai.lovable.dto.auth.AuthResponse;
import com.spring_ai.lovable.dto.auth.SignupRequest;
import com.spring_ai.lovable.service.AuthService;
import com.spring_ai.lovable.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

}
