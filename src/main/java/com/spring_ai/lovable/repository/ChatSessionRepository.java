package com.spring_ai.lovable.repository;

import com.spring_ai.lovable.entity.ChatSession;
import com.spring_ai.lovable.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
