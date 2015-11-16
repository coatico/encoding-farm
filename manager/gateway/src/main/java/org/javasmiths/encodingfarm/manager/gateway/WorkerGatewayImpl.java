/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Arne
 */
public class WorkerGatewayImpl implements WorkerGateway {
    @Override
    public void createWorker() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/web/rest/workers");
        Object o = target.request(MediaType.APPLICATION_JSON).post(Entity.json(new Gway()));
        
    }

    
    public static class Gway {
        
        private long id = 1;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }
     
}
