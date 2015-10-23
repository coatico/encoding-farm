/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.domain.dao.TaskDao;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;

@Stateless
public class TaskServiceImpl implements TaskService {
	@EJB
	private TaskDao dao;

	@Override
	public void registerTask() {
		TaskEntity taskEntity = new TaskEntity();
	}

	@Override
	public List<TaskEntity> listAll() {
		return dao.listAll();
	}

}
