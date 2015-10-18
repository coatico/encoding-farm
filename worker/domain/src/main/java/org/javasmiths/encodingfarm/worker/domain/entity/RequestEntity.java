package org.javasmiths.encodingfarm.worker.domain.entity;

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
@Table(name = "REQUEST")
public class RequestEntity extends BaseTrackableEntity {
    
    @OneToMany(targetEntity = JobEntity.class, fetch = FetchType.LAZY, mappedBy = "request")
    private JobEntity job;
    
    @Column
    private String video_path;

    public JobEntity getJob() {
        return job;
    }

    public void setJob(JobEntity job) {
        this.job = job;
    }    

    public String getVideo_path() {
        return video_path;
    }

    public void setVideo_path(String video_path) {
        this.video_path = video_path;
    }

}
