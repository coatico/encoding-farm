/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Arne
 */
public class Worker {
    public void gway() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("");
        Object o = target.request(MediaType.APPLICATION_JSON).get(Gway.class);
        System.out.println("o");
        
    }
    

    public static class Gway {

        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
