package com.challenge.entity;

import com.challenge.entity.acceleration;

import javax.persistence.*;

public class accelerationListener {

    @PrePersist
    void onPrePersist(acceleration acceleration) {
        System.out.println("accelerationListener.onPrePersist(): " + acceleration);
    }

    @PostPersist
    void onPostPersist(acceleration acceleration) {
        System.out.println("accelerationListener.onPostPersist(): " + acceleration);
    }

    @PostLoad
    void onPostLoad(acceleration acceleration) {
        System.out.println("accelerationListener.onPostLoad(): " + acceleration);
    }

    @PreUpdate
    void onPreUpdate(acceleration acceleration) {
        System.out.println("accelerationListener.onPreUpdate(): " + acceleration);
    }

    @PostUpdate
    void onPostUpdate(acceleration acceleration) {
        System.out.println("accelerationListener.onPostUpdate(): " + acceleration);
    }

    @PreRemove
    void onPreRemove(acceleration acceleration) {
        System.out.println("accelerationListener.onPreRemove(): " + acceleration);
    }

    @PostRemove
    void onPostRemove(acceleration acceleration) {
        System.out.println("accelerationListener.onPostRemove(): " + acceleration);
    }
}