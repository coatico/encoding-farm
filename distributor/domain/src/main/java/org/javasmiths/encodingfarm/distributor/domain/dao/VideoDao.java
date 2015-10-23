/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.distributor.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.distributor.domain.entity.VideoEntity;

/**
 *
 * @author thomas
 */
public interface VideoDao {

    public void save(VideoEntity dataEntity);

    public List<VideoEntity> listAll();
	
	public VideoEntity findById(String id);
	
	public void delete(VideoEntity e);
}
