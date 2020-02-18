package com.challenge.entity;

import javax.persistence.*;

public class companyListener {

    @PrePersist
    void onPrePersist(company company) {
        System.out.println("companyListener.onPrePersist(): " + company);
    }

    @PostPersist
    void onPostPersist(company company) {
        System.out.println("companyListener.onPostPersist(): " + company);
    }

    @PostLoad
    void onPostLoad(company company) {
        System.out.println("companyListener.onPostLoad(): " + company);
    }

    @PreUpdate
    void onPreUpdate(company company) {
        System.out.println("companyListener.onPreUpdate(): " + company);
    }

    @PostUpdate
    void onPostUpdate(company company) {
        System.out.println("companyListener.onPostUpdate(): " + company);
    }

    @PreRemove
    void onPreRemove(company company) {
        System.out.println("companyListener.onPreRemove(): " + company);
    }

    @PostRemove
    void onPostRemove(company company) {
        System.out.println("companyListener.onPostRemove(): " + company);
    }
}