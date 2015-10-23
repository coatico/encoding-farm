/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.web.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;
import org.javasmiths.encodingfarm.distributor.web.facade.VideoFacadeImpl;

/**
 *
 * @author thomas
 */
@Path("videos")
public class VideoController {
	
private VideoDto dto;

    @EJB
    private VideoFacadeImpl facade;

    @GET
    @Produces({"application/json", "application/xml"})
    public List<VideoDto> listAll() {
        return facade.listAll();
    }

	@PostConstruct
    public void init() {

        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String editId = req.getParameter("edit");
        String deleteId = req.getParameter("delete");
        dto = VideoFacadeImpl.loadVideoOverviewPage(editId, deleteId);

    }

    public String add() {

        VideoFacadeImpl.add(dto);

        //forces page to refresh
        return "video.xhtml?faces-redirect=true";
      
    }

    public VideoDto getDto() {
        return dto;
    }

    public void setDto(VideoDto dto) {
        this.dto = dto;
    }

}
	
	

