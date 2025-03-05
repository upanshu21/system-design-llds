package com.patterns.lld.examples.notificationsSystem;

import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.EmailNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.INotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.NotificationsFactory;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.PushNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.SmsNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.User.User;
import com.patterns.lld.examples.notificationsSystem.subscriptionManager.SubscriptionManager;

public class NotificationsDemo {

    public static void main(String[] args) {

        INotificationsChannel email = NotificationsFactory.createChannel("email");
        INotificationsChannel sms = NotificationsFactory.createChannel("sms");
        INotificationsChannel push = NotificationsFactory.createChannel("push");

        SubscriptionManager manager = new SubscriptionManager();
        NotificationSystem notificationSystem = new NotificationSystem(manager);

        User user1 = new User("1","tobby", "tobby@tobby.com", 12345678 );
        // User user2 = new User("1","toby", "tobby@toby.com", 1243345678 );
        // User user3 = new User("1","tobbby", "tobby@tobbby.com", 1234454678 );

        manager.subscribe(user1, push);
        manager.subscribe(user1, sms);

        Notification notification = new Notification("Please fill out the tax form on priority");
        notificationSystem.notifyUser(user1, notification);

        manager.unsubscribe(user1, push);
        notificationSystem.notifyUser(user1, notification);
    }
    
}
