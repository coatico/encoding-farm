/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.worker.web.dto.RequestDto;
import org.javasmiths.encodingfarm.worker.web.facade.RequestFacade;

/**
 *
 * @author Jeroen
 */
@Path("requests")
public class RequestController {

    @EJB
    private RequestFacade facade;

    @GET
    @Produces({"application/json", "application/xml"})
    public List<RequestDto> listAll() {
        return facade.listAll();
    }
}
