package iub.oop.courseprojects.oopfinalproject;
package com.example.oopispproject;
origin/Abid

public abstract class User {
    protected String userID, userPassword, userType;

    public User(String userID, String userPassword, String userType) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
