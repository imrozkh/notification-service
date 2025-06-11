package com.example.notificationservice.application.port.out;

public interface NotificationProvider {
    void send(String to, String message);
}
