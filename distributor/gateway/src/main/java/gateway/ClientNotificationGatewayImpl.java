/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.javasmiths.encodingfarm.distributor.domain.gateway.ClientNotificationGateway;

/**
 *
 * @author Pieter
 */
public class ClientNotificationGatewayImpl implements ClientNotificationGateway {

    @Override
    public void notifyVideoReady() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/web/rest/videos");
        Object o = target.request(MediaType.APPLICATION_JSON).post(Entity.json(new Test()));

    }
    
    public static class Test {

        private String id = "001";

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}
