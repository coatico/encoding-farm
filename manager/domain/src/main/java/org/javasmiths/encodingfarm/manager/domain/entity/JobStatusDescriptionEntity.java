/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

/**
 *
 * @author H
 */
@Entity
@Table(name = "jobStatusDescription")
public class JobStatusDescriptionEntity extends BaseTrackableEntity {

    @Column(name = "jobStatusDescriptionId")
    private Integer jobStatusDescriptionId;
    @Lob
    @Size(max = 65535)
    @Column(name = "jobStatusDescriptionDescription")
    private String jobStatusDescriptionDescription;
    @OneToMany(mappedBy = "jobStatus", fetch = FetchType.LAZY)
    private Collection<JobEntity> jobCollection;

    public Integer getJobStatusDescriptionId() {
        return jobStatusDescriptionId;
    }

    public void setJobStatusDescriptionId(Integer jobStatusDescriptionId) {
        this.jobStatusDescriptionId = jobStatusDescriptionId;
    }

    public String getJobStatusDescriptionDescription() {
        return jobStatusDescriptionDescription;
    }

    public void setJobStatusDescriptionDescription(String jobStatusDescriptionDescription) {
        this.jobStatusDescriptionDescription = jobStatusDescriptionDescription;
    }

    public Collection<JobEntity> getJobCollection() {
        return jobCollection;
    }

    public void setJobCollection(Collection<JobEntity> jobCollection) {
        this.jobCollection = jobCollection;
    }

}
