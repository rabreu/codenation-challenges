package com.challenge.entity;

import javax.persistence.*;

public class candidateListener {

    @PrePersist
    void onPrePersist(candidate candidate) {
        System.out.println("candidateListener.onPrePersist(): " + candidate);
    }

    @PostPersist
    void onPostPersist(candidate candidate) {
        System.out.println("candidateListener.onPostPersist(): " + candidate);
    }

    @PostLoad
    void onPostLoad(candidate candidate) {
        System.out.println("candidateListener.onPostLoad(): " + candidate);
    }

    @PreUpdate
    void onPreUpdate(candidate candidate) {
        System.out.println("candidateListener.onPreUpdate(): " + candidate);
    }

    @PostUpdate
    void onPostUpdate(candidate candidate) {
        System.out.println("candidateListener.onPostUpdate(): " + candidate);
    }

    @PreRemove
    void onPreRemove(candidate candidate) {
        System.out.println("candidateListener.onPreRemove(): " + candidate);
    }

    @PostRemove
    void onPostRemove(candidate candidate) {
        System.out.println("candidateListener.onPostRemove(): " + candidate);
    }
}