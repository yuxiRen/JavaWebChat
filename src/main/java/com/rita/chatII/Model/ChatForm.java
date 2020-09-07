package com.rita.chatII.Model;

public class ChatForm {
    private String name;
    private String msg;
    private String mode;

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getMode() {
        return mode;
    }

    public ChatForm() {
    }

    public ChatForm(String name, String msg, String mode) {
        this.name = name;
        this.msg = msg;
        this.mode = mode;
    }
}
