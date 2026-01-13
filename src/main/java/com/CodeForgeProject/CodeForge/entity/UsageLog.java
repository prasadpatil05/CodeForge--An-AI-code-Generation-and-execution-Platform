package com.CodeForgeProject.CodeForge.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsageLog {
    Long id;
    User user;
    Project project;
    String action;

    Integer tokensUsed;
    Integer durationMs;
    String metaData; // JSON of  {model_used.prompt_used}

    Instant createdAt;

}
