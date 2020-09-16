package com.example.vtracker2.Model;

import java.util.HashMap;

public class User {
    private String uid,email,notificationStatus,driverId;
    private HashMap<String,User> acceptList;//List user friend

    public User() {
    }

    public User(String uid, String email, String notificationStatus) {
        this.uid = uid;
        this.email = email;
        acceptList = new HashMap<>();
        this.notificationStatus = notificationStatus;
        driverId = null;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, User> getAcceptList() {
        return acceptList;
    }

    public void setAcceptList(HashMap<String, User> acceptList) {
        this.acceptList = acceptList;
    }

    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
