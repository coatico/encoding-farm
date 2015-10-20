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
    private String workerFirstName;
    @Column
    private String workerLastName;
    @Column
    private String workerGender;
    @Column
    private String workerBirthdate;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<workerJobEntity> workerworkerJob;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<JobStatusDescriptionEntity> workerJobStatusDescriptionEntity;
    @Column
    private String workerEmail;

    public String getWorkerFirstName() {
        return workerFirstName;
    }

    public void setWorkerFirstName(String workerFirstName) {
        this.workerFirstName = workerFirstName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }

    public String getWorkerGender() {
        return workerGender;
    }

    public void setWorkerGender(String workerGender) {
        this.workerGender = workerGender;
    }

    public String getWorkerBirthdate() {
        return workerBirthdate;
    }

    public void setWorkerBirthdate(String workerBirthdate) {
        this.workerBirthdate = workerBirthdate;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
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
