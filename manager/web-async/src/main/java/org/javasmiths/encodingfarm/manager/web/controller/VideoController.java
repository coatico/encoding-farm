package org.javasmiths.encodingfarm.manager.web.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.javasmiths.encodingfarm.manager.web.dto.VideoDto;
import org.javasmiths.encodingfarm.manager.web.facade.VideoFacade;

/**
 *
 * @author Alexander Hermans
 */
@Path("videos")
public class VideoController {

    @EJB
    private VideoFacade facade;

    @GET
    @Produces({"application/json", "application/xml"})
    public List<VideoDto> listAll() {
        return facade.listAll();
    }

}
