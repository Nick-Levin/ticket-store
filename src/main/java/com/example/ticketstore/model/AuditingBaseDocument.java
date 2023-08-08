package com.example.ticketstore.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.util.Date;

@Data
public abstract class AuditingBaseDocument {

    @Id
    private String id;

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date lastModified;

    @Version
    private Integer version;

}
