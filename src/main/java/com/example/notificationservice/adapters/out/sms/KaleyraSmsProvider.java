package com.example.notificationservice.adapters.out.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.notificationservice.application.port.out.NotificationProvider;

public class KaleyraSmsProvider implements NotificationProvider {
    private static final Logger logger = LoggerFactory.getLogger(KaleyraSmsProvider.class);

    @Override
    public void send(String to, String message) {
        // Placeholder for integration with Kaleyra APIs
        logger.info("[Kaleyra] Sending SMS to {} with message: {}", to, message);
    }
}
