/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.web.dto.UserDto;
import org.javasmiths.encodingfarm.web.facade.UserFacade;

/**
 *
 * @author thomas
 */
@Path("usercontroller")
public class UserController {
	
	@EJB
	private UserFacade facade;
	
	@GET
	@Produces({"application/json", "application/xml"})
	public List<UserDto> listAll(){
		return facade.listAll();
	}
	
	
}
