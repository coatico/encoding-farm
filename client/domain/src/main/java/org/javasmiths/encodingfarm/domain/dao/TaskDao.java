/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.dao;

import org.javasmiths.encodingfarm.domain.entity.TaskEntity;

/**
 *
 * @author thomas
 */
public interface TaskDao {
	
	public void save(TaskEntity taskEntity);
	
}
