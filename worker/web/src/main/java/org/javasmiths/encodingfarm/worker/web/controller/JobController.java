/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.worker.gateway.VideoConverterGateway;
import org.javasmiths.encodingfarm.worker.web.dto.JobDto;
import org.javasmiths.encodingfarm.worker.web.facade.JobFacade;

/**
 *
 * @author Jeroen
 */
@Path("/jobs")
public class JobController {

    @EJB
    private JobFacade facade;

    
    @GET
    @Path("/get")
    @Produces({"application/json", "application/xml"})
    public List<JobDto> listAll() {
        return facade.listAll();
    }
    
    //http://localhost:8080/web/worker/jobs/post
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    //@Produces({"application/json"})
    public void addJob(String path){
       
        //return "haha";
    }
}
