package com.patterns.lld.examples.notificationsSystem.Notification;

import com.patterns.lld.examples.notificationsSystem.Notification.Notification;

public class Notification {
    private String message;
    private NotificationType type;

    public Notification(String message, NotificationType type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() { return message; }

    public NotificationType getType() {
        return type;
    }
}