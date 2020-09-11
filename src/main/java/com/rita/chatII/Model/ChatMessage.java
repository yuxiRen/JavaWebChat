package com.rita.chatII.Model;

public class ChatMessage {
    private String name;
    private String msg;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChatMessage(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public ChatMessage() {
        this.name = "";
        this.msg = "";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }
}
