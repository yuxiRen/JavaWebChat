package com.rita.chatII.Controller;

import com.rita.chatII.Model.ChatForm;
import com.rita.chatII.Service.ChatService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/chat")
public class ChatController {
    private ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping
    public String getChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        model.addAttribute("chatMessages", service.getChatMessages());
        return "chat";
    }
    @PostMapping
    public String postChat(Authentication authentication, ChatForm chatForm, Model model) {
        chatForm.setName(authentication.getName());
        service.addMessage(chatForm);
        chatForm.setMsg("");
        model.addAttribute("chatMessages", service.getChatMessages());
        return "chat";
    }
    @ModelAttribute("modes")
    public String[] modes() {
        return new String[]{"Say","Shout","Whisper"};
    }
}
