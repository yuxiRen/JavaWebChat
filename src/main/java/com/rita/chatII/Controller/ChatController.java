package com.rita.chatII.Controller;

import com.rita.chatII.Model.ChatForm;
import com.rita.chatII.Service.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping
    public String getChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        model.addAttribute("chatMessages", service.getListMessages());
        return "chat";
    }
    @PostMapping
    public String postChat(ChatForm chatForm, Model model) {
        service.addMessage(chatForm);
        chatForm.setMsg("");
        chatForm.setName("");
        chatForm.setMode("Say");
        model.addAttribute("chatMessages", service.getListMessages());
        return "chat";
    }
    @ModelAttribute("modes")
    public String[] modes() {
        return new String[]{"Say","Shout","Whisper"};
    }
}
