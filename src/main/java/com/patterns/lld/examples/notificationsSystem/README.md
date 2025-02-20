Design Notification System which should allow users to send and receive notifications through various channels. The goal is to design an efficient and modular class hierarchy that facilitates the sending and receiving of notifications while adhering to object-oriented design principles.

Requirements:
Users: The system should support users, each identified by a unique user ID. Users can subscribe to different types of notifications and manage their notification preferences.
Notification Channels: The system should support multiple notification channels, such as email, SMS, push notifications, and in-app notifications. Each channel has its own delivery mechanism and requirements.
Notification Types: Users can subscribe to different types of notifications, such as new messages, friend requests, system alerts, or custom events. Each notification type may have specific content and delivery requirements.
Bonus Requirements:
Personalization: Notifications may need to be personalized with user-specific information, such as the user's name or specific details related to the notification type.
Opt-out and Preferences: Users should have the ability to opt out of specific notification types or unsubscribe from the notification service altogether. They should be able to manage their notification preferences, such as frequency or delivery channels.



Thought process behind building:

INotificationsChannel email = new EmailNotifications();
INotificationsChannel sms = new SmsNotifications();
INotificationsChannel push = new PushNotifications();

//  subscriptionmanager

SubscriptionMananger manager = new SubscriptionMananger();
NotificationSystem notificationSystem = new NotificationSystem(manager);

User user1 = new User(id, name, Optional<phone>, Optional<email>)
Notification notification = new Notification("yo");

notificationSystem.subscribe(user1, email);
notificationSystem.subscribe(user1, push);
notificationSystem.send(user, notification);



