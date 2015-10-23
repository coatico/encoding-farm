/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.view;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.web.dto.TaskDto;
import org.javasmiths.encodingfarm.web.facade.TaskFacade;




@RequestScoped
@Named("Tasks")
public class TaskView {
	private List<TaskDto> list = new LinkedList<>();
	private String name;
	
	@EJB
	private TaskFacade facade;
	
	public void create(ActionEvent actionEvent){
		facade.create(name);
		list = facade.listAll();
	}
	

	public List<TaskDto> getList() {
		return list;
	}

	public void setList(List<TaskDto> list) {
		this.list = list;
	}
	
	
	
	
}
