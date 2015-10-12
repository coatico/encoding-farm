
package org.javasmiths.encodingfarm.worker.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author Pieter
 */
@Entity
@Table(name = "JOBS")
public class JobEntity extends BaseTrackableEntity {
    
    @Column
    private String video_path;
    
    @Column
    private String status;

    public String getVideo_path() {
        return video_path;
    }

    public void setVideo_path(String video_path) {
        this.video_path = video_path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
    
}