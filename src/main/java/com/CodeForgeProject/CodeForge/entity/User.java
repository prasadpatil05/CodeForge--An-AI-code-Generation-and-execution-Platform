package com.CodeForgeProject.CodeForge.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.Instant;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    private int id;
    private String email;
    private String passwordHash;
    private String name;
    private String avatarUrl;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

}

