package com.example.notificationservice.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.notificationservice.application.port.out.NotificationProvider;
import com.example.notificationservice.application.port.in.NotificationUseCase;
import com.example.notificationservice.application.port.out.NotificationProviderFactory;
import com.example.notificationservice.domain.NotificationType;
import com.example.notificationservice.domain.SmsSubscription;

@Service
public class NotificationService implements NotificationUseCase {
    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final NotificationProviderFactory providerFactory;

    public NotificationService(NotificationProviderFactory providerFactory) {
        this.providerFactory = providerFactory;
    }

    public void sendEmail(String to, String message) {
        // Placeholder implementation
        logger.info("Sending email to {} with message: {}", to, message);
    }

    public void sendSms(SmsSubscription subscription, String to, String message) {
        NotificationProvider provider =
                providerFactory.getProvider(NotificationType.SMS, subscription);
        provider.send(to, message);
    }
}
