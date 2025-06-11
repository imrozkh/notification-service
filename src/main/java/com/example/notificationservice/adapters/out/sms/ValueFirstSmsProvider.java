package com.example.notificationservice.adapters.out.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.notificationservice.application.port.out.NotificationProvider;

public class ValueFirstSmsProvider implements NotificationProvider {
    private static final Logger logger = LoggerFactory.getLogger(ValueFirstSmsProvider.class);

    @Override
    public void send(String to, String message) {
        // Placeholder for integration with ValueFirst APIs
        logger.info("[ValueFirst] Sending SMS to {} with message: {}", to, message);
    }
}
