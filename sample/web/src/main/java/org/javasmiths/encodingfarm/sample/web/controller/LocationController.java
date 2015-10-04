/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.sample.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.sample.web.dto.LocationDto;
import org.javasmiths.encodingfarm.sample.web.facade.LocationFacade;

/**
 *
 * @author thomas
 */
@Path("locations")
public class LocationController {
	
	@EJB
	private LocationFacade facade;
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<LocationDto> listAll(){
		return facade.listAll();
	}
	
	
}
