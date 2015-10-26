/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.domain.dao.FileDao;
import org.javasmiths.encodingfarm.domain.dao.TaskDao;
import org.javasmiths.encodingfarm.domain.entity.FileEntity;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;

@Stateless
public class TaskServiceImpl implements TaskService {
	@EJB
	private TaskDao taskDao;
	
	@EJB
	private FileDao fileDao;

	@Override
	public void registerTask(String title, String filePath, String description) {
		FileEntity fileEntity = new FileEntity(title, filePath, description);
		TaskEntity taskEntity = new TaskEntity(fileEntity);
		save(taskEntity, fileEntity);
	}

	private void save(TaskEntity taskEntity, FileEntity fileEntity) {
		taskDao.save(taskEntity);
		fileDao.save(fileEntity);
	}
	
	@Override
	public List<TaskEntity> listAll() {
		return taskDao.listAll();
	}

}
