/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;
import org.javasmiths.encodingfarm.distributor.domain.service.VideoService;
import org.javasmiths.encodingfarm.distributor.web.dto.VideoDto;

/**
 *
 * @author thomas
 */
@Stateless
public class VideoFacadeImpl implements VideoFacade{

	@EJB
	private VideoService videoService;
	
	@Override
	public void create(String name) {
		videoService.registerVideo(name);
	}

	@Override
	public List<VideoDto> listAll() {
		List<VideoDto> dtos = new LinkedList<>();
		List<VideoEntity> videosE =  videoService.listAll();
		for (VideoEntity video : videosE) {
			VideoDto dto = new VideoDto();
			dto.setId(video.getId());
			dto.setName(video.getName());
			dtos.add(dto);
		}
		return dtos;
	}
	
	
	
}