package com.patterns.lld.examples.notificationsSystem;

import java.util.Set;

import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.INotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.User.User;
import com.patterns.lld.examples.notificationsSystem.subscriptionManager.SubscriptionManager;

public class NotificationSystem {
    
    private SubscriptionManager manager;

    public NotificationSystem(SubscriptionManager manager) {
        this.manager = manager;
    }

    boolean notifyUser(User user, Notification notification) {
        Set<INotificationsChannel> channels = manager.getSubscribedChannels(user);
        for (INotificationsChannel channel : channels) {
            channel.sendNotification(user, notification);
        }
        return false;
    }

}
