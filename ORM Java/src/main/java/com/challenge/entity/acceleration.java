package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity @EntityListeners(accelerationListener.class)
public class acceleration {
    @Id @GeneratedValue
    private int id;

    @Column(length = 100) @Size(max = 100) @NotNull
    private String name;

    @Column(length = 50) @Size(max = 50) @NotNull
    private String slug;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private challenge challenge;

    @Column @NotNull @CreatedDate
    private Date createdat;

    @OneToMany
    private Collection<candidate> candidate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public com.challenge.entity.challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(com.challenge.entity.challenge challenge) {
        this.challenge = challenge;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}
