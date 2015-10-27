package org.javasmiths.encodingfarm.distributor.web.controller;

import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;

/**
 *
 * @author Coati
 */
@Path("mock-client")
public class MockClientController {
    @GET
    @Produces({"application/json", "application/xml"})
    public List<VideoDto> listAll() {
        return new LinkedList<>();
    }
    @POST
    @Consumes({"application/json", "application/xml"})
    public void addVideo(VideoDto dto) {
        System.out.println("Joepie!");
    }
    
}
