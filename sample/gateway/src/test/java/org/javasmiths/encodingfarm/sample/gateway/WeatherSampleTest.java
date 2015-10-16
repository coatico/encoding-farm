package org.javasmiths.encodingfarm.sample.gateway;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import javax.ws.rs.client.ClientBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class WeatherSampleTest {
    
    public WeatherSampleTest() {
    }

    @Test
    public void testSample() {
        ClientBuilder.newBuilder().register(JacksonJsonProvider.class);
        System.out.println("sample");
        WeatherSample instance = new WeatherSample();
       // instance.sample();
    }
    
}
