package com.CodeForgeProject.CodeForge.controllers;

import com.CodeForgeProject.CodeForge.dto.auth.AuthResponse;
import com.CodeForgeProject.CodeForge.dto.auth.LoginRequest;
import com.CodeForgeProject.CodeForge.dto.auth.SignupRequest;
import com.CodeForgeProject.CodeForge.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    //signup
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
        return ResponseEntity.ok(authService.login(request))

    }

}
