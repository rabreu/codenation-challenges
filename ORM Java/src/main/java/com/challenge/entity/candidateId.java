package com.challenge.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class candidateId {
    @ManyToOne
    private user user;

    @ManyToOne
    private acceleration acceleration;

    @ManyToOne
    private company company;

    public com.challenge.entity.acceleration getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(com.challenge.entity.acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public com.challenge.entity.user getUser() {
        return user;
    }

    public void setUser(com.challenge.entity.user user) {
        this.user = user;
    }

    public com.challenge.entity.company getCompany() {
        return company;
    }

    public void setCompany(com.challenge.entity.company company) {
        this.company = company;
    }
}
