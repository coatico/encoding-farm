/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.PathEntity;

/**
 *
 * @author Pieter
 */
public interface PathDao {
    
    public void save(PathEntity dataEntity);
    
    public List<PathEntity> listAll();
    
}
