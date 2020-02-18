package com.challenge.entity;

import javax.persistence.*;

public class userListener {

    @PrePersist
    void onPrePersist(user user) {
        System.out.println("userListener.onPrePersist(): " + user);
    }

    @PostPersist
    void onPostPersist(user user) {
        System.out.println("userListener.onPostPersist(): " + user);
    }

    @PostLoad
    void onPostLoad(user user) {
        System.out.println("userListener.onPostLoad(): " + user);
    }

    @PreUpdate
    void onPreUpdate(user user) {
        System.out.println("userListener.onPreUpdate(): " + user);
    }

    @PostUpdate
    void onPostUpdate(user user) {
        System.out.println("userListener.onPostUpdate(): " + user);
    }

    @PreRemove
    void onPreRemove(user user) {
        System.out.println("userListener.onPreRemove(): " + user);
    }

    @PostRemove
    void onPostRemove(user user) {
        System.out.println("userListener.onPostRemove(): " + user);
    }
}