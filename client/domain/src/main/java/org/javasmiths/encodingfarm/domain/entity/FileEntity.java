/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name = "FILES")
public class FileEntity extends BaseTrackableEntity implements Serializable {
	
        @OneToMany(mappedBy = "fileEntity", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
        private List<TaskEntity> taskList;
		private String filePath;
        private String fileTitle;
        private String fileDescription;
		
	public FileEntity(String title, String filePath, String desc){
		this.filePath = filePath;
		this.fileDescription = desc;
		this.fileTitle = title;
	}	
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

    public List<TaskEntity> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskEntity> taskList) {
        this.taskList = taskList;
    }   

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }
	
}
