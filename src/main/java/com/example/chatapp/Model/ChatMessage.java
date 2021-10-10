package com.example.chatapp.Model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ChatMessage {
    private String chatRoomId;
    private String writer;
    private String message;
    private MessageType type;

    // If message is for when user entered, sent chat or leaved
    public enum MessageType {
        ENTER, CHAT, LEAVE
    }
}
