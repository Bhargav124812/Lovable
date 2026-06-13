package com.spring_ai.lovable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ChatSessionId {
    Long projectId;
    Long userId;
}
