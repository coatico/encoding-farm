/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.domain.service;

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
    public JobEntity registerJob(String title) {
        JobEntity jobEntity = new JobEntity();
        jobEntity.setJobTitle(title);
        dao.save(jobEntity);
        return jobEntity;
    }

    @Override
    public JobEntity deleteJob(String id) {
        dao.delete(id);
        return null;
    }

    @Override
    public JobEntity updateJob(String id, String title) {
        JobEntity je = dao.findById(id);

        je.setJobTitle(title);
        dao.save(je);
        return je;
    }

    @Override
    public List<JobEntity> listAll() {
        return dao.listAll();
    }

}
