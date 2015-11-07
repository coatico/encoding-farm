/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.view;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.manager.web.dto.WorkerDto;
import org.javasmiths.encodingfarm.manager.web.facade.WorkerFacade;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Alexander Hermans
 */
@RequestScoped
@Named("worker")
public class WorkerView implements Serializable{
	
	private String workerName;
    private List<WorkerDto> list = new LinkedList<>();
    
	@EJB
    private WorkerFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(workerName);
        list = facade.listAll();
    }

    public void delete(String id) {
        facade.delete(id);
        list = facade.listAll();
    }

    public void update(String id, String videoTitle) {
        facade.update(id, videoTitle);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getworkerName() {
        return workerName;
    }

    public void setworkerName(String workerName) {
        this.workerName = workerName;
    }

    public List<WorkerDto> getList() {
        return list;
    }

    public void setList(List<WorkerDto> list) {
        this.list = list;
    }

    public void deleteById(String id) {
        facade.delete(id);
        list = facade.listAll();
    }
	
}
