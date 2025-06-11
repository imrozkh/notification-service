package com.example.notificationservice.application.port.in;

import com.example.notificationservice.domain.SmsSubscription;

public interface NotificationUseCase {
    void sendEmail(String to, String message);

    void sendSms(SmsSubscription subscription, String to, String message);
}
