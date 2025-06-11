package com.example.notificationservice.provider;

public interface NotificationProvider {
    void send(String to, String message);
}
