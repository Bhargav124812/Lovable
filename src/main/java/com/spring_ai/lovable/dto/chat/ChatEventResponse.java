package com.spring_ai.lovable.dto.chat;

import com.spring_ai.lovable.enums.ChatEventType;

public record ChatEventResponse(
        Long id,
        ChatEventType type,
        Integer sequenceOrder,
        String content,
        String filePath,
        String metadata
) {
}
