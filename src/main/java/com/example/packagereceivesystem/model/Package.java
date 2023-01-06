package com.example.packagereceivesystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Package {
    @Id
    private String packageID;
    private String packageType;
    private String logisticsType ;
    private Boolean isReceipted ;
    private Boolean isNotify ;
    private String deliverTime;

    public Package(String packageID, String packageType, String logisticsType, Boolean isReceipted, Boolean isNotify, String deliverTime) {
        this.packageID = packageID;
        this.packageType = packageType;
        this.logisticsType = logisticsType;
        this.isReceipted = isReceipted;
        this.isNotify = isNotify;
        this.deliverTime = deliverTime;
    }

    public Package() {

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

    public String getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Boolean getReceipted() {
        return isReceipted;
    }

    public void setReceipted(Boolean receipted) {
        isReceipted = receipted;
    }

    public Boolean getNotify() {
        return isNotify;
    }

    public void setNotify(Boolean notify) {
        isNotify = notify;
    }

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }
}
