package com.CodeForgeProject.CodeForge.service;

import com.CodeForgeProject.CodeForge.dto.auth.AuthResponse;
import com.CodeForgeProject.CodeForge.dto.auth.LoginRequest;
import com.CodeForgeProject.CodeForge.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

   AuthResponse login(LoginRequest request);
}
