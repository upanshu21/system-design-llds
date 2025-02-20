package com.patterns.lld.examples.notificationsSystem;

import com.patterns.lld.examples.notificationsSystem.Notification.Notification;
import com.patterns.lld.examples.notificationsSystem.Notification.NotificationType;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.EmailNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.INotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.PushNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.SmsNotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.User.User;
import com.patterns.lld.examples.notificationsSystem.subscriptionManager.SubscriptionManager;

public class NotificationsDemo {

    public static void main(String[] args) {

        INotificationsChannel email = new EmailNotificationsChannel();
        INotificationsChannel sms = new SmsNotificationsChannel();
        INotificationsChannel push = new PushNotificationsChannel();

        SubscriptionManager manager = new SubscriptionManager();
        NotificationSystem notificationSystem = new NotificationSystem(manager);

        User user1 = new User("1","tobby", "tobby@tobby.com", 12345678 );
        // User user2 = new User("1","toby", "tobby@toby.com", 1243345678 );
        // User user3 = new User("1","tobbby", "tobby@tobbby.com", 1234454678 );

        manager.subscribe(user1, push);
        manager.subscribe(user1, sms);
        manager.subscribe(user1, email);

        Notification emailNotification = new Notification("Please fill out the tax form on priority", NotificationType.EMAIL);
        Notification smsNotification = new Notification("Please fill out the tax form on priority", NotificationType.SMS);
        Notification pushNotification = new Notification("Please fill out the tax form on priority", NotificationType.PUSH);

        
        notificationSystem.notifyUser(user1, emailNotification);
        notificationSystem.notifyUser(user1, smsNotification);
        notificationSystem.notifyUser(user1, pushNotification);

    }
    
}
