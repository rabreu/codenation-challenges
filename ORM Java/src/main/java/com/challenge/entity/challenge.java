package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity @EntityListeners(challengeListener.class)
public class challenge {
    @Id
    private int id;

    @Column(length = 100) @Size(max = 100) @NotNull
    private String name;

    @Column(length = 50) @Size(max = 50) @NotNull
    private String slug;

    @Column @NotNull @CreatedDate
    private Date createdat;

    @OneToMany
    private Collection<acceleration> acceleration;

    @OneToMany
    private Collection<submission> submission;

    public Collection<com.challenge.entity.acceleration> getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Collection<com.challenge.entity.acceleration> acceleration) {
        this.acceleration = acceleration;
    }

    public void setSubmission(Collection<com.challenge.entity.submission> submission) {
        this.submission = submission;
    }

    public Collection<com.challenge.entity.submission> getSubmission() {
        return submission;
    }

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

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}
