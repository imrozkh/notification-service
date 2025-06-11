package com.example.notificationservice.adapters.out.sms;

import org.springframework.stereotype.Component;

import com.example.notificationservice.application.port.out.NotificationProvider;
import com.example.notificationservice.application.port.out.NotificationProviderFactory;
import com.example.notificationservice.domain.NotificationType;
import com.example.notificationservice.domain.SmsSubscription;

@Component
public class DefaultNotificationProviderFactory implements NotificationProviderFactory {
    @Override
    public NotificationProvider getProvider(NotificationType type, SmsSubscription subscription) {
        if (type == NotificationType.SMS) {
            return switch (subscription) {
                case KALEYRA -> new KaleyraSmsProvider();
                case VALUEFIRST -> new ValueFirstSmsProvider();
            };
        }
        throw new IllegalArgumentException("Unsupported notification type: " + type);
    }
}
