package org.javasmiths.encodingfarm.worker.domain.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.javasmiths.encodingfarm.common.domain.dao.BaseDaoImpl;
import org.javasmiths.encodingfarm.worker.domain.entity.JobEntity;

/**
 *
 * @author Pieter
 */
@Stateless
public class JobDaoImpl extends BaseDaoImpl<JobEntity> implements JobDao {

    @PersistenceContext(name = "workerPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }

    @Override
    protected Class<JobEntity> entityClass() {
        return JobEntity.class;
    }
    
    @Override
    public JobEntity findById(String id) {
        return em.find(JobEntity.class, id);
    }
}
