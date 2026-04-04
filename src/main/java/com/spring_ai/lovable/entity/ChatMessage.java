package com.spring_ai.lovable.entity;


import com.spring_ai.lovable.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls; // JSON Array of Tools Called

    Integer tokensUsed;

    Instant createdAt;
}
