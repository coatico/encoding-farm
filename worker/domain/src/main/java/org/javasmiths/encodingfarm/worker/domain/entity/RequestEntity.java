package org.javasmiths.encodingfarm.worker.domain.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author Pieter
 */
@Entity
@Table(name = "REQUESTS")
public class RequestEntity extends BaseTrackableEntity {
    
    @OneToMany(targetEntity = JobEntity.class, fetch = FetchType.LAZY, mappedBy = "request")
    private List<JobEntity> jobs;
    
    @Column
    private String path;

    public List<JobEntity> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobEntity> jobs) {
        this.jobs = jobs;
    }    

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
