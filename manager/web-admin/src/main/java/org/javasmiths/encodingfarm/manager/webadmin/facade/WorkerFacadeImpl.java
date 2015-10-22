/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.webadmin.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;
import org.javasmiths.encodingfarm.manager.domain.service.WorkerService;
import org.javasmiths.encodingfarm.manager.webadmin.model.WorkerListDetailDto;

/**
 *
 * @author Arne
 */
@Stateless
public class WorkerFacadeImpl implements WorkerFacade {

    @EJB
    private WorkerService workerService;

    @Override
    public void create(String name) {
        workerService.registerWorker(name);
    }

    @Override
    public void delete(String name) {
        workerService.deleteWorker(name);
    }

    @Override
    public void status(String name) {
        workerService.statusWorker(name);
    }

    @Override
    public List<WorkerListDetailDto> listAll() {
        List<WorkerListDetailDto> dtos = new LinkedList<>();
        List<WorkerEntity> workersE = workerService.listAll();
        for (WorkerEntity worker : workersE) {
            WorkerListDetailDto dto = new WorkerListDetailDto();
            dto.setId(worker.getId());
            dto.setName(worker.getName());
            dtos.add(dto);
        }
        return dtos;
    }

}
