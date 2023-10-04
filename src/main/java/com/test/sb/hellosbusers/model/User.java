package com.test.sb.hellosbusers.model;

public class User {
    private String id;
    private String userFirstName;
    private String userLastName;
    private String userEmailAddress;

    public User() {
    }

    public User(String id, String userFirstName, String userLastName, String userEmailAddress) {
        this.id = id;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmailAddress = userEmailAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }
}
