package org.javasmiths.encodingfarm.distributor.web.facade;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;

public interface VideoFacade {

    public void create(String name, String videopath, String thumbnail, String description);

    public List<VideoDto> listAll();
	
	public void remove(String id);
        public void upload();

}
