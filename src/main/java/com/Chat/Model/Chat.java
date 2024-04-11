package com.Chat.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "chats")
public class Chat {
        @Id
        private String chatID;
        private String senderID;
        private String receiverID;
        private String message;
        private String senderName;
        private String receiverName;
        private LocalDateTime dateTime;

        public Chat() {
            // Default constructor
        }

        public Chat(String ChatID, String SenderID, String ReceiverID, String Message, String SenderName, String ReceiverName, LocalDateTime DateTimee) {
            this.chatID = ChatID;
            this.senderID = SenderID;
            this.receiverID = ReceiverID;
            this.message = Message;
            this.senderName = SenderName;
            this.receiverName = ReceiverName;
            this.dateTime = DateTimee;
        }

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
