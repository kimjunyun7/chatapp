package com.example.chatapp.Repository;

import com.example.chatapp.Model.ChatRoom;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ChatRoomRepository {
    private Map<String, ChatRoom> chatRoomMap; // @@ temp without db

    @PostConstruct
    private void init(){
        chatRoomMap = new LinkedHashMap<>();
    }

    // Find all rooms
    public List<ChatRoom> findAllRoom(){
        List chatRooms = new ArrayList<>(chatRoomMap.values());
        Collections.reverse(chatRooms);
        return chatRooms;
    }

    // Find a room and send a received message to the room
    public ChatRoom findRoomById(String id){
        return chatRoomMap.get(id);
    }

    // Create a new chat room
    public ChatRoom createChatRoom(String name){
        ChatRoom chatRoom = ChatRoom.create(name);
        chatRoomMap.put(chatRoom.getRoomId(), chatRoom);
        return chatRoom;
    }
}
