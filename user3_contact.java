package com.example.finalproject;

public class user3_contact {
    private String name,phoneNo, subject, comment;

    public user3_contact(String name, String phoneNo, String subject, String comment){
        this.name= name;
        this.phoneNo= phoneNo;
        this.subject= subject;
        this.comment= comment;
    }

    public String getName() {
        return name;
    }

    public user3_contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public user3_contact setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public user3_contact setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public user3_contact setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        return "user3_contact{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", subject='" + subject + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
