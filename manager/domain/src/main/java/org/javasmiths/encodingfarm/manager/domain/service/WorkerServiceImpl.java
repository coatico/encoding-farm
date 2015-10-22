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
import org.javasmiths.encodingfarm.manager.domain.dao.WorkerDaoImpl;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerPageDto;

/**
 *
 * @author Arne Polfliet
 */
@Stateless
public class WorkerServiceImpl implements WorkerService {

    @EJB
    private WorkerDao dao;
    private WorkerDaoImpl daoimpl;
    private WorkerPageDto dto;

    @Override
    public WorkerEntity registerWorker(String name) {
        WorkerEntity workerEntity = new WorkerEntity();
        workerEntity.setName(name);
        dao.save(workerEntity);
        return workerEntity;
    }

    @Override
    public WorkerEntity deleteWorker(String name) {
        WorkerEntity workerEntity = new WorkerEntity();
        String id = dto.getDetail().getId();
        daoimpl.deleteById(id);
        return workerEntity;
    }

   /* @Override
    public WorkerEntity statusWorker(String name) {
        
    }*/

    @Override
    public List<WorkerEntity> listAll() {
        return dao.listAll();
    }

}
