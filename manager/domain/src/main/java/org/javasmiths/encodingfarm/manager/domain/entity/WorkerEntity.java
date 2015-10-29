/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

/**
 *
 * @author Arne
 */
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name = "WORKERS")
public class WorkerEntity extends BaseTrackableEntity implements Serializable {

    //In deze File worden de Entities aangemaakt voor de tabel in de database.
    @Column
    private String workerName;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<workerJobEntity> workerworkerJob;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<JobStatusDescriptionEntity> workerJobStatusDescriptionEntity;


    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    
    public Collection<workerJobEntity> getWorkerworkerJob() {
        return workerworkerJob;
    }

    public void setWorkerworkerJob(Collection<workerJobEntity> workerworkerJob) {
        this.workerworkerJob = workerworkerJob;
    }

    public Collection<JobStatusDescriptionEntity> getWorkerJobStatusDescriptionEntity() {
        return workerJobStatusDescriptionEntity;
    }

    public void setWorkerJobStatusDescriptionEntity(Collection<JobStatusDescriptionEntity> workerJobStatusDescriptionEntity) {
        this.workerJobStatusDescriptionEntity = workerJobStatusDescriptionEntity;
    }

}
