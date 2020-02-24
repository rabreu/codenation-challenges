package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    @Size(max = 100)
    @NotNull
    private String fullname;

    @Column(length = 100)
    @Size(max = 100)
    @NotNull
    @Email
    private String email;

    @Column(length = 50)
    @Size(max = 50)
    @NotNull
    private String nickname;

    @Column(length = 255)
    @NotNull
    @Size(max = 255)
    private String Password;

    @Column
    @NotNull
    @CreatedDate
    private Date createdat;

    @OneToMany
    private Collection<candidate> candidate;

    @OneToMany
    private Collection<submission> submission;

    public Collection<com.challenge.entity.candidate> getCandidate() {
        return candidate;
    }

    public void setCandidate(Collection<com.challenge.entity.candidate> candidate) {
        this.candidate = candidate;
    }

    public Collection<com.challenge.entity.submission> getSubmission() {
        return submission;
    }

    public void setSubmission(Collection<com.challenge.entity.submission> submission) {
        this.submission = submission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}
