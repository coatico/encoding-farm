package org.javasmiths.encodingfarm.distributor.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;
import org.javasmiths.encodingfarm.distributor.domain.service.VideoService;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;

@Stateless
public class VideoFacadeImpl implements VideoFacade {

	@EJB
	private VideoService videoService;

	@Override
	public void create(String name, String videopath, String thumbnail, String description) {
		videoService.registerVideo(name, videopath, thumbnail, description);
	}

	@Override
	public List<VideoDto> listAll() {
		List<VideoDto> dtos = new LinkedList<>();
		List<VideoEntity> videosE = videoService.listAll();
		for (VideoEntity video : videosE) {
			VideoDto dto = new VideoDto();
			dto.setId(video.getId());
			dto.setName(video.getName());
                        dto.setVideopath(video.getVideopath());
                        dto.setThumbnail(video.getThumbnail());
                        dto.setDescription(video.getDescription());
			dtos.add(dto);
		}
		return dtos;
	}
	
	public void remove(String id) {
		videoService.remove(id);
	}
	
	public void update(String id) {
		videoService.update(id);
	}
}
