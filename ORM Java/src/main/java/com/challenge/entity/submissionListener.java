package com.challenge.entity;

import javax.persistence.*;

public class submissionListener {

    @PrePersist
    void onPrePersist(submission submission) {
        System.out.println("submissionListener.onPrePersist(): " + submission);
    }

    @PostPersist
    void onPostPersist(submission submission) {
        System.out.println("submissionListener.onPostPersist(): " + submission);
    }

    @PostLoad
    void onPostLoad(submission submission) {
        System.out.println("submissionListener.onPostLoad(): " + submission);
    }

    @PreUpdate
    void onPreUpdate(submission submission) {
        System.out.println("submissionListener.onPreUpdate(): " + submission);
    }

    @PostUpdate
    void onPostUpdate(submission submission) {
        System.out.println("submissionListener.onPostUpdate(): " + submission);
    }

    @PreRemove
    void onPreRemove(submission submission) {
        System.out.println("submissionListener.onPreRemove(): " + submission);
    }

    @PostRemove
    void onPostRemove(submission submission) {
        System.out.println("submissionListener.onPostRemove(): " + submission);
    }
}