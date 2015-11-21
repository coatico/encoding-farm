/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.manager.web.facade;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.javasmiths.encodingfarm.manager.domain.entity.JobEntity;
import org.javasmiths.encodingfarm.manager.domain.service.JobService;
import org.javasmiths.encodingfarm.manager.web.dto.JobDto;

/**
 *
 * @author thomas
 */
@Stateless
public class JobFacadeImpl implements JobFacade {

    @EJB
    private JobService jobService;

    @Override
    public void create(String jobTitle, Date creationdate, String workerID, String videoID) {
        jobService.registerJob(jobTitle, creationdate, workerID, videoID);
    }

    @Override
    public void delete(String id) {

        jobService.deleteJob(id);
    }

    @Override
    public void update(String id, String title, Date creationdate, String workerID, String videoID) {
        jobService.updateJob(id, title, creationdate, workerID, videoID);
    }

    @Override
    public List<JobDto> listAll() {
        List<JobDto> dtos = new LinkedList<>();
        List<JobEntity> jobsE = jobService.listAll();
        for (JobEntity job : jobsE) {
            JobDto dto = new JobDto();
            dto.setId(job.getId());
            dto.setjobTitle(job.getJobTitle());
            dto.setJobCreationDateTime(job.getJobCreationDateTime());
            dto.setId(job.getWorkerID());
            dto.setId(job.getVideoID());

            dtos.add(dto);
        }
        return dtos;
    }
    
    @Override
    public void gw() {
        jobService.gw();
    }

}
