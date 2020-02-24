package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class company {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 100)
    @Size(max = 100)
    @NotNull
    private String name;

    @Column(length = 50)
    @Size(max = 50)
    @NotNull
    private String slug;

    @Column
    @NotNull
    @CreatedDate
    private Date createdat;

    @OneToMany
    private Collection<candidate> candidate;

    public Collection<com.challenge.entity.candidate> getCandidate() {
        return candidate;
    }

    public void setCandidate(Collection<com.challenge.entity.candidate> candidate) {
        this.candidate = candidate;
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
