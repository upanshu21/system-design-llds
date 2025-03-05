package com.patterns.lld.examples.notificationsSystem.NotificationChannels;

public class NotificationsFactory {

    public static INotificationsChannel createChannel(String type) {

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotificationsChannel();
            case "sms":
                return new SmsNotificationsChannel();
            case "push":
                return new PushNotificationsChannel();
            default:
                throw new IllegalArgumentException("Unknown channel type: " + type);
        }
    }
    
}
