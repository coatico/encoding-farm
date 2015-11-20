/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.web.facade;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.worker.domain.entity.WorkerEntity;
import org.javasmiths.encodingfarm.worker.domain.service.WorkerService;
import org.javasmiths.encodingfarm.worker.web.dto.WorkerDto;

/**
 *
 * @author Elliot
 */
@Stateless
public class WorkerFacadeImpl implements WorkerFacade {

    @EJB
    private WorkerService workerService;

    @Override
    public void create(String url) {
        workerService.registerWorker(url);
    }

    @Override
    public List<WorkerDto> listAll() {
        List<WorkerDto> dtos = new LinkedList<>();
        List<WorkerEntity> workers = workerService.listAll();
        for (WorkerEntity wor : workers) {
            WorkerDto dto = new WorkerDto();
            dto.setId(wor.getId());
            dto.setUrl(wor.getUrl());
            for(JobEntity job: wor.getJobs()) {
                dto.getJobIds().add(job.getId());
            }
            dtos.add(dto);
        }
        return dtos;
    }
    
    public void remove(String id) {
        workerService.remove(id);
    }
    
    public void update(WorkerDto dto) {
        workerService.update(dto.getId(), dto.getUrl());
    }

}