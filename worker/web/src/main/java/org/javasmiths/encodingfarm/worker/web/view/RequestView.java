/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.view;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.worker.web.dto.RequestDto;
import org.javasmiths.encodingfarm.worker.web.facade.RequestFacade;

/**
 *
 * @author Quintendockx
 */
@RequestScoped
@Named("request")
public class RequestView {
    
    
     private String id;
     private String video_path;
     private List <RequestDto> list= new LinkedList<>();

@EJB
	private RequestFacade facade;
	

	@PostConstruct
	public void init(){
		list = facade.listAll();
	}
	
	public void create(ActionEvent actionEvent){
		facade.create(id);
		list = facade.listAll();
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideo_path() {
        return video_path;
    }

    public void setVideo_path(String video_path) {
        this.video_path = video_path;
    }

    public List<RequestDto> getList() {
        return list;
    }

    public void setList(List<RequestDto> list) {
        this.list = list;
    }

    public RequestFacade getFacade() {
        return facade;
    }

    public void setFacade(RequestFacade facade) {
        this.facade = facade;
    }




}
