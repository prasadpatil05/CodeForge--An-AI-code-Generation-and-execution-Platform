package com.CodeForgeProject.CodeForge.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
