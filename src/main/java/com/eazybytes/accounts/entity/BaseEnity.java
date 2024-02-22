package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEnity {

    @Column(updatable = false) //will not be updated when the record is updated.
    private LocalDateTime createdAt;

    @Column(updatable = false) //will not be updated when the record is updated.
    private String createdBy;

    @Column(insertable = false) //Do not update these columns when inserting a new record
    private LocalDateTime updatedAt;
    @Column(insertable = false)
    private String updatedBy;

}
