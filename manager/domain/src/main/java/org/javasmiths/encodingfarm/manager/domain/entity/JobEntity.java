package org.javasmiths.encodingfarm.manager.domain.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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

    @ManyToOne(targetEntity = JobStatusDescriptionEntity.class, fetch = FetchType.LAZY)
    private VideoEntity jobVideo;

    @ManyToOne(targetEntity = JobStatusDescriptionEntity.class, fetch = FetchType.LAZY)
    private JobStatusDescriptionEntity jobStatus;

    @ManyToOne(targetEntity = WorkerEntity.class, fetch = FetchType.LAZY)
    private WorkerEntity jobWorker;

    @Column(name = "jobCreationDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Column(name = "jobCompletionDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    @Column(name = "jobprogress", nullable = false, columnDefinition = "int default 0")
    private int jobprogress;

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

    public VideoEntity getJobVideo() {
        return jobVideo;
    }

    public void setJobVideo(VideoEntity jobVideo) {
        this.jobVideo = jobVideo;
    }

    public JobStatusDescriptionEntity getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusDescriptionEntity jobStatus) {
        this.jobStatus = jobStatus;
    }

    public WorkerEntity getJobWorker() {
        return jobWorker;
    }

    public void setJobWorker(WorkerEntity jobWorker) {
        this.jobWorker = jobWorker;
    }

    public int getJobprogress() {
        return jobprogress;
    }

    public void setJobprogress(int jobprogress) {
        this.jobprogress = jobprogress;
    }


}
