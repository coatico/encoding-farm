/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.dto;

/**
 *
 * @author thomas
 */
public class TaskDto {
	private String id;
	private boolean taskState;
	private FileDto fileDto;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isTaskState() {
		return taskState;
	}

	public void setTaskState(boolean taskState) {
		this.taskState = taskState;
	}

	public FileDto getFileDto() {
		return fileDto;
	}

	public void setFileDto(FileDto fileDto) {
		this.fileDto = fileDto;
	}
	
	
}
