package org.javasmiths.encodingfarm.manager.domain.dao;


import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.VideoEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Serneels
 */
public interface VideoDao {
    public void save(VideoEntity dataEntity);
    
    public void delete(String id);
    
    public VideoEntity findById(String id);
    
    public List<VideoEntity> listAll();

}
