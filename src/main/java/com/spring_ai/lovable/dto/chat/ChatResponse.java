package com.spring_ai.lovable.dto.chat;

import com.spring_ai.lovable.entity.ChatEvent;
import com.spring_ai.lovable.entity.ChatSession;
import com.spring_ai.lovable.enums.MessageRole;

import java.time.Instant;
import java.util.List;

public record ChatResponse(
        Long id,
        ChatSession chatSession,
        MessageRole role,
        List<ChatEventResponse> events,
        String content,
        Integer tokensUsed,
        Instant createdAt
) {
}
