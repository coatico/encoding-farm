/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.worker.domain.dao.JobDao;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;


/**
 *
 * @author Quintendockx
 */
@Stateless
public class JobServiceImpl implements JobService{
    
@EJB
    private JobDao dao; 
  
@Override
    public JobEntity registerJob(RequestEntity request, String status) {
       JobEntity jobEntity = new JobEntity();
       jobEntity.setRequest(request);
       jobEntity.setStatus(status);
       
       dao.save(jobEntity);
       return jobEntity;
    }

	@Override
	public List<JobEntity> listAll() {
		return dao.listAll();
	}
	
	
    
    
}

