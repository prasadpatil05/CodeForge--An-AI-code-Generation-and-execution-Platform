package com.CodeForgeProject.CodeForge.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
