package com.patterns.lld.examples.notificationsSystem.NotificationChannels;

import com.patterns.lld.examples.notificationsSystem.Publisher;
import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.User.User;

public class SmsNotificationsChannel implements INotificationsChannel {

    @Override
    public boolean sendNotification(User user, Notification notification) {
        String demo = user.getName() + " will receive " + notification.getMessage() + " via SMS ";
        Publisher.smsQueue.add(demo);
        System.out.println(demo);
        return true;
    }
    
}
