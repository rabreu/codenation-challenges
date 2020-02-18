package com.challenge.entity;

import javax.persistence.*;

public class challengeListener {

    @PrePersist
    void onPrePersist(challenge challenge) {
        System.out.println("challengeListener.onPrePersist(): " + challenge);
    }

    @PostPersist
    void onPostPersist(challenge challenge) {
        System.out.println("challengeListener.onPostPersist(): " + challenge);
    }

    @PostLoad
    void onPostLoad(challenge challenge) {
        System.out.println("challengeListener.onPostLoad(): " + challenge);
    }

    @PreUpdate
    void onPreUpdate(challenge challenge) {
        System.out.println("challengeListener.onPreUpdate(): " + challenge);
    }

    @PostUpdate
    void onPostUpdate(challenge challenge) {
        System.out.println("challengeListener.onPostUpdate(): " + challenge);
    }

    @PreRemove
    void onPreRemove(challenge challenge) {
        System.out.println("challengeListener.onPreRemove(): " + challenge);
    }

    @PostRemove
    void onPostRemove(challenge challenge) {
        System.out.println("challengeListener.onPostRemove(): " + challenge);
    }
}