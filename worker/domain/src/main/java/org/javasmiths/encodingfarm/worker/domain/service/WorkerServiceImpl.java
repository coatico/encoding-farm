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
import org.javasmiths.encodingfarm.worker.domain.dao.WorkerDao;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.worker.domain.entity.WorkerEntity;

/**
 *
 * @author Jeroen
 */
@Stateless
public class WorkerServiceImpl implements WorkerService {

    @EJB
    private WorkerDao dao;
    
    @EJB
    private JobDao jDao;
    
    @Override
    public WorkerEntity registerWorker(String url) {
        WorkerEntity re = new WorkerEntity();
        re.setUrl(url);

        dao.save(re);
        return re;
    }
    
    @Override
    public List<WorkerEntity> listAll() {
        return dao.listAll();
    }
    
    @Override
    public void remove(String id) {
        WorkerEntity worker = dao.findById(id);
        if(!worker.getJobs().isEmpty()) {
            for(JobEntity job: worker.getJobs()) {
                jDao.deleteById(job.getId());
            }
        }
        dao.deleteById(worker.getId());
    }
    
    @Override
    public void update(String id, String url) {
        WorkerEntity worker = dao.findById(id);
        worker.setUrl(url);
        dao.save(worker);
    }

  

    
}
