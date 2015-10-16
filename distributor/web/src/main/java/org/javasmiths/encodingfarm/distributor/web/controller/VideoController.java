/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;
import org.javasmiths.encodingfarm.distributor.web.facade.VideoFacade;

/**
 *
 * @author thomas
 */
@Path("videos")
public class VideoController {
	
	@EJB
	private VideoFacade facade;
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<VideoDto> listAll(){
		return facade.listAll();
	}
	
	
}
