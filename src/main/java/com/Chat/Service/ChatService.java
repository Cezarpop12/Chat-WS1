package com.Chat.Service;

import com.Chat.Model.Chat;
import com.Chat.Repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepo;

    public Chat addChat(Chat chat){
        chat.setChatID(UUID.randomUUID().toString().split("-")[0]);
        chat.setSenderID(UUID.randomUUID().toString().split("-")[0]);
        chat.setReceiverID(UUID.randomUUID().toString().split("-")[0]);
        chat.setDateTime(LocalDateTime.now());
        return chatRepo.save(chat);
    }
}
