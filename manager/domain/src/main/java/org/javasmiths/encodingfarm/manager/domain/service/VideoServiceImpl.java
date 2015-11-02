/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.dao.VideoDao;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;

/**
 *
 * @author Elias Serneels
 */
@Stateless
public class VideoServiceImpl implements VideoService {

    @EJB
    private VideoDao dao;

    @Override
    public VideoEntity registerVideo(String title, String videoLink, String videoCode, String videoDescription) {
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setVideoTitle(title);
        videoEntity.setVideoCode(videoCode);
        videoEntity.setVideoDescription(videoDescription);
        videoEntity.setVideoLink(videoLink);
        dao.save(videoEntity);
        return videoEntity;
    }

    @Override
    public VideoEntity deleteVideo(String id) {
        dao.delete(id);
        return null;
    }

    @Override
    public VideoEntity updateVideo(String id, String title, String videoLink, String videoCode, String videoDescription) {
        VideoEntity ve = dao.findById(id);

        ve.setVideoTitle(title);
        ve.setVideoLink(videoLink);
        ve.setVideoCode(videoCode);
        ve.setVideoDescription(videoDescription);
        dao.save(ve);
        return ve;
    }

    @Override
    public List<VideoEntity> listAll() {
        return dao.listAll();
    }

}
