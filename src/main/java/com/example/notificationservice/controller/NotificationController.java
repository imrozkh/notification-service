package com.example.notificationservice.controller;

import com.example.notificationservice.provider.SmsSubscription;
import com.example.notificationservice.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/notify")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/email")
    public ResponseEntity<String> sendEmail(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String message = payload.get("message");
        notificationService.sendEmail(to, message);
        return ResponseEntity.ok("Email sent");
    }

    @PostMapping("/sms")
    public ResponseEntity<String> sendSms(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String message = payload.get("message");
        String subscriptionValue = payload.get("subscription");
        SmsSubscription subscription = SmsSubscription.valueOf(subscriptionValue.toUpperCase());
        notificationService.sendSms(subscription, to, message);
        return ResponseEntity.ok("SMS sent");
    }
}
