/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.domain.service;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;

/**
 *
 * @author Quintendockx
 */
public interface JobService {

    JobEntity registerJob(String status);

    List<JobEntity> listAll();
    
    public void remove(String id);
    
    public void update(String id, String status);
}
