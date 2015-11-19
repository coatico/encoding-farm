/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;

/**
 *
 * @author thomas
 */
public interface TaskDao {
	
	public void save(TaskEntity taskEntity);
	
	public void delete(String id);

	public List<TaskEntity> listAll();

	public void update(String id, String title, String filePath, String description);
	
}