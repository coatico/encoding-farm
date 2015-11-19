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
	public TaskEntity registerTask(String title, String filePath, String description) {
		FileEntity fileEntity = new FileEntity(title, filePath, description);
		TaskEntity taskEntity = new TaskEntity(fileEntity);
		save(taskEntity, fileEntity);
                return taskEntity;
	}

	private void save(TaskEntity taskEntity, FileEntity fileEntity) {
            fileDao.save(fileEntity);
            taskDao.save(taskEntity);
	}
	
	@Override
	public List<TaskEntity> listAll() {
		return taskDao.listAll();
	}
	
	@Override
	public void deleteTask(String id) {
		taskDao.delete(id);
	}

	@Override
	public void updateTask(String id, String title, String filePath, String description) {
		taskDao.update(id, title, filePath, description);
	}
	
	
}