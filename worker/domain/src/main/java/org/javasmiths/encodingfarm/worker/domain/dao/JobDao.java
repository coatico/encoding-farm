package org.javasmiths.encodingfarm.worker.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;

/**
 *
 * @author Pieter
 */
public interface JobDao {

    public void save(JobEntity dataEntity);

    public List<JobEntity> listAll();

}
