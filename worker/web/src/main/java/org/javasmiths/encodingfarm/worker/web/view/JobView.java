/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.view;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.javasmiths.encodingfarm.worker.web.dto.JobDto;
import org.javasmiths.encodingfarm.worker.web.facade.JobFacade;

/**
 *
 * @author Quintendockx
 */
@RequestScoped
@Named("job")
public class JobView {
    private String status;
    private List<JobDto> list = new LinkedList<>();

    @EJB
    private JobFacade facade;
    
    @PostConstruct
    private void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(status);
        list = facade.listAll();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<JobDto> getList() {
        return list;
    }

    public void setList(List<JobDto> list) {
        this.list = list;
    }

    public JobFacade getFacade() {
        return facade;
    }

    public void setFacade(JobFacade facade) {
        this.facade = facade;
    }

}
