package org.javasmiths.encodingfarm.worker.domain.dao;

import java.util.List;
import org.javasmiths.encodingfarm.worker.domain.entity.WorkerEntity;

/**
 *
 * @author Pieter
 */
public interface WorkerDao {

    public void save(WorkerEntity dateEntity);

    public List<WorkerEntity> listAll();
    
    public WorkerEntity findById(String id);
    
    public void deleteById(String id);
}
