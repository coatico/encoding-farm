/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author Arne
 */
@Stateless
public class WorkerDaoImpl extends BaseDaoImpl<WorkerEntity> implements WorkerDao {

    @PersistenceContext(unitName = "managerPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }
	
	@Override
	public WorkerEntity findById(String id) {
        return em.find(WorkerEntity.class, id);
    }
	
	@Override
	 public void update(WorkerEntity workerEntity) {
        em.merge(workerEntity);
    }
         

    @Override
    protected Class<WorkerEntity> entityClass() {
        return WorkerEntity.class;
    }
}
