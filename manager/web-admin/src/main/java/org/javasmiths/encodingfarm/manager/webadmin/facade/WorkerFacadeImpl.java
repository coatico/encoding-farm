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
    public void create(String name,Boolean status, String URL) {
        workerService.registerWorker(name, status, URL);
    }
	
	@Override
	public void edit(){
		workerService.editWorker();
	}

    @Override
    public void delete(String id) {
        workerService.deleteWorker(id);
    }

	@Override
    public void disable(String name) {
        workerService.disableWorker(name);
    }

	@Override
    public void enable(String name) {
        workerService.enableWorker(name);
    }

    @Override
    public List<WorkerListDetailDto> listAll() {
        List<WorkerListDetailDto> dtos = new LinkedList<>();
        List<WorkerEntity> workersE = workerService.listAll();
        for (WorkerEntity worker : workersE) {
            WorkerListDetailDto dto = new WorkerListDetailDto();
            dto.setId(worker.getId());
            dto.setName(worker.getName());
			dto.setURL(worker.getURL());
			dto.setStatus(worker.isStatus());
            dtos.add(dto);
        }
        return dtos;
    }

}
