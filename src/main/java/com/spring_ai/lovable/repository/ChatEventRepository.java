package com.spring_ai.lovable.repository;

import com.spring_ai.lovable.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository  extends JpaRepository<ChatEvent, Long> {
}
