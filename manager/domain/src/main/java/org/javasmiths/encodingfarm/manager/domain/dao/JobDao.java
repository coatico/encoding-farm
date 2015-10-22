package org.javasmiths.encodingfarm.manager.domain.dao;


import java.util.List;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Serneels
 */
public interface JobDao {
    public void save(JobEntity dataEntity);
    
    public void deleteById(String id);
    
     public JobEntity findById(String id);
    
		public List<JobEntity> listAll();

}
