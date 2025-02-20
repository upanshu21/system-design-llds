package com.patterns.lld.examples.notificationsSystem.subscriptionManager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.patterns.lld.examples.notificationsSystem.NotificationChannels.INotificationsChannel;
import com.patterns.lld.examples.notificationsSystem.User.User;

public class SubscriptionManager {

    private Map<String, Set<INotificationsChannel>> subscriptions = new HashMap<>();

    public boolean subscribe(User user, INotificationsChannel channel) {
        if(subscriptions.computeIfAbsent(user.getUuid(), k -> new HashSet<>()).add(channel)) {
            return true;
        }
        return false;
    }
    
    public boolean unsubscribe(User user, INotificationsChannel channel) {
        Set<INotificationsChannel> userSubscriptions = subscriptions.get(user.getUuid());
        if (userSubscriptions != null && userSubscriptions.remove(channel)) {
            return true;
        }
        System.out.println("Failed or no subscription present");
        return false;
    }

    public Set<INotificationsChannel> getSubscribedChannels(User user) {
        return subscriptions.getOrDefault(user.getUuid(), new HashSet<>());
    }
    
}
