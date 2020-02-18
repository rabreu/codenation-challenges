package com.challenge.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class submissionEmbeddable {
    @ManyToOne
    private challenge challenge;

    @ManyToOne
    private user user;

    public com.challenge.entity.user getUser() {
        return user;
    }

    public void setUser(com.challenge.entity.user user) {
        this.user = user;
    }

    public com.challenge.entity.challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(com.challenge.entity.challenge challenge) {
        this.challenge = challenge;
    }
}
