package com.patterns.lld.examples.notificationsSystem.NotificationChannels;

import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.User.User;

public interface INotificationsChannel {

    boolean sendNotification(User user, Notification notification);

}
