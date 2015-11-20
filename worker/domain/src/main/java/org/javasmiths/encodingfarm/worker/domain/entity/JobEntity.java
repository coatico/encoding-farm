package org.javasmiths.encodingfarm.worker.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author Pieter
 */
@Entity
@Table(name = "JOB")
public class JobEntity extends BaseTrackableEntity {

    @ManyToOne(targetEntity = RequestEntity.class, fetch = FetchType.LAZY)
    private RequestEntity request;
    
    @ManyToOne(targetEntity = WorkerEntity.class, fetch = FetchType.LAZY)
    private WorkerEntity worker;
    
    @Column
    private String status;

    public WorkerEntity getWorker() {
        return worker;
    }

    public void setWorker(WorkerEntity worker) {
        this.worker = worker;
    }

    public RequestEntity getRequest() {
        return request;
    }

    public void setRequest(RequestEntity request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
