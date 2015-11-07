/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author H
 */
@Entity
@Table(name = "LOGS")
public class logEntity extends BaseTrackableEntity implements Serializable {

    @Column(name = "logDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logDateTime;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<WorkerEntity> lobWorker;
    @Column(name = "logDescription")
    @Type(type = "text")
    private String logDescription;

    public Date getLogDateTime() {
        return logDateTime;
    }

    public void setLogDateTime(Date logDateTime) {
        this.logDateTime = logDateTime;
    }

    public Collection<WorkerEntity> getLobWorker() {
        return lobWorker;
    }

    public void setLobWorker(Collection<WorkerEntity> lobWorker) {
        this.lobWorker = lobWorker;
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }
    
}
