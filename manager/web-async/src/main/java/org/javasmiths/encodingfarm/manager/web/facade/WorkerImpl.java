/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.WorkerEntity;

import org.javasmiths.encodingfarm.manager.domain.service.WorkerService;
import org.javasmiths.encodingfarm.manager.web.dto.WorkerDto;


@Stateless
public class WorkerImpl implements WorkerFacade{
	
	 @EJB
    private WorkerService workerService;

    @Override
    public void create(String name, Boolean status, String URL) {
        workerService.registerWorker(name,status,URL);
    }

    @Override
    public void delete(String id) {

        workerService.deleteWorker(id);
    }

    @Override
    public void update(String id, String name, Boolean status, String URL) {
        workerService.editWorker(id, name, status, URL);
    }

    @Override
    public List<WorkerDto> listAll() {
        List<WorkerDto> dtos = new LinkedList<>();
        List<WorkerEntity> workerE = workerService.listAll();
        for (WorkerEntity worker : workerE) {
            WorkerDto dto = new WorkerDto();
            dto.setId(worker.getId());
            dto.setWorkerName(worker.getWorkerName());
            dtos.add(dto);
        }
        return dtos;
    }
    
}
