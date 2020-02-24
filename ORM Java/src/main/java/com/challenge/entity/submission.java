package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class submission {

    @EmbeddedId
    @Embedded
    private submissionId submissionId;

    @Column
    @NotNull
    private float score;

    @Column
    @NotNull
    @CreatedDate
    private Date createdat;

    public submissionId getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(submissionId submissionId) {
        this.submissionId = submissionId;
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
