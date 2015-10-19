/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author Elias Serneels
 */
@Entity
@Table(name = "JOBS")
public class JobEntity extends BaseTrackableEntity implements Serializable {

    @Column
    private String jobTitle;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private VideoEntity jobVideo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private WorkerEntity jobWorker;
    @Column(name = "jobCreationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private JobStatusDescriptionEntity jobStatus;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public VideoEntity getJobVideo() {
        return jobVideo;
    }

    public void setJobVideo(VideoEntity jobVideo) {
        this.jobVideo = jobVideo;
    }

    public WorkerEntity getJobWorker() {
        return jobWorker;
    }

    public void setJobWorker(WorkerEntity jobWorker) {
        this.jobWorker = jobWorker;
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

    public JobStatusDescriptionEntity getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusDescriptionEntity jobStatus) {
        this.jobStatus = jobStatus;
    }

}
