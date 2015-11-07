/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

/**
 *
 * @author Arne
 */
public interface WorkerDao {

    public void save(WorkerEntity dataEntity);

<<<<<<< HEAD
    public void deleteById(String id);

	public WorkerEntity findById(String id);
	
	public void update(WorkerEntity workerEntity);

	
    public List<WorkerEntity> listAll();
=======
    
    public void delete(String id);
    
    public WorkerEntity findById(String id);
    
    public void update(WorkerEntity dataEntity);
    	
		public List<WorkerEntity> listAll();
>>>>>>> refs/remotes/origin/Manager-async

}
