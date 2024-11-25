package org.chat.chatapp.controller;

import org.chat.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // Maps messages sent to "/app/sendMessage" from the client
    // The annotated method processes the message and returns the result
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    // Handles GET requests for "/chat"
    // Returns the name of the chat view
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
