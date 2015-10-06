/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.javasmiths.encodingfarm.common.domain.entity.BaseTrackableEntity;

@Entity
@Table(name = "FILES")
public class FileEntity extends BaseTrackableEntity implements Serializable {
	
	@Column
	private String filePath;
	
	public String getPath() {
		return filePath;
	}
	
	public void setPath(String path) {
		this.filePath = path;
	}
	
	
}
