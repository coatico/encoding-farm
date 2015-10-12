package org.javasmiths.encodingfarm.sample.gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author thomas
 */
public class WeatherSample {

    public void sample() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.openweathermap.org/data/2.5/weather?q=Landen");
        Object o = target.request(MediaType.APPLICATION_JSON).get(Test.class);
    }
    

    public static class Test {

        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
