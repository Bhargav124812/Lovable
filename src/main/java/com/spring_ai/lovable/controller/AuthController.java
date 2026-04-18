package com.spring_ai.lovable.controller;


import com.spring_ai.lovable.dto.auth.AuthResponse;
import com.spring_ai.lovable.dto.auth.LoginRequest;
import com.spring_ai.lovable.dto.auth.SignupRequest;
import com.spring_ai.lovable.dto.auth.UserProfileResponse;
import com.spring_ai.lovable.service.AuthService;
import com.spring_ai.lovable.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }

}
