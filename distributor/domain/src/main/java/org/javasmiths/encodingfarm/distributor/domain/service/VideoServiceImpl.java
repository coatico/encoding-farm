package org.javasmiths.encodingfarm.distributor.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.distributor.domain.dao.VideoDao;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

@Stateless
public class VideoServiceImpl implements VideoService {

    @EJB
    private VideoDao dao;

    @Override
    public VideoEntity registerVideo(String name, String videopath, String thumbnail, String description) {
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setName(name);
        videoEntity.setVideopath(videopath);
        videoEntity.setThumbnail(thumbnail);
        videoEntity.setDescription(description);
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
