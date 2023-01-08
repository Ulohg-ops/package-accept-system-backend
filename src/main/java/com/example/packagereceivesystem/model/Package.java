package com.example.packagereceivesystem.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Package {
    @Id
    private String packageID;
    private String packageType;
    private String recipient ;
    private String isReceipted ;
    private String isNotify ;
    
    @CreationTimestamp
    @Column(name="creationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;

    public Package(){

    }

    public Package(String packageID, String packageType, String recipient, String isReceipted, String isNotify, Timestamp  creationDateTime) {
        this.packageID = packageID;
        this.packageType = packageType;
        this.recipient = recipient;
        this.isReceipted = isReceipted;
        this.isNotify = isNotify;
        this.creationDateTime = creationDateTime;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getIsReceipted() {
        return isReceipted;
    }

    public void setIsReceipted(String isReceipted) {
        this.isReceipted = isReceipted;
    }

    public String getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(String isNotify) {
        this.isNotify = isNotify;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Timestamp  creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
