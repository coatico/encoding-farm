/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.webadmin.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.javasmiths.encodingfarm.manager.webadmin.facade.WorkerFacade;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerListDetailDto;

/**
 *
 * @author Arne
 */
@Path("workers")
public class WorkerController {

    @EJB
    private WorkerFacade facade;

    @GET
    @Produces({"application/json", "application/xml"})
    public List<WorkerListDetailDto> listAll() {
        return facade.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String createJob(JsonObject json) {
        String name = json.getString("name");
        Boolean status = json.getBoolean("status");
        String url = json.getString("url");
        facade.create(name, status, url);
        return "created job with name: " + name + ", status " + status + " and url " + url;
    }

}
