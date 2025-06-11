# notification-service

Spring Boot service to deliver SMS and Email notifications. This sample service exposes REST endpoints for sending notifications.

## Building and Running

Use Maven to build and run the application:

```bash
./mvnw spring-boot:run
```

The service will start on port `8080`.

## Example Requests

Send an email notification:

```bash
curl -X POST http://localhost:8080/notify/email \
     -H 'Content-Type: application/json' \
     -d '{"to":"user@example.com","message":"Hello"}'
```

Send an SMS notification:

```bash
curl -X POST http://localhost:8080/notify/sms \
     -H 'Content-Type: application/json' \
     -d '{"to":"+15555550123","message":"Hi","subscription":"kaleyra"}'
```
