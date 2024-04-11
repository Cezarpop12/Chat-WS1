package com.Chat.Controller;

import com.Chat.Model.Chat;
import com.Chat.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Chat createChat(@RequestBody Chat chat){
        return chatService.addChat(chat);
    }
}
