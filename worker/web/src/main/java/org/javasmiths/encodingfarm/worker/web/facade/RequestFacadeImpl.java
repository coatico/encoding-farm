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
import org.javasmiths.encodingfarm.worker.domain.entity.RequestEntity;
import org.javasmiths.encodingfarm.worker.domain.service.RequestService;
import org.javasmiths.encodingfarm.worker.web.dto.RequestDto;

/**
 *
 * @author Quintendockx
 */
@Stateless
public class RequestFacadeImpl implements RequestFacade {

    @EJB
    private RequestService requestService;

    @Override
    public void create(String path) {
        requestService.registerRequest(path);
    }

    @Override
    public List<RequestDto> listAll() {
        List<RequestDto> dtos = new LinkedList<>();
        List<RequestEntity> requests = requestService.listAll();
        for (RequestEntity req : requests) {
            RequestDto dto = new RequestDto();
            dto.setId(req.getId());
            dto.setPath(req.getPath());
            for(JobEntity job: req.getJobs()) {
                dto.getJobIds().add(job.getId());
            }
            dtos.add(dto);
        }
        return dtos;
    }
    
    public void remove(String id) {
        requestService.remove(id);
    }
    
    public void update(RequestDto dto) {
        requestService.update(dto.getId(), dto.getPath());
    }

}
