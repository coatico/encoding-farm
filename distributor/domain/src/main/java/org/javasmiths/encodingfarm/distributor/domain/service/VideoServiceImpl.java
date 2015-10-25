/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.distributor.domain.dao.VideoDao;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

/**
 *
 * @author thomas
 */
@Stateless
public class VideoServiceImpl implements VideoService {

    @EJB
    private VideoDao dao;

    @Override
    public VideoEntity registerVideo(String name, String path, String thumbnail) {
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setName(name);
        videoEntity.setPath(path);
        videoEntity.setThumbnail(thumbnail);
        dao.save(videoEntity);
        return videoEntity;
    }

    @Override
    public List<VideoEntity> listAll() {
        return dao.listAll();
    }
	
	public void remove(String id) {
		dao.delete(dao.findById(id));
	}

}
