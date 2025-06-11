package com.example.notificationservice.adapters.in.web;

import com.example.notificationservice.domain.SmsSubscription;
import com.example.notificationservice.application.port.in.NotificationUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/notify")
public class NotificationController {
    private final NotificationUseCase notificationUseCase;

    public NotificationController(NotificationUseCase notificationUseCase) {
        this.notificationUseCase = notificationUseCase;
    }

    @PostMapping("/email")
    public ResponseEntity<String> sendEmail(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String message = payload.get("message");
        notificationUseCase.sendEmail(to, message);
        return ResponseEntity.ok("Email sent");
    }

    @PostMapping("/sms")
    public ResponseEntity<String> sendSms(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String message = payload.get("message");
        String subscriptionValue = payload.get("subscription");
        SmsSubscription subscription = SmsSubscription.valueOf(subscriptionValue.toUpperCase());
        notificationUseCase.sendSms(subscription, to, message);
        return ResponseEntity.ok("SMS sent");
    }
}
