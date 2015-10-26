/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name="TASKS")
public class TaskEntity extends BaseTrackableEntity implements Serializable {
	
	@ManyToOne(fetch = FetchType.LAZY)
        private FileEntity fileEntity;
        private boolean taskState;
		
	public TaskEntity(FileEntity fileEntity){
		this.fileEntity = fileEntity;
		this.taskState = false;
	}

	public FileEntity getFileEntity() {
		return fileEntity;
	}

	public void setFileEntity(FileEntity fileEntity) {
		this.fileEntity = fileEntity;
	}

	public boolean isState() {
		return taskState;
	}

	public void setState(boolean state) {
		this.taskState = state;
	}
	
	
}
