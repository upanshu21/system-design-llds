package com.patterns.lld.examples.notificationsSystem.NotificationChannels;

import com.patterns.lld.examples.notificationsSystem.Publisher;
import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.Notification.NotificationType;
import com.patterns.lld.examples.notificationsSystem.User.User;

public class PushNotificationsChannel implements INotificationsChannel {

    @Override
    public boolean sendNotification(User user, Notification notification) {
        if (notification.getType() == NotificationType.PUSH) {
            String demo = user.getName() + " will receive " + notification.getMessage() + " via: " + notification.getType();
            Publisher.pushQueue.add(demo);
            System.out.println(demo);
            return true;
        } else {
            System.out.println("Either the type is wrong or queue is unavailable");
            return false;
            }   
        }
}
    

