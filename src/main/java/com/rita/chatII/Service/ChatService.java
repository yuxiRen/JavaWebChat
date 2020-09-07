package com.rita.chatII.Service;

import com.rita.chatII.Model.ChatForm;
import com.rita.chatII.Model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private List<ChatMessage> listMessages;
    @PostConstruct
    public void postConstruct() {
        this.listMessages = new ArrayList<>();
    }

    public List<ChatMessage> getListMessages() {
        return listMessages;
    }
    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setName(chatForm.getName());
        switch (chatForm.getMode()) {
            case "Say":
                newMessage.setMsg(chatForm.getMsg());
                break;
            case "Shout":
                newMessage.setMsg(chatForm.getMsg().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMsg(chatForm.getMsg().toLowerCase());
                break;
        }
        listMessages.add(newMessage);
    }
}
