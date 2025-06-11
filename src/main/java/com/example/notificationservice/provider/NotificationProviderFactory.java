package com.example.notificationservice.provider;

import org.springframework.stereotype.Component;

@Component
public class NotificationProviderFactory {
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
