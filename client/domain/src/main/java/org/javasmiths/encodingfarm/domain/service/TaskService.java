/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;


public interface TaskService {

	public TaskEntity registerTask(String title, String filePath, String description);

	public List<TaskEntity> listAll();

	public void deleteTask(String id);
		
}
