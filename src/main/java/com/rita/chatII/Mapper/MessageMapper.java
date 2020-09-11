package com.rita.chatII.Mapper;

import com.rita.chatII.Model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {
    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getAllMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES(#{name}, #{msg})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addMessage(ChatMessage chatMessage);
}
