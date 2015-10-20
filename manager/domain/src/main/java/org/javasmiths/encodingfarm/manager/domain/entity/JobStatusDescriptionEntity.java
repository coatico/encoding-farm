/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author H
 */
@Entity
@Table(name = "JOBSTATUSDESCRIPTION")
public class JobStatusDescriptionEntity extends BaseTrackableEntity {

    @Column(name = "jobStatusDescriptionDescription")
    @Type(type = "text")
    private String jobStatusDescriptionDescription;

    public String getJobStatusDescriptionDescription() {
        return jobStatusDescriptionDescription;
    }

    public void setJobStatusDescriptionDescription(String jobStatusDescriptionDescription) {
        this.jobStatusDescriptionDescription = jobStatusDescriptionDescription;
    }

}
