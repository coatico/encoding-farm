/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.common.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

/**
 *
 * @author thomas
 */
@MappedSuperclass
public class BaseTrackableEntity implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();
    private String workerID = UUID.randomUUID().toString();
    private String videoID = UUID.randomUUID().toString();

    @Version
    @Column(name = "V")
    private Long version;

    @Column(name = "CREATED_ON")
    private Date createdOn;
    @Column(name = "LAST_UPDATED_ON")
    private Date lastUpdatedOn;

    @PreUpdate
    protected void onUpdate() {
        lastUpdatedOn = new Date();
    }

    @PrePersist
    protected void onCreate() {
        createdOn = new Date();
        onUpdate();
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

}
