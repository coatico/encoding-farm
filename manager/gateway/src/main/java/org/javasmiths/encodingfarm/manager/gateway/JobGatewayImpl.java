/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.gateway;

import dto.JobDto;
import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;

/**
 *
 * @author Elias Serneels
 */
public class JobGatewayImpl implements JobGateway {

    @Override
    public void convert(JobEntity job) {
        /*Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/web/worker/jobs");
        Response r = target.request(MediaType.APPLICATION_JSON).post(Entity.json(new JobDto(job.getJobTitle())));
        System.out.println(r.getStatus());*/
    }
    
    @Override
    public void testConvert(String str) {
        System.out.println("EUREKA!");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/web/worker/jobs");
        Response r = target.request(MediaType.APPLICATION_JSON).post(Entity.json(new JobDto(str)));
        System.out.println(r.getStatus());        
    }
}
