package org.javasmiths.encodingfarm.worker.web.view;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.worker.web.dto.WorkerDto;
import org.javasmiths.encodingfarm.worker.web.facade.WorkerFacade;
import org.primefaces.event.RowEditEvent;
import javax.faces.application.FacesMessage;
/**
 *
 * @author Elliot
 */
@RequestScoped
@Named("workers")
public class WorkerView {

    
    private String url;
    private List<WorkerDto> list = new LinkedList<>();

    @EJB
    private WorkerFacade facade;

    @PostConstruct
    private void init() {
        list = facade.listAll();
    }
    
    public void remove(String id) {
        facade.remove(id);
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(url);
        list = facade.listAll();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<WorkerDto> getList() {
        return list;
    }

    public void setList(List<WorkerDto> list) {
        this.list = list;
    }

    public WorkerFacade getFacade() {
        return facade;
    }

    public void setFacade(WorkerFacade facade) {
        this.facade = facade;
    }
    
   

    public void onEdit(RowEditEvent event, WorkerDto dto) {              
        /*FacesMessage msg = new FacesMessage("Item Edited",((WorkerDto) event.getObject()).getId());  
        FacesContext.getCurrentInstance().addMessage(null, msg);*/
        facade.update(dto);
        list = facade.listAll();
    }  
       
    public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Editing Cancelled");   
        FacesContext.getCurrentInstance().addMessage(null, msg); 
        
    } 
}