package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity @EntityListeners(submissionListener.class)
public class submission {

    @EmbeddedId @Embedded
    private submissionEmbeddable submissionEmbeddable;

    @Column @NotNull
    private float score;

    @Column @NotNull @CreatedDate
    private Date createdat;

    public com.challenge.entity.submissionEmbeddable getSubmissionEmbeddable() {
        return submissionEmbeddable;
    }

    public void setSubmissionEmbeddable(com.challenge.entity.submissionEmbeddable submissionEmbeddable) {
        this.submissionEmbeddable = submissionEmbeddable;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}
