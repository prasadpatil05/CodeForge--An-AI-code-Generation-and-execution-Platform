package com.CodeForgeProject.CodeForge.entity;

import java.time.Instant;

public class ChatMessage {
    // chat session contains chatmessage

    Long id;
    ChatSession chatSession;
    String content;

    String toolCalls;//Json Array of Tools Called

    Integer tokensUsed;
    Instant createdAt;
    Instant updatedAt;

    
}
