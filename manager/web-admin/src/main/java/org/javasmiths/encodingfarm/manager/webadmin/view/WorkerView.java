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
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.manager.domain.service.WorkerServiceImpl;
import org.javasmiths.encodingfarm.manager.webadmin.facade.WorkerFacade;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerListDetailDto;

/**
 *
 * @author thomas
 */
@RequestScoped
@Named("worker")
public class WorkerView implements Serializable{

    private String name;
    private List<WorkerListDetailDto> list = new LinkedList<>();
	private boolean status;  
	private String URL;
	
	
	@ManagedProperty("#{workerServiceImpl}")
    private WorkerServiceImpl service;

    @EJB
    private WorkerFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(name, status, URL);
        list = facade.listAll();
    }
	
	 
	public void edit(org.primefaces.event.CellEditEvent Event){
		int rowIndex = Event.getRowIndex();
		String Id = list.get(rowIndex).getId();
		String Name = list.get(rowIndex).getName();
		Boolean Status = list.get(rowIndex).isStatus();
		String URl = list.get(rowIndex).getURL();
		facade.edit(Id, Name, Status, URL);
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

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

    public List<WorkerListDetailDto> getList() {
        return list;
    }

    public void setList(List<WorkerListDetailDto> list) {
        this.list = list;
    }

	public void setService(WorkerServiceImpl service) {
		this.service = service;
	}

	
	//ik heb een speciale service variable aangemaakt die normaal zou verwijzen naar WorkerServiceImpl maar hij wilt deze niet gebruiken
	 public String[] getPicker() {
        return service.getPicker();
    }
}
