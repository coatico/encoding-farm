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
 * @author Elias Serneels
 */
@Entity
@Table(name = "JOBS")
public class JobEntity extends BaseTrackableEntity implements Serializable {

    @Column(name = "jobTitle")
    @Type(type = "text")
    private String jobTitle;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<VideoEntity> jobVideo;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<WorkerEntity> jobWorker;
    @Column(name = "jobCreationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<JobStatusDescriptionEntity> jobStatus;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getJobCreationDateTime() {
        return jobCreationDateTime;
    }

    public void setJobCreationDateTime(Date jobCreationDateTime) {
        this.jobCreationDateTime = jobCreationDateTime;
    }

    public Date getJobCompletionDateTime() {
        return jobCompletionDateTime;
    }

    public void setJobCompletionDateTime(Date jobCompletionDateTime) {
        this.jobCompletionDateTime = jobCompletionDateTime;
    }

    public Collection<JobStatusDescriptionEntity> getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Collection<JobStatusDescriptionEntity> jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Collection<VideoEntity> getJobVideo() {
        return jobVideo;
    }

    public void setJobVideo(Collection<VideoEntity> jobVideo) {
        this.jobVideo = jobVideo;
    }

    public Collection<WorkerEntity> getJobWorker() {
        return jobWorker;
    }

    public void setJobWorker(Collection<WorkerEntity> jobWorker) {
        this.jobWorker = jobWorker;
    }

}
