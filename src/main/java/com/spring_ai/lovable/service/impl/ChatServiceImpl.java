package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.chat.ChatResponse;
import com.spring_ai.lovable.entity.ChatMessage;
import com.spring_ai.lovable.entity.ChatSession;
import com.spring_ai.lovable.entity.ChatSessionId;
import com.spring_ai.lovable.mapper.ChatMapper;
import com.spring_ai.lovable.repository.ChatMessageRepository;
import com.spring_ai.lovable.repository.ChatSessionRepository;
import com.spring_ai.lovable.security.AuthUtil;
import com.spring_ai.lovable.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;
    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}
