package com.team.ms.dao;

import com.team.ms.pojo.Message;

import java.util.List;

public interface MessageMapper {
    List<Message> selectMessage();
    List<Message> selectMessageByPublisher(String publisher);
    List<Message> selectMessageById(String mid);
    void insertMessage(Message message);
    void deleteMessageById(String mid);
    void updateMessageById(Message message);
}
