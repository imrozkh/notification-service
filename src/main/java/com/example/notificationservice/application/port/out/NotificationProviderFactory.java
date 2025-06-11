package com.example.notificationservice.application.port.out;

import com.example.notificationservice.domain.NotificationType;
import com.example.notificationservice.domain.SmsSubscription;

public interface NotificationProviderFactory {
    NotificationProvider getProvider(NotificationType type, SmsSubscription subscription);
}
