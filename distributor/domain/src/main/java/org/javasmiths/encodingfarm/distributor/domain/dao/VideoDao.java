package org.javasmiths.encodingfarm.distributor.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

public interface VideoDao {

    public void save(VideoEntity dataEntity);

    public List<VideoEntity> listAll();
	
	public VideoEntity findById(String id);
	
	public void delete(VideoEntity e);
}
