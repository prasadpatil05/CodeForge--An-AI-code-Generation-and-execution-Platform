package com.CodeForgeProject.CodeForge.entity;

import com.CodeForgeProject.CodeForge.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    // chat session contains chatmessage

    Long id;
    ChatSession chatSession;
    String content;


    MessageRole role;
    String toolCalls;//Json Array of Tools Called

    Integer tokensUsed;
    Instant createdAt;


    
}
