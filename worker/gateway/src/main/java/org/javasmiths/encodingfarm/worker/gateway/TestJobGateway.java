/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Pieter
 */
public class TestJobGateway {
    
    public void test() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/web/worker/jobs");
        Response r = target.request(MediaType.APPLICATION_JSON).post(Entity.json(new TestDto()));
        int i = r.getStatus();
        System.out.println(i);

    }
}
