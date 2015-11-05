package org.javasmiths.encodingfarm.client.gateWay;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import javax.ws.rs.client.ClientBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class ClientGatewayTest {
    
    public ClientGatewayTest() {
    }

    @Test
    public void testSample() {
        ClientBuilder.newBuilder().register(JacksonJsonProvider.class);
        System.out.println("sample");
        ClientGateway instance = new ClientGateway();
       // instance.sample();
    }
    
}
