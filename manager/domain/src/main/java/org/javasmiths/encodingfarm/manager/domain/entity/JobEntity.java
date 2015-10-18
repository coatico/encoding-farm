/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class JobEntity extends BaseTrackableEntity {

    @Column
    private String jobStatusId;
    @Column
    private String jobTitle;
    @Column
    private int jobVideoId;
    @Column
    private int jobWorkerId;
    @Column(name = "jobCreationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    @JoinColumn(name = "jobStatus", referencedColumnName = "jobStatusDescriptionId")
    @ManyToOne(fetch = FetchType.LAZY)
    private JobStatusDescriptionEntity jobStatus;

    public String getJobStatusId() {
        return jobStatusId;
    }

    public void setJobStatusId(String jobStatusId) {
        this.jobStatusId = jobStatusId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getJobVideoId() {
        return jobVideoId;
    }

    public void setJobVideoId(int jobVideoId) {
        this.jobVideoId = jobVideoId;
    }

    public int getJobWorkerId() {
        return jobWorkerId;
    }

    public void setJobWorkerId(int jobWorkerId) {
        this.jobWorkerId = jobWorkerId;
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
