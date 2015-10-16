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
import org.javasmiths.encodingfarm.worker.domain.service.JobService;
import org.javasmiths.encodingfarm.worker.web.dto.JobDto;

/**
 *
 * @author Quintendockx
 */
@Stateless
public class JobFacadeImpl implements JobFacade {
    
        @EJB
	private JobService jobService;
	
	@Override
	public void create(RequestEntity requestEntity, String videoPath) {
		jobService.registerJob(requestEntity,videoPath);
	}
	

        @Override   
	public List<JobDto> listAll() {
		List<JobDto> dtos = new LinkedList<>();
		List<JobEntity> JobE =  jobService.listAll();
		for (JobEntity Job : JobE) {
			JobDto dto = new JobDto();
			dto.setId(Job.getId());
			dto.setStatus(Job.getStatus());
			dtos.add(dto);
		}
		return dtos;
	}

	
	
	
}

