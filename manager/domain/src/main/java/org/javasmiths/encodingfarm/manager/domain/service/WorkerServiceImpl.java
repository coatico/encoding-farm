/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import org.javasmiths.encodingfarm.manager.domain.dao.WorkerDao;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author Arne Polfliet
 */
@ManagedBean(name = "workerServiceImpl")
@Stateless
public class WorkerServiceImpl implements WorkerService {

    @EJB
    private WorkerDao dao;
    private WorkerEntity we;
	
	private final static String[] picker;
	
	   static {
        picker = new String[2];
        picker[0] = "false";
        picker[1] = "true";
    }

    @Override
    public WorkerEntity registerWorker(String name, Boolean status, String URL) {
        WorkerEntity workerEntity = new WorkerEntity();
        workerEntity.setName(name);
        workerEntity.setStatus(status);
		workerEntity.setURL(URL);
        dao.save(workerEntity);
        return workerEntity;
    }
	
	@Override
	public WorkerEntity editWorker(String id, String name, Boolean status, String URL){
		WorkerEntity workerEntity = null;
        
        if(id != null) {
            workerEntity = dao.findById(id);
            
        }
        
        if(workerEntity == null){
            workerEntity = new WorkerEntity();
        }
		
        workerEntity.setName(name);
        workerEntity.setStatus(status);
        workerEntity.setURL(URL);
        dao.update(workerEntity);
			
        return workerEntity;
	}

    @Override
    public WorkerEntity deleteWorker(String id) {
        dao.deleteById(id);
        return null;
    }

    @Override
    public WorkerEntity disableWorker(String name) {
        we.setStatus(false);
        return we;

    }
    @Override
    public WorkerEntity enableWorker(String name) {
        we.setStatus(true);
        return we;

    }

    @Override
    public List<WorkerEntity> listAll() {
        return dao.listAll();
    }

	public static String[] getPicker() {
		return picker;
	}

}
