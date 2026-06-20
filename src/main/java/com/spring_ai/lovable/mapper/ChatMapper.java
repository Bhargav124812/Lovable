package com.spring_ai.lovable.mapper;

import com.spring_ai.lovable.dto.chat.ChatResponse;
import com.spring_ai.lovable.entity.ChatMessage;
import org.mapstruct.Mapper;


import java.util.List;


@Mapper(componentModel = "spring")
public interface ChatMapper {
    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
