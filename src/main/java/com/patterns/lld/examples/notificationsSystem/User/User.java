package com.patterns.lld.examples.notificationsSystem.User;

public class User {

    String uuid;
    String name;
    String emailId;
    Integer phoneNumber;
    
    public User(String uuid, String name, String emailId, Integer phoneNumber) {
        this.uuid = uuid;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }
    public String getUuid() {
        return uuid;
    }
    public String getName() {
        return name;
    }
    public String getEmailId() {
        return emailId;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
}
