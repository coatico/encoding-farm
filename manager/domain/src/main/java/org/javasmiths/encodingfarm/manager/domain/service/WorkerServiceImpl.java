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
public class WorkerServiceImpl implements WorkerService {

    @EJB
    private WorkerDao dao;
    private WorkerEntity we;

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

}
