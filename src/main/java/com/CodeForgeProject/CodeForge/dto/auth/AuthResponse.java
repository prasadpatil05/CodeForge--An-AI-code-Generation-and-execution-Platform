package com.CodeForgeProject.CodeForge.dto.auth;

public record AuthResponse(
        String token ,
        UserProfileResponse user
) {

}
