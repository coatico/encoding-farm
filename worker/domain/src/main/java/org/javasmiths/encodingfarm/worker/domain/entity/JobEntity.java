
package org.javasmiths.encodingfarm.worker.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author Pieter
 */
@Entity
@Table(name = "JOB")
public class JobEntity extends BaseTrackableEntity {
    
    @OneToOne(targetEntity = RequestEntity.class, fetch = FetchType.LAZY, mappedBy ="JOB")
    private RequestEntity request;
    
    @Column
    private String status;

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