/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.view;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.web.dto.TaskDto;
import org.javasmiths.encodingfarm.web.facade.TaskFacade;




@RequestScoped
@Named("tasks")
public class TaskView {
	private List<TaskDto> list = new LinkedList<>();
	private String name;
	
	private String title;
	private String filePath;
	private String description;
	
	@EJB
	private TaskFacade facade;
	
	@PostConstruct
	public void init(){
		list = facade.listAll();
	}
	
	public void createTask(ActionEvent actionEvent) {
		facade.createTask(title, filePath, description);
                title="";
                filePath="";
                description="";
		list = facade.listAll();
	}
	
	public void deleteTask(String id) {
		facade.deleteTask(id);
		list = facade.listAll();
	}
	
	public void updateTask(String id, String title, String filePath, String description) {
		facade.updateTask(id, title, filePath, description);
		list = facade.listAll();
	}

	public String getTitle() {
		return title;
	}

	public String getFilePath() {
		return filePath;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public List<TaskDto> getList() {
		return list;
	}

	public void setList(List<TaskDto> list) {
		this.list = list;
	}
	
	
	
	
}
