package com.example.notificationservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void sendEmail(String to, String message) {
        // Placeholder implementation
        logger.info("Sending email to {} with message: {}", to, message);
    }

    public void sendSms(String to, String message) {
        // Placeholder implementation
        logger.info("Sending SMS to {} with message: {}", to, message);
    }
}
