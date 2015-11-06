package org.javasmiths.encodingfarm.manager.web.view;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.javasmiths.encodingfarm.manager.domain.entity.JobStatusDescriptionEntity;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;
import org.javasmiths.encodingfarm.manager.web.dto.JobDto;
import org.javasmiths.encodingfarm.manager.web.facade.JobFacade;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author H
 */
@RequestScoped
@Named("job")
public class JobView implements Serializable {

    private String jobTitle;
    private Collection<VideoEntity> jobVideo;
    private Collection<WorkerEntity> jobWorker;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCreationDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobCompletionDateTime;
    private Collection<JobStatusDescriptionEntity> jobStatus;
    private List<JobDto> list = new LinkedList<>();
    private String WorkerID;
    private String VideoID;

    public String getWorkerID() {
        return WorkerID;
    }

    public void setWorkerID(String WorkerID) {
        this.WorkerID = WorkerID;
    }

    public String getVideoID() {
        return VideoID;
    }

    public void setVideoID(String VideoID) {
        this.VideoID = VideoID;
    }

    @EJB
    private JobFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(jobTitle, jobCreationDateTime);
        list = facade.listAll();
    }

    public void delete(String id) {
        facade.delete(id);
        list = facade.listAll();
    }

    public void update(String id, String jobTitle, Date jobCreationDateTime, String WorkerID, String VideoID) {
        facade.update(id, jobTitle, jobCreationDateTime, WorkerID, VideoID);
        list = facade.listAll();
        FacesMessage msg = new FacesMessage("Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getjobTitle() {
        return jobTitle;
    }

    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<JobDto> getList() {
        return list;
    }

    public void setList(List<JobDto> list) {
        this.list = list;
    }

    public void deleteById(String id) {
        facade.delete(id);
        list = facade.listAll();
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

    public JobFacade getFacade() {
        return facade;
    }

    public void setFacade(JobFacade facade) {
        this.facade = facade;
    }

}
