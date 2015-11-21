/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.manager.domain.dao.JobDao;

/**
 *
 * @author Elias Serneels
 */
@Stateless
public class JobServiceImpl implements JobService {

    @EJB
    private JobDao dao;

    
    
    
    
    @Override
    public JobEntity registerJob(String title, Date creationdate, String workerID, String videoID) {
        JobEntity jobEntity = new JobEntity();
        jobEntity.setJobTitle(title);
        jobEntity.setJobCreationDateTime(creationdate);
        jobEntity.setWorkerID(workerID);
        jobEntity.setVideoID(videoID);
        dao.save(jobEntity);
        return jobEntity;
    }

    @Override
    public JobEntity deleteJob(String id) {
        dao.delete(id);
        return null;
    }

    @Override
    public JobEntity updateJob(String id, String title, Date creationdate, String workerID, String videoID) {
        JobEntity je = dao.findById(id);

        je.setJobTitle(title);
        je.setJobCreationDateTime(creationdate);
        je.setWorkerID(workerID);
        je.setVideoID(videoID);
        dao.save(je);
        return je;
    }

    @Override
    public List<JobEntity> listAll() {
        return dao.listAll();
    }

}
