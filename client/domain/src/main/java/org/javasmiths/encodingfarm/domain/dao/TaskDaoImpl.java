/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javasmiths.encodingfarm.domain.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.domain.entity.TaskEntity;

@Stateless
public class TaskDaoImpl extends BaseDaoImpl<TaskEntity> implements TaskDao {
	
	
	@PersistenceContext(unitName = "clientPU")
	protected EntityManager em;

	@Override
	protected EntityManager em() {
		return em;
	} 
	
	@Override
	protected Class<TaskEntity> entityClass() {
            return TaskEntity.class;
	}

	@Override
	public void delete(String id) {
		TaskEntity task = em.getReference(TaskEntity.class, id);
		em.remove(task);
	}
	
}
