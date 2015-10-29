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
import org.javasmiths.encodingfarm.manager.web.dto.VideoDto;
import org.javasmiths.encodingfarm.manager.web.facade.VideoFacade;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Alexander Hermans
 */
@RequestScoped
@Named("video")
public class VideoView implements Serializable {

    private String videoTitle;
    private List<VideoDto> list = new LinkedList<>();

    @EJB
    private VideoFacade facade;

    @PostConstruct
    public void init() {
        list = facade.listAll();
    }

    public void create(ActionEvent actionEvent) {
        facade.create(videoTitle);
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

    public String getvideoTitle() {
        return videoTitle;
    }

    public void setvideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public List<VideoDto> getList() {
        return list;
    }

    public void setList(List<VideoDto> list) {
        this.list = list;
    }

    public void deleteById(String id) {
        facade.delete(id);
        list = facade.listAll();
    }

}