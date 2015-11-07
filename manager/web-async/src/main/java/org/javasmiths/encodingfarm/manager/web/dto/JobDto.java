/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.dto;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.javasmiths.encodingfarm.manager.domain.entity.JobStatusDescriptionEntity;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author thomas
 */
public class JobDto {

    private String id;
    private String jobTitle;
    private Collection<VideoEntity> jobVideo;
    private Collection<WorkerEntity> jobWorker;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    private Collection<JobStatusDescriptionEntity> jobStatus;
    private String workerID;
    private String videoID;
 //   private String status;

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

   
    /*
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
*/
    public String getjobTitle() {
        return jobTitle;
    }

    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

}
