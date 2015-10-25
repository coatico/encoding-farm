package org.javasmiths.encodingfarm.distributor.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

public interface VideoService {

    VideoEntity registerVideo(String name, String path, String thumbnail, String description);

    List<VideoEntity> listAll();
	
	public void remove(String id);
}
