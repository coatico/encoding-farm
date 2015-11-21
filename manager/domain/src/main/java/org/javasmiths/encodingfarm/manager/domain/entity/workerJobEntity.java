/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.entity;

import java.io.Serializable;
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
@Table(name = "WORKERJOB")
public class workerJobEntity extends BaseTrackableEntity implements Serializable {

    @Column(name = "workerJobTitle")
    @Type(type = "text")
    private String workerJobTitle;

    public String getWorkerJobTitle() {
        return workerJobTitle;
    }

    public void setWorkerJobTitle(String workerJobTitle) {
        this.workerJobTitle = workerJobTitle;
    }

}
