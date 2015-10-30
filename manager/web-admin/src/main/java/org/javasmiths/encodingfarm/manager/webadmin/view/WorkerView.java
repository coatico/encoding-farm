/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.webadmin.view;

/**
 *
 * @author Arne
 */
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.manager.webadmin.facade.WorkerFacade;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerListDetailDto;

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("worker")
public class WorkerView {

    private String name;
    private List<WorkerListDetailDto> list = new LinkedList<>();
	private boolean status;  

    @EJB
    private WorkerFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(name);
        list = facade.listAll();
    }

    public void delete(ActionEvent actionEvent) {
        facade.delete(name);
        list = facade.listAll();
    }

    public void disable(ActionEvent actionEvent) {
        facade.disable(name);
        list = facade.listAll();
    }

    public void enable(ActionEvent actionEvent) {
		facade.enable(name);
        list = facade.listAll();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

    public List<WorkerListDetailDto> getList() {
        return list;
    }

    public void setList(List<WorkerListDetailDto> list) {
        this.list = list;
    }

}
