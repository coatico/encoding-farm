/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.dao.WorkerDao;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;


/**
 *
 * @author Arne Polfliet
 */
@Stateless
public class WorkerServiceImpl implements WorkerService{
    
    @EJB
    private WorkerDao dao;
    
    @Override
    public WorkerEntity registerWorker(String name) {
       WorkerEntity workerEntity = new WorkerEntity();
       workerEntity.setFirstName(name);
       dao.save(workerEntity);
       return workerEntity;
    }

	@Override
	public List<WorkerEntity> listAll() {
		return dao.listAll();
	}
    
}