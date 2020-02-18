package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity @EntityListeners(candidateListener.class)
public class candidate {

    @EmbeddedId @Embedded
    private candidateEmbeddable candidateEmbeddable;

    @Column @NotNull
    private int status;

    @Column @NotNull @CreatedDate
    private Date createdat;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}