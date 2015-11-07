/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;
import org.javasmiths.encodingfarm.manager.domain.service.VideoService;
import org.javasmiths.encodingfarm.manager.web.dto.VideoDto;

/**
 *
 * @author Alexander Hermans
 */
@Stateless
public class VideoFacadeImpl implements VideoFacade {

    @EJB
    private VideoService videoService;

    @Override
    public void create(String videoTitle, String videoLink, String videoCode, String videoDescription) {
        videoService.registerVideo(videoTitle, videoLink, videoCode, videoDescription);
    }

    @Override
    public void delete(String id) {

        videoService.deleteVideo(id);
    }

    @Override
    public void update(String id, String title, String videoLink, String videoCode, String videoDescription) {
        videoService.updateVideo(id, title, videoLink, videoCode, videoDescription);
    }

    @Override
    public List<VideoDto> listAll() {
        List<VideoDto> dtos = new LinkedList<>();
        List<VideoEntity> videoE = videoService.listAll();
        for (VideoEntity video : videoE) {
            VideoDto dto = new VideoDto();
            dto.setId(video.getId());
            dto.setVideoTitle(video.getVideoTitle());
             dto.setVideoLink(video.getVideoLink());
            dto.setVideoCode(video.getVideoCode());
            dto.setVideoDescription(video.getVideoDescription());
            dtos.add(dto);
        }
        return dtos;
    }

}
